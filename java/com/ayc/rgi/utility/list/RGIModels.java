package com.ayc.rgi.utility.list;

import com.ayc.rgi.model.BaseRGIModel;
import com.ayc.rgi.model.ModelBFDuct;
import com.ayc.rgi.model.ModelBFGasOfftake;
import com.ayc.rgi.model.ModelBellow;
import com.ayc.rgi.model.ModelBellowAutomation;
import com.ayc.rgi.model.ModelBloomery;
import com.ayc.rgi.model.ModelHBSeparator;
import com.ayc.rgi.model.ModelStampMill;
import com.ayc.rgi.tileentity.multiblock.blastfurnace.TE_BF_GasOfftake;
import com.ayc.rgi.tileentity.multiblock.blastfurnace.TE_BF_Skimmer;
import com.ayc.rgi.tileentity.multiblock.blastfurnace.TE_BF_SlagRunner;
import com.ayc.rgi.tileentity.multiblock.bloomery.TE_B_Bellow;
import com.ayc.rgi.tileentity.multiblock.bloomery.TE_B_BellowAuto;
import com.ayc.rgi.tileentity.multiblock.bloomery.TE_B_Ctrl;
import com.ayc.rgi.tileentity.multiblock.hotblast.TE_HB_Separator;
import com.ayc.rgi.tileentity.multiblock.stampmill.TE_SM_Ctrl;
import com.ayc.rgi.utility.Reference;

import net.minecraft.tileentity.TileEntity;

public enum RGIModels {
	
	BLAST_FURNACE_DUCT_SKIMMER(TE_BF_Skimmer.class, new ModelBFDuct(), "BlastFurnaceDuct", Reference.TEXTURE_PATH_MODEL_BLAST_FURNACE),
	BLAST_FURNACE_DUCT_SLAGRUNNER(TE_BF_SlagRunner.class, new ModelBFDuct(), "BlastFurnaceDuct", Reference.TEXTURE_PATH_MODEL_BLAST_FURNACE),
	BLAST_FURNACE_HOT_BLAST_DUCT(TE_HB_Separator.class, new ModelHBSeparator(), "BlastFurnaceHotBlastDuct", Reference.TEXTURE_PATH_MODEL_BLAST_FURNACE),
	BLAST_FURNACE_GAS_OFFTAKE(TE_BF_GasOfftake.class, new ModelBFGasOfftake(), "BlastFurnaceGasOfftake", Reference.TEXTURE_PATH_MODEL_BLAST_FURNACE),
	BLOOMERY_CTRL(TE_B_Ctrl.class, new ModelBloomery(), "BloomeryDirt", Reference.TEXTURE_PATH_MODEL_BLOOMERY_BLOCK),
	BLOOMERY_BELLOW(TE_B_Bellow.class, new ModelBellow(), "Bellow", Reference.TEXTURE_PATH_MODEL_BLOOMERY_BELLOW),
	BLOOMERY_BELLOW_AUTOMATION(TE_B_BellowAuto.class, new ModelBellowAutomation(), "BellowAutomationWood", Reference.TEXTURE_PATH_MODEL_BLOOMERY_BELLOW_AUTOMATION),
	STAMP_MILL_CTRL(TE_SM_Ctrl.class, new ModelStampMill(), "StampMill", Reference.TEXTURE_PATH_MODEL),
		
	;
	public Class <? extends TileEntity> tileEntityClass;
	public BaseRGIModel model;
	public String modelTexture;
	public String texturePath;
	
	private RGIModels (Class <? extends TileEntity> tileEntityClass, BaseRGIModel model, String modelTexture, String texturePath)
	{
		this.tileEntityClass = tileEntityClass;
		this.model = model;
		this.modelTexture = texturePath + modelTexture + ".png";
		this.texturePath = texturePath;
	}
}