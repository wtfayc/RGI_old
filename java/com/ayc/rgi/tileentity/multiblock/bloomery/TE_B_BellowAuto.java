package com.ayc.rgi.tileentity.multiblock.bloomery;

import net.minecraft.nbt.NBTTagCompound;

import com.ayc.rgi.tileentity.BTE_2_0_FH;
import com.ayc.rgi.utility.interfaces.IAmTiered;
import com.ayc.rgi.utility.interfaces.IRotationHandler;
import com.ayc.rgi.utility.interfaces.ISpinRightRound;
import com.ayc.rgi.utility.list.RGIModels;

public class TE_B_BellowAuto extends BTE_2_0_FH implements IAmTiered, IRotationHandler, ISpinRightRound{

	float progress = 0;
	int facing;
	int tier;
	
	public TE_B_BellowAuto()
	{
		super(-1);
	}
	
	//=====================================Network=====================================	
	@Override
 	public void writeToNBT(NBTTagCompound nbt)
 	{
 		super.writeToNBT(nbt);
 		nbt.setFloat("progress", (float)progress);
 		nbt.setInteger("facing", (int)facing);
 		nbt.setInteger("tier", (int)tier);
 	}
	
 	@Override
 	public void readFromNBT(NBTTagCompound nbt)
 	{
 		super.readFromNBT(nbt);
 		progress = nbt.getFloat("progress");
 		facing = nbt.getInteger("facing");
 		tier = nbt.getInteger("tier");
 	}
	
 	//=====================================Base=====================================
 	public void updateEntity()
 	{	
 		progress += 1;
 		if (progress >= 100) progress = 0;
 	}
	
 	//=====================================IAmTiered=====================================
 	public void setTier(int meta)
 	{
 		tier = meta - 2;
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
			case 1 :	modelTexture = "BellowAutomationStone";		break;
			case 2 :	modelTexture = "BellowAutomationSteel";		break;
			case 3 :	modelTexture = "BellowAutomationDiamond";	break;
			case 4 :	modelTexture = "BellowAutomationBedrock";	break;
			default :	modelTexture = "BellowAutomationWood";		break;
		}
		String texturePath = RGIModels.BLOOMERY_BELLOW_AUTOMATION.texturePath + modelTexture + ".png";
		return texturePath;
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