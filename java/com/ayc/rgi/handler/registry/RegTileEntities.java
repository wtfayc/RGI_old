package com.ayc.rgi.handler.registry;

import com.ayc.rgi.tileentity.multiblock.TE_M_Part;
import com.ayc.rgi.tileentity.multiblock.TE_M_Structure;
import com.ayc.rgi.tileentity.multiblock.blastfurnace.TE_BF_GasOfftake;
import com.ayc.rgi.tileentity.multiblock.blastfurnace.TE_BF_ReceivingHopper;
import com.ayc.rgi.tileentity.multiblock.blastfurnace.TE_BF_Sensor;
import com.ayc.rgi.tileentity.multiblock.blastfurnace.TE_BF_Skimmer;
import com.ayc.rgi.tileentity.multiblock.blastfurnace.TE_BF_SlagRunner;
import com.ayc.rgi.tileentity.multiblock.blastfurnace.TE_BF_Tuyere;
import com.ayc.rgi.tileentity.multiblock.bloomery.TE_B_Bellow;
import com.ayc.rgi.tileentity.multiblock.bloomery.TE_B_BellowAuto;
import com.ayc.rgi.tileentity.multiblock.bloomery.TE_B_Ctrl;
import com.ayc.rgi.tileentity.multiblock.hotblast.TE_HB_Separator;
import com.ayc.rgi.tileentity.multiblock.stampmill.TE_SM_Ctrl;
import com.ayc.rgi.tileentity.technical.TE_Tech_GAG;

import cpw.mods.fml.common.registry.GameRegistry;

public class RegTileEntities 
{
	
	public static void init()
	{
		//Technical
		GameRegistry.registerTileEntity(TE_Tech_GAG.class, "RGI_TE_TG");
		
		//Multiblock
		GameRegistry.registerTileEntity(TE_M_Part.class, "RGI_TE_MP");
		GameRegistry.registerTileEntity(TE_M_Structure.class, "RGI_TE_MS");

		//Multiblock - Bloomery
		GameRegistry.registerTileEntity(TE_B_Ctrl.class, "RGI_TE_B_Cl");
		GameRegistry.registerTileEntity(TE_B_Bellow.class, "RGI_TE_B_Be");
		GameRegistry.registerTileEntity(TE_B_BellowAuto.class, "RGI_TE_B_BA");
		
		//Multiblock - Blast Furnace
		GameRegistry.registerTileEntity(TE_BF_GasOfftake.class, "RGI_TE_BF_GO");
		GameRegistry.registerTileEntity(TE_BF_ReceivingHopper.class, "RGI_TE_BF_RH");
		GameRegistry.registerTileEntity(TE_BF_Sensor.class, "RGI_TE_BF_Se");
		GameRegistry.registerTileEntity(TE_BF_Skimmer.class, "RGI_TE_BF_Sk");
		GameRegistry.registerTileEntity(TE_BF_SlagRunner.class, "RGI_TE_BF_SR");
		GameRegistry.registerTileEntity(TE_BF_Tuyere.class, "RGI_TE_BF_Tu");
		
		//Multiblock - Stamp Mill
		GameRegistry.registerTileEntity(TE_SM_Ctrl.class, "RGI_TE_SM_Cl");
		
		//Multiblock - Hot Blast
		GameRegistry.registerTileEntity(TE_HB_Separator.class, "RGI_TE_HB_Se");
		
	}
}