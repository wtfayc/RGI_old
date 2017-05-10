package com.ayc.rgi.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

/**Basic TileEntity with Description Packet logic > IMachineHandler + updateConstructor > ISidedInventory*/
public class BTE_1_0_SI extends BTE_0_1_Machine implements ISidedInventory{
	
	protected ItemStack[] stacksI;
	
	protected BTE_1_0_SI (int guiID, int inventorySize)
	{
		super(guiID);
		stacksI = new ItemStack[inventorySize];
	}
	
	@Override
    public void writeToNBT(NBTTagCompound nbt)
    {
        super.writeToNBT(nbt);
        NBTTagList tagItems = new NBTTagList();
        for(int i = 0; i < stacksI.length; i++) 
        {
            if(stacksI[i] != null) 
            {
            	NBTTagCompound tagItem = new NBTTagCompound();
                tagItem.setByte("slot", (byte)i);
                stacksI[i].writeToNBT(tagItem);
                tagItems.appendTag(tagItem);
            }
        }
        nbt.setTag("items", tagItems);
    }
	
 	@Override
    public void readFromNBT(NBTTagCompound nbt)
    {
        super.readFromNBT(nbt);
        NBTTagList tagItems = nbt.getTagList("items", 10);
        for(int i = 0; i < tagItems.tagCount(); i++) 
        {
        	NBTTagCompound tagItem = tagItems.getCompoundTagAt(i);
        	byte index = tagItem.getByte("slot");
        	if(index >= 0 && index < stacksI.length)
        		stacksI[index] = ItemStack.loadItemStackFromNBT(tagItem);
        }
    }
	
	//=====================================ISidedInventory=====================================
 	public int getSizeInventory() 
 	{
 		return stacksI.length;
	}
		
 	public ItemStack getStackInSlot(int slot) 
 	{
 		return this.stacksI[slot];
	}
		
 	public ItemStack decrStackSize(int slot, int amount) 
 	{
 		if (this.stacksI != null)
 		{
 			ItemStack itemstack;
 			
 			if (this.stacksI[slot].stackSize <= amount)
 			{
 				itemstack = this.stacksI[slot];
 				this.stacksI[slot] = null;
 				this.markDirty();
 				return itemstack;
			}
 			else
 			{
 				itemstack = this.stacksI[slot].splitStack(amount);
 				
 				if (this.stacksI[slot].stackSize == 0)
 				{
 					this.stacksI[slot] = null;
				}
					
 				this.markDirty();
 				return itemstack;
			}
		}
 		else
 		{
 			return null;
		}
	}
				
 	public ItemStack getStackInSlotOnClosing(int slot) 
 	{
 		if (this.stacksI[slot] != null)
 		{
 			ItemStack itemstack = this.stacksI[slot];
 			this.stacksI[slot] = null;
 			return itemstack;
		}
 		else
 		{
 			return null;
		}
	}
		
 	public void setInventorySlotContents(int slot, ItemStack stack) 
 	{
 		this.stacksI[slot] = stack;
 		
 		if (stack != null && stack.stackSize > this.getInventoryStackLimit())
 		{
 			stack.stackSize = this.getInventoryStackLimit();
		}
 		
 		this.markDirty();		
	}
		
 	//Overridable
 	public String getInventoryName() 
 	{
 		return null;
	}
		
 	public boolean hasCustomInventoryName() 
 	{
 		return false;
	}
		
 	//Overridable
 	public int getInventoryStackLimit() 
 	{
 		return 64;
	}
		
 	public boolean isUseableByPlayer(EntityPlayer player) 
 	{
 		return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? 
 				false : player.getDistanceSq((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord + 0.5D) <= 64.0D;
	}
				
 	public void openInventory() {}
		
 	public void closeInventory() {}
		
 	//Overridable
 	public boolean isItemValidForSlot(int slot, ItemStack stack)
 	{
 		return false;
	}
		
 	//Overridable
 	public int[] getAccessibleSlotsFromSide(int slot) 
 	{
 		return null;
	}
		
 	//Overridable
 	public boolean canInsertItem(int slot, ItemStack itemStack,	int side)
 	{
 		return false;
	}
			
 	//Overridable
 	public boolean canExtractItem(int slot, ItemStack itemStack, int side)
 	{
 		return false;
	}
}