package com.ayc.rgi.tileentity.technical;

import net.minecraft.block.Block;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

import com.ayc.rgi.tileentity.multiblock.TE_M_Structure;
import com.ayc.rgi.utility.interfaces.IAmTheMaster;

/**Multiblock TileEntity that replaces a block and restores it when broken*/
public class TE_Tech_GAG extends TE_M_Structure{
	
	String blockName;
	int blockMeta;
	
	@Override
	public void writeToNBT(NBTTagCompound nbt)
	{
		super.writeToNBT(nbt);
		nbt.setString("blockName", blockName);
		nbt.setInteger("blockMeta", (int) blockMeta);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound nbt)
	{
		super.readFromNBT(nbt);
		blockName = nbt.getString("blockName");
		blockMeta = nbt.getInteger("blockMeta");
	}

	public void setAncestor(String blockName, int blockMeta)
	{
		this.blockName = blockName;
		this.blockMeta = blockMeta;
	}

	@Override
	public void die()
	{
		if (!dead)
		{
			dead = true;
			TileEntity tileEntity = worldObj.getTileEntity(masterX, masterY, masterZ);
			if (tileEntity != null) if (tileEntity instanceof IAmTheMaster) ((IAmTheMaster) tileEntity).splitStructure();
			worldObj.setBlock(xCoord, yCoord, zCoord, Block.getBlockFromName(blockName), blockMeta, 3);
			worldObj.removeTileEntity(xCoord, yCoord, zCoord);
		}
	}
}