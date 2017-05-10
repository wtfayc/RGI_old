package com.ayc.rgi.tileentity.multiblock.bloomery;

import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.ayc.rgi.handler.registry.RegBlocks;
import com.ayc.rgi.tileentity.BTE_1_1_SIFH;
import com.ayc.rgi.utility.MachineHelper;
import com.ayc.rgi.utility.WorldHelper;
import com.ayc.rgi.utility.interfaces.IAmAChameleon;
import com.ayc.rgi.utility.interfaces.IAmASlave;
import com.ayc.rgi.utility.interfaces.IAmTheMaster;
import com.ayc.rgi.utility.interfaces.IAmTiered;
import com.ayc.rgi.utility.interfaces.IRotationHandler;
import com.ayc.rgi.utility.list.RGIModels;

public class TE_B_Ctrl extends BTE_1_1_SIFH implements IAmAChameleon, IAmTheMaster, IAmTiered, IRotationHandler{

	boolean state;
	int facing;
	int tier;

	public TE_B_Ctrl() 
	{
		super(-1, 0);
	}
	
	@Override
	public void writeToNBT(NBTTagCompound nbt)
	{
		super.writeToNBT(nbt);
		nbt.setBoolean("state", state);
		nbt.setInteger("facing", (int)facing);
		nbt.setInteger("tier", (int)tier);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound nbt)
	{
		super.readFromNBT(nbt);
		state = nbt.getBoolean("state");
		facing = nbt.getInteger("facing");
		tier = nbt.getInteger("tier");
	}

	//=====================================IAmAChameleon=====================================
	public void setChameleonState(World world, boolean trueForm)
	{
		this.state = trueForm;
	}
	
	public boolean getChameleonState()
	{
		return state;
	}
	
	//=====================================IAmTheMaster=====================================
	public void splitStructure()
	{
		state = false;
		
		TileEntity tileEntity1 = worldObj.getTileEntity(xCoord, yCoord + 1, zCoord);
		TileEntity tileEntity2 = worldObj.getTileEntity(xCoord, yCoord + 2, zCoord);
		
		if (tileEntity1 != null) if (tileEntity1 instanceof IAmASlave) ((IAmASlave) tileEntity1).die();
		if (tileEntity2 != null) if (tileEntity2 instanceof IAmASlave) ((IAmASlave) tileEntity2).die();
		
		markDirty();
		worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
	}
	
	public void assembleStructure()
	{
		if (state) return;
		if (!checkStructure()) return;
		
		worldObj.setBlockToAir(xCoord, yCoord + 1, zCoord);
		worldObj.setBlockToAir(xCoord, yCoord + 2, zCoord);
		
		MachineHelper.placeGAGBlock(worldObj, xCoord, yCoord + 1, zCoord, xCoord, yCoord, zCoord, false, Bloomery_Tiers.values()[tier].blockName, Bloomery_Tiers.values()[tier].blockMeta);
		MachineHelper.placeGAGBlock(worldObj, xCoord, yCoord + 2, zCoord, xCoord, yCoord, zCoord, false, Bloomery_Tiers.values()[tier].blockName, Bloomery_Tiers.values()[tier].blockMeta);
		
		state = true;
	}
	
	public boolean checkStructure()
	{	
		if (WorldHelper.isBlock(worldObj, xCoord, yCoord + 3, zCoord, Blocks.air))
		{
			if (WorldHelper.isBlock(worldObj, xCoord, yCoord + 1, zCoord, Blocks.dirt) && 
				WorldHelper.isBlock(worldObj, xCoord, yCoord + 2, zCoord, Blocks.dirt))
				{
					tier = 0;
					return true;	
				}
			if (WorldHelper.isBlock(worldObj, xCoord, yCoord + 1, zCoord, Blocks.cobblestone) && 
				WorldHelper.isBlock(worldObj, xCoord, yCoord + 2, zCoord, Blocks.cobblestone))
				{
					tier = 1;
					return true;	
				}
			if (WorldHelper.isBlock(worldObj, xCoord, yCoord + 1, zCoord, Blocks.brick_block) && 
				WorldHelper.isBlock(worldObj, xCoord, yCoord + 2, zCoord, Blocks.brick_block))
				{
					tier = 2;
					return true;	
				}
			if (WorldHelper.isBlockMeta(worldObj, xCoord, yCoord + 1, zCoord, RegBlocks.multiblock, 1) && 
				WorldHelper.isBlockMeta(worldObj, xCoord, yCoord + 2, zCoord, RegBlocks.multiblock, 1))
				{
					tier = 3;
					return true;	
				}
		}
		return false;
	}
	
 	//=====================================IAmTiered=====================================
 	public void setTier(int meta)
 	{
 		tier = meta;
 	}
	
	public int getTier()
	{
		return tier;
	}
	
	public String getTexture() 
	{
		return Bloomery_Tiers.values()[tier].texturePath;
	}
	
	private enum Bloomery_Tiers
	{
		BLOOMERY_DIRT("BloomeryDirt", "dirt", 0),
		BLOOMERY_STONE("BloomeryStone", "cobblestone", 0),
		BLOOMERY_BRICK("BloomeryBrick", "brick_block", 0),
		BLOOMERY_REFRACTORY_BRICK("BloomeryRBrick", "RGI:multiblock", 1);
		
		public String texturePath;
		public String blockName;
		public int blockMeta;
		
		private Bloomery_Tiers(String textureName, String blockName, int blockMeta)
		{
			this.texturePath = RGIModels.BLOOMERY_CTRL.texturePath + textureName + ".png";
			this.blockName = blockName;
			this.blockMeta = blockMeta;
		}
	}
	
	//=====================================IRotationHandler=====================================
	public void setWorldFacing(int worldFacing)
	{
		facing = worldFacing;
	}
		
	public void rotateModel()
	{
		if (state)
		{
			facing += 1;
			if (facing >= 4) facing = 0;	
		}		
	}
		
	public int getFacing()
	{
		return facing;
	}
}