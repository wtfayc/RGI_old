package com.ayc.rgi.tileentity.multiblock.bloomery;

import io.netty.buffer.ByteBuf;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTank;
import net.minecraftforge.fluids.FluidTankInfo;

import com.ayc.rgi.tileentity.BTE_2_0_FH;
import com.ayc.rgi.utility.MachineHelper;
import com.ayc.rgi.utility.WorldHelper;
import com.ayc.rgi.utility.interfaces.IAmTiered;
import com.ayc.rgi.utility.interfaces.IMachineHandler;
import com.ayc.rgi.utility.interfaces.IRotationHandler;
import com.ayc.rgi.utility.interfaces.ISpinRightRound;
import com.ayc.rgi.utility.list.RGIFluids;
import com.ayc.rgi.utility.list.RGIModels;

public class TE_B_Bellow extends BTE_2_0_FH implements IAmTiered, IMachineHandler, IRotationHandler, ISpinRightRound{
	
	float progress;
	int facing;
	private FluidTank tank1 = new FluidTank(FluidRegistry.getFluid(RGIFluids.COMPRESSED_AIR.fluidName), 300, 8000);
	int tier;
	int fluidAmount = tank1.getFluidAmount();
	
	public TE_B_Bellow()
	{
		super(-1);
	}
	
	//=====================================Network=====================================
	@Override
 	public void writeToNBT(NBTTagCompound nbt)
 	{
		super.writeToNBT(nbt);
 		nbt.setFloat("progress", progress);
 		nbt.setInteger("facing", facing);
        NBTTagCompound tagTank1 = new NBTTagCompound();
        tank1.writeToNBT(tagTank1);
        nbt.setTag("tank1", tagTank1);
        nbt.setInteger("tier", tier);
        nbt.setInteger("fluidAmount", fluidAmount);
 	}
	
 	@Override
 	public void readFromNBT(NBTTagCompound nbt)
 	{
 		super.readFromNBT(nbt);
 		progress = nbt.getFloat("progress");
 		facing = nbt.getInteger("facing");
 		NBTTagCompound tagTank1 = nbt.getCompoundTag("tank1");
        tank1.readFromNBT(tagTank1);
        tier = nbt.getInteger("tier");
        fluidAmount = nbt.getInteger("fluidAmount");
 	}

 	@Override
 	protected void writeToPacket(ByteBuf buf)
	{
  		buf.writeInt(facing);
  		buf.writeBoolean(working);
  		buf.writeInt(tier);
  		buf.writeInt(fluidAmount);
	}
	
 	@Override
	public void readFromPacket(ByteBuf buf) 
	{
 		facing = buf.readInt();
 		working = buf.readBoolean();
 		tier = buf.readInt();
 		fluidAmount = buf.readInt();
 		tank1.setFluid(new FluidStack(FluidRegistry.getFluid(RGIFluids.COMPRESSED_AIR.fluidName), fluidAmount));
	}
 	//=====================================Work=====================================
 	@Override
 	protected void update1()
 	{	
 		if (worldObj.isRemote)
 		{
 			if (getActive() && tier == 0)
 			{
 				progress += 2.5F;
 				//Client Simulation for Waila convenience (TODO detect WAILA)
 				if (progress > 0 && progress <= 50) 
 				{
 					ForgeDirection dirOut = WorldHelper.getForgeDirectionFromFacing(facing);
 					TileEntity tileEntityTarget = worldObj.getTileEntity(this.xCoord + dirOut.offsetX, this.yCoord + dirOut.offsetY, this.zCoord + dirOut.offsetZ);
 					MachineHelper.outputFluid(tileEntityTarget, tank1, dirOut.getOpposite(), Math.max(Math.min(fluidAmount / 20, 80), 15), 0);
 				}
 				if (progress > 50 && progress <= 100) tank1.fill(new FluidStack(FluidRegistry.getFluid(RGIFluids.COMPRESSED_AIR.fluidName), 15), true);
 				//----------------------------
 			}
 			if (progress >= 100)
 			{
 				progress = 0;
 				setActive(false);
 			}
 			if (tier != 0) progress = 0;
 		}

 		if (!worldObj.isRemote)
 		{
 			if (getActive() && tier == 0)
 			{
 	 			if (tickTracker <= 20)
 	 			{
 	 				ForgeDirection dirOut = WorldHelper.getForgeDirectionFromFacing(facing);
 	 				TileEntity tileEntityTarget = worldObj.getTileEntity(this.xCoord + dirOut.offsetX, this.yCoord + dirOut.offsetY, this.zCoord + dirOut.offsetZ);
 	 				MachineHelper.outputFluid(tileEntityTarget, tank1, dirOut.getOpposite(), Math.max(Math.min(fluidAmount / 20, 80), 15), 0);
 	 			}
 	 			if (tickTracker > 20 && tickTracker <= 40) tank1.fill(new FluidStack(FluidRegistry.getFluid(RGIFluids.COMPRESSED_AIR.fluidName), 15), true);
 			}
 		}

 	}

