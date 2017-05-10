package com.ayc.rgi.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelBellow extends BaseRGIModel
{
	  //fields
	    ModelRenderer mB1;
	    ModelRenderer mB2;
	    ModelRenderer C1;
	    ModelRenderer C2;
	    ModelRenderer D;
	    ModelRenderer E;
	    ModelRenderer A;
	    ModelRenderer mF1;
	    ModelRenderer mF2;
	  
	  public ModelBellow()
	  {
	    textureWidth = 128;
	    textureHeight = 64;
	    
	      mB1 = new ModelRenderer(this, 0, 29);
	      mB1.addBox(0F, 0F, 0F, 12, 1, 12);
	      mB1.setRotationPoint(-6F, 22F, -6F);
	      mB1.setTextureSize(64, 32);
	      mB1.mirror = true;
	      setRotation(mB1, 0F, 0F, 0F);     
	      mB2 = new ModelRenderer(this, 0, 29);
	      mB2.addBox(0F, 0F, 0F, 12, 1, 12);
	      mB2.setRotationPoint(-6F, 9F, -6F);
	      mB2.setTextureSize(64, 32);
	      mB2.mirror = true;
	      setRotation(mB2, 0F, 0F, 0F);
	      C1 = new ModelRenderer(this, 40, 51);
	      C1.addBox(0F, 0F, 0F, 12, 1, 12);
	      C1.setRotationPoint(-6F, 13F, -6F);
	      C1.setTextureSize(64, 32);
	      C1.mirror = true;
	      setRotation(C1, 0F, 0F, 0F);
	      C2 = new ModelRenderer(this, 40, 51);
	      C2.addBox(0F, 0F, 0F, 12, 1, 12);
	      C2.setRotationPoint(-6F, 18F, -6F);
	      C2.setTextureSize(64, 32);
	      C2.mirror = true;
	      setRotation(C2, 0F, 0F, 0F);
	      D = new ModelRenderer(this, 0, 35);
	      D.addBox(0F, 0F, 0F, 4, 4, 2);
	      D.setRotationPoint(-2F, 14F, 5F);
	      D.setTextureSize(64, 32);
	      D.mirror = true;
	      setRotation(D, 0F, 0F, 0F);
	      E = new ModelRenderer(this, 40, 42);
	      E.addBox(0F, 0F, 0F, 8, 8, 1);
	      E.setRotationPoint(-4F, 12F, 7F);
	      E.setTextureSize(64, 32);
	      E.mirror = true;
	      setRotation(E, 0F, 0F, 0F);
	      A = new ModelRenderer(this, 0, 42);
	      A.addBox(0F, 0F, 0F, 10, 4, 10);
	      A.setRotationPoint(-5F, 14F, -5F);
	      A.setTextureSize(64, 32);
	      A.mirror = true;
	      setRotation(A, 0F, 0F, 0F);
	      mF1 = new ModelRenderer(this, 76, 50);
	      mF1.addBox(0F, 0F, 0F, 10, 3, 10);
	      mF1.setRotationPoint(-5F, 19F, -5F);
	      mF1.setTextureSize(64, 32);
	      mF1.mirror = true;
	      setRotation(mF1, 0F, 0F, 0F);
	      mF2 = new ModelRenderer(this, 76, 50);
	      mF2.addBox(0F, 0F, 0F, 10, 3, 10);
	      mF2.setRotationPoint(-5F, 10F, -5F);
	      mF2.setTextureSize(64, 32);
	      mF2.mirror = true;
	      setRotation(mF2, 0F, 0F, 0F);
	  }
	  
	  @Override
	  public void renderPlus(Entity entity, float f, float f1, float f2, float f3, float f4, float f5, float progress)
	  {
		  float mvt = MathHelper.sin((float) (Math.PI * progress / 100)) * 0.1875F;
		  C1.render(f5);
		  C2.render(f5);
		  D.render(f5);
		  E.render(f5);
		  A.render(f5);
		  GL11.glTranslatef(0.0F, mvt, 0.0F);
		  mB2.render(f5);
		  mF2.render(f5);
		  GL11.glTranslatef(0.0F, -2 * mvt, 0.0F);
		  mF1.render(f5);
		  mB1.render(f5);
	  }	  
}