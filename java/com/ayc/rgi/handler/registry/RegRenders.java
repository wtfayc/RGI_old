package com.ayc.rgi.handler.registry;

import com.ayc.rgi.handler.renderer.RGIRenderer;
import com.ayc.rgi.utility.list.RGIModels;

import cpw.mods.fml.client.registry.ClientRegistry;

public class RegRenders {
	
	public static int RendererBlockID;
	
	public static void registerRenderThings() 
	{
		for (RGIModels models : RGIModels.values()) ClientRegistry.bindTileEntitySpecialRenderer(models.tileEntityClass, new RGIRenderer(models));
		
	}
}