 	@Override
 	protected void update3()
 	{
 		if (!worldObj.isRemote)
 		{
 			if (getActive())
 			{
 				setActive(false);
 				tickUpdate = tickUpdateIdle;
 			}
 	 		if (tank1.getFluidAmount() >= tank1.getCapacity()) boom();
 		}
 		if (worldObj.isRemote) if (tier != 0) MachineHelper.spawnParticles(worldObj, xCoord, yCoord - 1, zCoord, "angryVillager");
 	}

	public void activation() 
	{
		if (getActive() || tier != 0) return;
		worldObj.playSoundEffect(xCoord + 0.5, yCoord + 0.5, zCoord + 0.5, "rgi:bellow", 1, 1);
		this.fluidAmount = tank1.getFluidAmount();
		setActive(true);
		tickTracker = 0;
		tickUpdate = 40;
	}
	
	public void boom()
	{
		setTier(1);
		worldObj.playSoundEffect(xCoord + 0.5, yCoord + 0.5, zCoord + 0.5, "rgi:bellowpop", 1, 1);
		tank1.setFluid(null);
		this.fluidAmount = tank1.getFluidAmount();
		worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
	}
 	
	public void repair()
	{
		
	}
	
 	//=====================================IAmTiered=====================================
 	public void setTier(int meta)
 	{
 		tier = meta;
 		worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, tier, 3);
 	}
	
	public int getTier()
	{
		return tier;
	}
	
	public String getTexture() 
	{
		String modelTexture;
		switch(tier)
		{
			case 1 :	modelTexture = "BellowBroken";		break;
			default :	modelTexture = "Bellow";			break;
		}
		String texturePath = RGIModels.BLOOMERY_BELLOW.texturePath + modelTexture + ".png";
		return texturePath;
	}
	
	//=====================================IFluidHandler=====================================
	@Override
	public boolean canDrain(ForgeDirection from, Fluid fluid) 
	{
		if (from == WorldHelper.getForgeDirectionFromFacing(facing).getOpposite()) return true;
		return false;
	}
	
	@Override
	public FluidTankInfo[] getTankInfo(ForgeDirection from) 
	{
		return new FluidTankInfo[]{tank1.getInfo()};
	}
	
 	//=====================================IMachineHandler=====================================
	@Override
	public void setActive(boolean active) 
	{
		if (!worldObj.isRemote)
		{		
			if (active && tier == 0)
			{
				working = true;
				worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
			}
		}	
		if (!active) working = false;
	}
	
 	//=====================================IRotationHandler=====================================
 	public void setWorldFacing(int worldFacing)
	{
		facing = worldFacing;
	}
	
	public void rotateModel()
	{
		facing += 1;
		if (facing >= 4) facing = 0;
	}
	
	public int getFacing()
 	{
		return facing;
 	}
 		
	//=====================================ISpinRightRound=====================================
 	public float getProgress()
 	{
 		return progress;
 	}
}