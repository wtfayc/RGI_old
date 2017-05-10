package com.ayc.rgi.tileentity;

import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTankInfo;
import net.minecraftforge.fluids.IFluidHandler;

/**Basic TileEntity with Description Packet logic > IMachineHandler + updateConstructor > ISidedInventory > IFluidHandler*/
public class BTE_1_1_SIFH extends BTE_1_0_SI implements IFluidHandler{

	protected BTE_1_1_SIFH(int guiID, int inventorySize) 
	{
		super(guiID, inventorySize);
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