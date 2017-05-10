package com.ayc.rgi.utility;

import java.util.Random;

import com.ayc.rgi.handler.registry.RegBlocks;
import com.ayc.rgi.tileentity.technical.TE_Tech_GAG;

import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.IFluidHandler;
import net.minecraftforge.fluids.IFluidTank;

public class MachineHelper {

	/**Place a slave GAGBlock at x, y, z with master xori, yori, zori*/
    public static boolean placeGAGBlock (World world, int x, int y, int z,int xori, int yori, int zori, boolean airCheck, String blockName, int blockMeta)
    {
    	if (airCheck) if (!WorldHelper.isBlock(world, x , y, z, Blocks.air)) return false;
    	world.setBlock(x, y, z, RegBlocks.technical, 0, 7);
    	if(!world.isRemote)
		{
    		TileEntity tileEntity = world.getTileEntity(x, y, z);
    		if (tileEntity != null)
    		{
    			 if (tileEntity instanceof TE_Tech_GAG)
    			 {
    				 ((TE_Tech_GAG) tileEntity).setMaster(world, xori, yori, zori);
    				 ((TE_Tech_GAG) tileEntity).setAncestor(blockName, blockMeta);
    				 return true;
    			 }
    		}
		}	
    	return false;
    }
	
    /**Outputs from tank to tiletarget from from at transferrate if tiletarget exists and implements IFluidHandler*/
    public static void outputFluid(TileEntity tiletarget, IFluidTank tank, ForgeDirection from, int transferrate, int reserve)
	{
		if(tank != null && tank.getFluid() != null && tank.getFluid().amount > 0)
		{
			FluidStack fluidstack = tank.getFluid().copy();
			fluidstack.amount = Math.min(fluidstack.amount - reserve, transferrate);
			if(tiletarget != null && tiletarget instanceof IFluidHandler)
			{
				int filled = ((IFluidHandler)tiletarget).fill(from, fluidstack, true);
				tank.drain(filled, true);
				fluidstack.amount -= filled;
			}
		}
	}
    
    /**Spawn vanilla particles*/
	public static void spawnParticles(World world, int x, int y, int z, String particle)
	{
		Random rand = new Random();
	    double motionX = rand.nextGaussian() * 0.02D;
	    double motionY = rand.nextGaussian() * 0.02D;
	    double motionZ = rand.nextGaussian() * 0.02D;
	    world.spawnParticle(particle, x + rand.nextFloat(), y + 1 + rand.nextFloat(), z + rand.nextFloat(),	motionX, motionY,  motionZ);
	}
}