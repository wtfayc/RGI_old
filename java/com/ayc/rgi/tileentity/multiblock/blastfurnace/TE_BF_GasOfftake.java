package com.ayc.rgi.tileentity.multiblock.blastfurnace;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.ayc.rgi.tileentity.BTE_2_0_FH;
import com.ayc.rgi.utility.interfaces.IAmAChameleon;
import com.ayc.rgi.utility.interfaces.IAmASlave;
import com.ayc.rgi.utility.interfaces.IAmTheMaster;

public class TE_BF_GasOfftake extends BTE_2_0_FH implements IAmAChameleon, IAmASlave{
	
	private int masterX;
	private int masterY;
	private int masterZ;
	boolean state = true;
	
	public TE_BF_GasOfftake()
	{
		super(-1);
	}

	
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