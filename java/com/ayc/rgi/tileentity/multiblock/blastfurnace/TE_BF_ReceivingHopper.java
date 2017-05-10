package com.ayc.rgi.tileentity.multiblock.blastfurnace;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.ayc.rgi.tileentity.BTE_1_0_SI;
import com.ayc.rgi.utility.interfaces.IAmASlave;
import com.ayc.rgi.utility.interfaces.IAmTheMaster;

public class TE_BF_ReceivingHopper extends BTE_1_0_SI implements IAmASlave{
	
	private int masterX;
	private int masterY;
	private int masterZ;
	
	public TE_BF_ReceivingHopper() 
	{
		super(-1, 0);
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
}