package com.ayc.rgi.handler.renderer;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.ayc.rgi.utility.interfaces.IAmAChameleon;
import com.ayc.rgi.utility.interfaces.IAmTiered;
import com.ayc.rgi.utility.interfaces.IRotationHandler;
import com.ayc.rgi.utility.interfaces.ISpinRightRound;
import com.ayc.rgi.utility.list.RGIModels;

public class RGIRenderer extends TileEntitySpecialRenderer
{
	RGIModels models;
	
	public RGIRenderer(RGIModels model)
	{
		this.models = model;
	}
	
	@Override
	public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f) 
	{
		//Chameleon state = should it render the model ?
		if (tileentity instanceof IAmAChameleon) if (!((IAmAChameleon) tileentity).getChameleonState()) return;
		//Spin state = animation progress getter
		float progress = 0;
		if (tileentity != null && tileentity instanceof ISpinRightRound) progress = ((ISpinRightRound) tileentity).getProgress();
		
		GL11.glPushMatrix();
		GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
		
		//Texture state = texture based on tier for tiered machines
		String modelTexture = models.modelTexture;
		if (tileentity != null && tileentity instanceof IAmTiered) modelTexture = ((IAmTiered) tileentity).getTexture();
		bindTexture(new ResourceLocation(modelTexture));        	
		
		GL11.glPushMatrix();
		GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
		
		//Rotation state = rotation from South
		int facing = 0;
		if (tileentity != null && tileentity instanceof IRotationHandler) facing =  ((IRotationHandler) tileentity).getFacing();
		GL11.glRotatef(facing * 90, 0, 1, 0);
		//Render
		this.models.model.renderPlus(null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F, progress);      
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}