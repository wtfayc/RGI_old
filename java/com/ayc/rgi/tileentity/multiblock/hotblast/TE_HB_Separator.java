package com.ayc.rgi.tileentity.multiblock.hotblast;

import com.ayc.rgi.tileentity.BTE_0_0_Base;
import com.ayc.rgi.utility.interfaces.IAmAChameleon;
import com.ayc.rgi.utility.interfaces.IAmASlave;
import com.ayc.rgi.utility.interfaces.IAmTheMaster;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TE_HB_Separator extends BTE_0_0_Base implements IAmAChameleon, IAmASlave{

	//TODO Rotation
	private int masterX;
	private int masterY;
	private int masterZ;
	boolean state = false;
	
	//=====================================IAmAChameleon=====================================
	public void setChameleonState(World world, boolean trueForm)
	{
		if(!world.isRemote) this.state = trueForm;
	}
		
	public boolean getChameleonState()
	{
		return state;
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
	}
		
	public void die()
	{
		TileEntity tileentity = worldObj.getTileEntity(masterX, masterY, masterZ);
		if(tileentity instanceof IAmTheMaster) ((IAmTheMaster) tileentity).splitStructure();
	}
		
	//=====================================Base=====================================
	@Override
	public void readFromNBT(NBTTagCompound nbttagcompound)
	{
		super.readFromNBT(nbttagcompound);
		masterX = nbttagcompound.getInteger("mainX");
		masterY = nbttagcompound.getInteger("mainY");
		masterZ = nbttagcompound.getInteger("mainZ");
		state = nbttagcompound.getBoolean("state");
	}
	
	@Override
	public void writeToNBT(NBTTagCompound nbttagcompound)
	{
		super.writeToNBT(nbttagcompound);
		nbttagcompound.setInteger("mainX", masterX);
		nbttagcompound.setInteger("mainY", masterY);
		nbttagcompound.setInteger("mainZ", masterZ);
		nbttagcompound.setBoolean("state", state);
	}
}