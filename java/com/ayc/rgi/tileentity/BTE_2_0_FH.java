package com.ayc.rgi.tileentity;

import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTankInfo;
import net.minecraftforge.fluids.IFluidHandler;

/**Basic TileEntity with Description Packet logic > IMachineHandler + updateConstructor > IFluidHandler*/
public class BTE_2_0_FH extends BTE_0_1_Machine implements IFluidHandler{
	
	protected BTE_2_0_FH(int guiID) 
	{
		super(guiID);
	}

	//=====================================IFluidHandler=====================================
	//Overridable
	public int fill(ForgeDirection from, FluidStack resource, boolean doFill) 
	{
		return 0;
	}

	//Overridable
	public FluidStack drain(ForgeDirection from, FluidStack resource, boolean doDrain) 
	{
		return null;
	}

	//Overridable
	public FluidStack drain(ForgeDirection from, int maxDrain, boolean doDrain) 
	{
		return null;
	}

	//Overridable
	public boolean canFill(ForgeDirection from, Fluid fluid)
	{
		return false;
	}

	//Overridable
	public boolean canDrain(ForgeDirection from, Fluid fluid) 
	{
		return false;
	}
		
	//Overridable
	public FluidTankInfo[] getTankInfo(ForgeDirection from) 
	{
		return null;
	}
}