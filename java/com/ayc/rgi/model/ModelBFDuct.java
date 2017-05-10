package com.ayc.rgi.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBFDuct extends BaseRGIModel{

	//fields
    ModelRenderer A1;
    ModelRenderer B1;
    ModelRenderer B2;
    ModelRenderer B3;
    ModelRenderer B4;
    ModelRenderer A2;
    ModelRenderer A3;
    ModelRenderer A4;
    ModelRenderer C1;
    ModelRenderer C2;
    ModelRenderer D1;
    ModelRenderer D2;
    ModelRenderer E1;
    ModelRenderer E2;
    ModelRenderer E3;
    ModelRenderer E4;
  
  public ModelBFDuct()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      A1 = new ModelRenderer(this, 114, 0);
      A1.addBox(0F, 0F, 0F, 1, 11, 6);
      A1.setRotationPoint(5F, 13F, -3F);
      A1.setTextureSize(128, 64);
      A1.mirror = true;
      setRotation(A1, 0F, 0F, 0F);
      B1 = new ModelRenderer(this, 0, 2);
      B1.addBox(0F, 0F, 0F, 41, 1, 6);
      B1.setRotationPoint(-38F, 10F, -3F);
      B1.setTextureSize(128, 64);
      B1.mirror = true;
      setRotation(B1, 0F, 0F, 0F);
      B2 = new ModelRenderer(this, 0, 2);
      B2.addBox(0F, 0F, 0F, 32, 1, 6);
      B2.setRotationPoint(-38F, 21F, -3F);
      B2.setTextureSize(128, 64);
      B2.mirror = true;
      setRotation(B2, 0F, 0F, 0F);
      B3 = new ModelRenderer(this, 5, 1);
      B3.addBox(0F, 0F, 0F, 41, 6, 1);
      B3.setRotationPoint(-38F, 13F, 5F);
      B3.setTextureSize(128, 64);
      B3.mirror = true;
      setRotation(B3, 0F, 0F, 0F);
      B4 = new ModelRenderer(this, 5, 1);
      B4.addBox(0F, 0F, 0F, 41, 6, 1);
      B4.setRotationPoint(-38F, 13F, -6F);
      B4.setTextureSize(128, 64);
      B4.mirror = true;
      setRotation(B4, 0F, 0F, 0F);
      A2 = new ModelRenderer(this, 114, 0);
      A2.addBox(0F, 0F, 0F, 1, 3, 6);
      A2.setRotationPoint(-6F, 21F, -3F);
      A2.setTextureSize(128, 64);
      A2.mirror = true;
      setRotation(A2, 0F, 0F, 0F);
      A3 = new ModelRenderer(this, 112, 18);
      A3.addBox(0F, 0F, 0F, 7, 5, 1);
      A3.setRotationPoint(-4F, 19F, -6F);
      A3.setTextureSize(128, 64);
      A3.mirror = true;
      setRotation(A3, 0F, 0F, 0F);
      A4 = new ModelRenderer(this, 112, 18);
      A4.addBox(0F, 0F, 0F, 7, 5, 1);
      A4.setRotationPoint(-4F, 19F, 5F);
      A4.setTextureSize(128, 64);
      A4.mirror = true;
      setRotation(A4, 0F, 0F, 0F);
      C1 = new ModelRenderer(this, 0, 9);
      C1.addBox(0F, 0F, 0F, 43, 10, 10);
      C1.setRotationPoint(-38F, 11F, -5F);
      C1.setTextureSize(128, 64);
      C1.mirror = true;
      setRotation(C1, 0F, 0F, 0F);
      C2 = new ModelRenderer(this, 35, 19);
      C2.addBox(0F, 0F, 0F, 10, 3, 10);
      C2.setRotationPoint(-5F, 21F, -5F);
      C2.setTextureSize(128, 64);
      C2.mirror = true;
      setRotation(C2, 0F, 0F, 0F);
      D1 = new ModelRenderer(this, 2, 34);
      D1.addBox(0F, 0F, 0F, 1, 14, 14);
      D1.setRotationPoint(-39F, 9F, -7F);
      D1.setTextureSize(128, 64);
      D1.mirror = true;
      setRotation(D1, 0F, 0F, 0F);
      D2 = new ModelRenderer(this, 0, 32);
      D2.addBox(0F, 0F, 0F, 1, 16, 16);
      D2.setRotationPoint(-40F, 8F, -8F);
      D2.setTextureSize(128, 64);
      D2.mirror = true;
      setRotation(D2, 0F, 0F, 0F);
      E1 = new ModelRenderer(this, 0, 40);
      E1.addBox(0F, 0F, 0F, 2, 2, 6);
      E1.setRotationPoint(-39F, 8F, -3F);
      E1.setTextureSize(128, 64);
      E1.mirror = true;
      setRotation(E1, 0F, 0F, 0F);
      E2 = new ModelRenderer(this, 0, 40);
      E2.addBox(0F, 0F, 0F, 2, 2, 6);
      E2.setRotationPoint(-39F, 22F, -3F);
      E2.setTextureSize(128, 64);
      E2.mirror = true;
      setRotation(E2, 0F, 0F, 0F);
      E3 = new ModelRenderer(this, 4, 32);
      E3.addBox(0F, 0F, 0F, 2, 6, 2);
      E3.setRotationPoint(-39F, 13F, -8F);
      E3.setTextureSize(128, 64);
      E3.mirror = true;
      setRotation(E3, 0F, 0F, 0F);
      E4 = new ModelRenderer(this, 4, 32);
      E4.addBox(0F, 0F, 0F, 2, 6, 2);
      E4.setRotationPoint(-39F, 13F, 6F);
      E4.setTextureSize(128, 64);
      E4.mirror = true;
      setRotation(E4, 0F, 0F, 0F);
  }
  
  @Override
  public void renderPlus(Entity entity, float f, float f1, float f2, float f3, float f4, float f5, float progress)
  {
    A1.render(f5);
    B1.render(f5);
    B2.render(f5);
    B3.render(f5);
    B4.render(f5);
    A2.render(f5);
    A3.render(f5);
    A4.render(f5);
    C1.render(f5);
    C2.render(f5);
    D1.render(f5);
    D2.render(f5);
    E1.render(f5);
    E2.render(f5);
    E3.render(f5);
    E4.render(f5);
  }
}