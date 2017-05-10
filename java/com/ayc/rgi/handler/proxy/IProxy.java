package com.ayc.rgi.handler.proxy;

import net.minecraft.entity.player.EntityPlayer;

public interface IProxy {

	void registerRenderThings();
	
	EntityPlayer getClientPlayer();
	
}