package com.ayc.rgi.handler.registry;

import net.minecraftforge.fluids.FluidRegistry;

import com.ayc.rgi.utility.list.RGIFluids;

public class RegFluids {

	public static void init()
	{
		//Register fluids from EFluids
		for (RGIFluids fluids : RGIFluids.values())
		{
			FluidRegistry.registerFluid(fluids.getFluid());	
		}
		/*
		//Register cells from EFluids
		for (RGIFluids fluids : RGIFluids.values())
		{
			if (fluids.hasCell)
			{
				ItemStack emptyCell = IC2Items.getItem("cell");
				ItemStack filledCell = new ItemStack(RegItems.itembase, 1, Reference.shiftCellMeta + fluids.ordinal());
				OreDictionary.registerOre("cell" + fluids.fluidNameCapitalized, filledCell);
				FluidContainerRegistry.registerFluidContainer(new FluidContainerRegistry.FluidContainerData
						(new FluidStack(fluids.getFluid(), 1000), filledCell.copy(), emptyCell.copy()));
			}	
		}
		*/
	}
}