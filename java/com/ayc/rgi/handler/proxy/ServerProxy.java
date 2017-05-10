package com.ayc.rgi.handler.proxy;

import net.minecraft.entity.player.EntityPlayer;



public class ServerProxy extends CommonProxy{

	@Override
	public void registerRenderThings(){}

	@Override
	public EntityPlayer getClientPlayer() 
	{
		return null;
	}

}
