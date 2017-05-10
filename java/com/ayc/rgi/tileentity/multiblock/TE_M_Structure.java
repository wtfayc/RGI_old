package com.ayc.rgi.tileentity.multiblock;

import com.ayc.rgi.tileentity.BTE_0_0_Base;
import com.ayc.rgi.utility.interfaces.IAmASlave;
import com.ayc.rgi.utility.interfaces.IAmTheMaster;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**Basic TileEntity implementing IAmASlave, used for non ticking Multiblock structures*/
public class TE_M_Structure extends BTE_0_0_Base implements IAmASlave{

	protected int masterX;
	protected int masterY;
	protected int masterZ;
	
	protected boolean dead = true;

	@Override
	public void writeToNBT(NBTTagCompound nbt)
	{
		super.writeToNBT(nbt);
		nbt.setInteger("mainX", masterX);
		nbt.setInteger("mainY", masterY);
		nbt.setInteger("mainZ", masterZ);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound nbt)
	{
		super.readFromNBT(nbt);
		masterX = nbt.getInteger("mainX");
		masterY = nbt.getInteger("mainY");
		masterZ = nbt.getInteger("mainZ");
	}

	@Override
	public boolean canUpdate()
	{
		return false;
	}

	//=====================================IAmASlave=====================================
	public void setMaster(World world, int Xmaster, int Ymaster, int Zmaster)
	{
		if(!world.isRemote)
		{
			this.masterX = Xmaster;
			this.masterY = Ymaster;
			this.masterZ = Zmaster;
		}
		dead = false;
	}
	
	public void die()
	{
		TileEntity tileEntity = worldObj.getTileEntity(masterX, masterY, masterZ);
		if (tileEntity != null) if (tileEntity instanceof IAmTheMaster) ((IAmTheMaster) tileEntity).splitStructure();
	}
}