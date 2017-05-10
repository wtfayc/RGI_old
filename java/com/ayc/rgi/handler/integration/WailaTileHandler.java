package com.ayc.rgi.handler.integration;

import java.util.List;

import com.ayc.rgi.block.B_BlockRGI;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTankInfo;
import net.minecraftforge.fluids.IFluidHandler;
import mcp.mobius.waila.api.IWailaConfigHandler;
import mcp.mobius.waila.api.IWailaDataAccessor;
import mcp.mobius.waila.api.IWailaDataProvider;
import mcp.mobius.waila.api.IWailaRegistrar;
import cpw.mods.fml.common.Optional;

@Optional.Interface(iface = "mcp.mobius.waila.api.IWailaDataProvider", modid = "Waila")
public class WailaTileHandler implements IWailaDataProvider {

    @Optional.Method(modid = "Waila")
    public static void callbackRegister(IWailaRegistrar register) 
    {
        WailaTileHandler instance = new WailaTileHandler();

        register.registerBodyProvider(instance, B_BlockRGI.class);
    }

    @Override
    @Optional.Method(modid = "Waila")
    public ItemStack getWailaStack(IWailaDataAccessor accessor, IWailaConfigHandler config) {

        return accessor.getStack();
    }

    @Override
    @Optional.Method(modid = "Waila")
    public List<String> getWailaHead(ItemStack itemStack, List<String> currenttip, IWailaDataAccessor accessor, IWailaConfigHandler config) 
    {
        return currenttip;
    }

    @Override
    @Optional.Method(modid = "Waila")
    public List<String> getWailaBody(ItemStack itemStack, List<String> currenttip, IWailaDataAccessor accessor, IWailaConfigHandler config) 
    {
    	TileEntity tileentity = accessor.getTileEntity();
    	
    	if (tileentity instanceof IFluidHandler) 
    	{
			FluidTankInfo[] tanks = ((IFluidHandler)tileentity).getTankInfo(ForgeDirection.UP);
			if (tanks != null) 
			{
				for (int i = 0; i < tanks.length; i++) 
				{
					FluidTankInfo info = tanks[i];
					FluidStack fluidstack = info.fluid;
					if (fluidstack != null)
					{
						String content = String.format(EnumChatFormatting.WHITE + "%d/%d mB" + EnumChatFormatting.RESET, fluidstack.amount, info.capacity);
						String fluid = fluidstack.getFluid().getLocalizedName(fluidstack);
						currenttip.add("Tank : " + content + " of " + EnumChatFormatting.AQUA + fluid);
					}
					else
					{
						String content = "Empty";
						currenttip.add("Tank : " + EnumChatFormatting.WHITE + content);
					}
				}
			}
		}

        return currenttip;
    }

    @Override
    @Optional.Method(modid = "Waila")
    public List<String> getWailaTail(ItemStack itemStack, List<String> currenttip, IWailaDataAccessor accessor, IWailaConfigHandler config) 
    {
        return currenttip;
    }

    @Override
    public NBTTagCompound getNBTData(EntityPlayerMP player, TileEntity tileentity, NBTTagCompound tag, World world, int x, int y, int z) 
    {
        if (tileentity != null)
        	tileentity.writeToNBT(tag);
        return tag;
    }
}