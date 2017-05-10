package com.ayc.rgi;

import com.ayc.rgi.handler.ConfigurationHandler;
import com.ayc.rgi.handler.DescriptionNetworkHandler;
import com.ayc.rgi.handler.GuiHandler;
import com.ayc.rgi.handler.proxy.IProxy;
import com.ayc.rgi.handler.registry.RegBlocks;
import com.ayc.rgi.handler.registry.RegFluids;
import com.ayc.rgi.handler.registry.RegItems;
import com.ayc.rgi.handler.registry.RegTileEntities;
import com.ayc.rgi.utility.LogHelper;
import com.ayc.rgi.utility.Reference;
import com.ayc.rgi.utility.list.RGIFluids;

import net.minecraft.util.IIcon;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.FluidRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)

public class RGI {

	@Mod.Instance(Reference.MOD_ID)
	public static RGI instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
		RegItems.init();
		RegBlocks.init();
		RegFluids.init();
		DescriptionNetworkHandler.init();
		MinecraftForge.EVENT_BUS.register(this);

		if (ConfigurationHandler.debug == true) LogHelper.info("Pre Initialization Complete!");
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.registerRenderThings();
        RegTileEntities.init();
        
        
//		ModRecipes.init();
        FMLInterModComms.sendMessage("Waila", "register", Reference.WAILA_HANDLER);
        
        if (ConfigurationHandler.debug == true) LogHelper.info("Initialization Complete!");
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
		if (ConfigurationHandler.debug == true) LogHelper.info("Post Initialization Complete!");
	}
	
	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public void textureHook(TextureStitchEvent.Pre event) 
	{
		if (event.map.getTextureType() == 0)
		{
			for (RGIFluids fluids : RGIFluids.values())
			{
				IIcon fluidtexture = event.map.registerIcon(fluids.fluidTexture);				
				FluidRegistry.getFluid(fluids.fluidName).setIcons(fluidtexture);
			}
			if (ConfigurationHandler.debug == true) LogHelper.info("Fluid Textures Loaded!");
		}
	}	
}