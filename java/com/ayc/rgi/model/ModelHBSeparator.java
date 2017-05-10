package com.ayc.rgi.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHBSeparator extends BaseRGIModel{

	//fields
    ModelRenderer A1;
    ModelRenderer A2;
    ModelRenderer A3;
    ModelRenderer A4;
    ModelRenderer A5;
    ModelRenderer A6;
    ModelRenderer A7;
    ModelRenderer B1;
    ModelRenderer B2;
    ModelRenderer B3;
    ModelRenderer B4;
    ModelRenderer B5;
    ModelRenderer B6;
    ModelRenderer B7;
    ModelRenderer B8;
  
  public ModelHBSeparator()
  {
    textureWidth = 256;
    textureHeight = 128;
    
      A1 = new ModelRenderer(this, 160, 0);
      A1.addBox(0F, 0F, 0F, 32, 48, 16);
      A1.setRotationPoint(8F, -8F, -8F);
      A1.setTextureSize(256, 128);
      A1.mirror = true;
      setRotation(A1, 0F, 0F, 0F);
      A2 = new ModelRenderer(this, 0, 0);
      A2.addBox(0F, 0F, 0F, 16, 16, 16);
      A2.setRotationPoint(24F, 7F, -24F);
      A2.setTextureSize(256, 128);
      A2.mirror = true;
      setRotation(A2, 0F, 0F, 0F);
      A3 = new ModelRenderer(this, 0, 0);
      A3.addBox(0F, 0F, 0F, 16, 16, 16);
      A3.setRotationPoint(24F, 7F, 8F);
      A3.setTextureSize(256, 128);
      A3.mirror = true;
      setRotation(A3, 0F, 0F, 0F);
      A4 = new ModelRenderer(this, 0, 0);
      A4.addBox(0F, 0F, 0F, 16, 48, 80);
      A4.setRotationPoint(-8F, -8F, -40F);
      A4.setTextureSize(256, 128);
      A4.mirror = true;
      setRotation(A4, 0F, 0F, 0F);
      A5 = new ModelRenderer(this, 0, 0);
      A5.addBox(0F, 0F, 0F, 16, 16, 16);
      A5.setRotationPoint(8F, 7F, 24F);
      A5.setTextureSize(256, 128);
      A5.mirror = true;
      setRotation(A5, 0F, 0F, 0F);
      A6 = new ModelRenderer(this, 0, 0);
      A6.addBox(0F, 0F, 0F, 16, 16, 16);
      A6.setRotationPoint(8F, 7F, -40F);
      A6.setTextureSize(256, 128);
      A6.mirror = true;
      setRotation(A6, 0F, 0F, 0F);
      A7 = new ModelRenderer(this, 0, 0);
      A7.addBox(0F, 0F, 0F, 16, 16, 80);
      A7.setRotationPoint(-24F, 8F, -40F);
      A7.setTextureSize(256, 128);
      A7.mirror = true;
      setRotation(A7, 0F, 0F, 0F);
      B1 = new ModelRenderer(this, 0, 0);
      B1.addBox(0F, 0F, 0F, 12, 23, 80);
      B1.setRotationPoint(-8F, -8F, -40F);
      B1.setTextureSize(256, 128);
      B1.mirror = true;
      setRotation(B1, 0F, 0F, 0.7853982F);
      B2 = new ModelRenderer(this, 0, 0);
      B2.addBox(0F, 0F, 0F, 11, 22, 80);
      B2.setRotationPoint(0.3F, 0F, -40F);
      B2.setTextureSize(256, 128);
      B2.mirror = true;
      setRotation(B2, 0F, 0F, -0.8203047F);
      B3 = new ModelRenderer(this, 0, 40);
      B3.addBox(0F, 0F, 0F, 32, 22, 11);
      B3.setRotationPoint(8F, 0F, 0.3F);
      B3.setTextureSize(256, 128);
      B3.mirror = true;
      setRotation(B3, 0.8203047F, 0F, 0F);
      B4 = new ModelRenderer(this, 0, 40);
      B4.addBox(0F, 0F, 0F, 32, 22, 11);
      B4.setRotationPoint(8F, -8F, -8F);
      B4.setTextureSize(256, 128);
      B4.mirror = true;
      setRotation(B4, -0.8203047F, 0F, 0F);
      B5 = new ModelRenderer(this, 0, 40);
      B5.addBox(0F, 0F, 0F, 32, 23, 12);
      B5.setRotationPoint(8F, 14.8F, 15.3F);
      B5.setTextureSize(256, 128);
      B5.mirror = true;
      setRotation(B5, -0.7679449F, 0F, 0F);
      B6 = new ModelRenderer(this, 0, 40);
      B6.addBox(0F, 0F, 0F, 32, 23, 12);
      B6.setRotationPoint(8F, 23F, -23.8F);
      B6.setTextureSize(256, 128);
      B6.mirror = true;
      setRotation(B6, 0.7504916F, 0F, 0F);
      B7 = new ModelRenderer(this, 0, 0);
      B7.addBox(0F, 0F, 0F, 12, 23, 80);
      B7.setRotationPoint(-24F, 23.7F, -40F);
      B7.setTextureSize(256, 128);
      B7.mirror = true;
      setRotation(B7, 0F, 0F, -0.7853982F);
      B8 = new ModelRenderer(this, 0, 0);
      B8.addBox(0F, 0F, 0F, 12, 24, 80);
      B8.setRotationPoint(15.4F, 14.5F, -40F);
      B8.setTextureSize(256, 128);
      B8.mirror = true;
      setRotation(B8, 0F, 0F, 0.7679449F);
  }
  
  @Override
  public void renderPlus(Entity entity, float f, float f1, float f2, float f3, float f4, float f5, float progress)
  {
    A1.render(f5);
    A2.render(f5);
    A3.render(f5);
    A4.render(f5);
    A5.render(f5);
    A6.render(f5);
    A7.render(f5);
    B1.render(f5);
    B2.render(f5);
    B3.render(f5);
    B4.render(f5);
    B5.render(f5);
    B6.render(f5);
    B7.render(f5);
    B8.render(f5);
  }
}