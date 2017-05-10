package com.ayc.rgi.handler.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;

import com.ayc.rgi.handler.registry.RegRenders;

public class ClientProxy extends CommonProxy{

	public static int renderPass;
	
	@Override
	public void registerRenderThings() 
	{
        RegRenders.registerRenderThings();
	}

	@Override
	public EntityPlayer getClientPlayer() 
	{
		return Minecraft.getMinecraft().thePlayer;
	}
}