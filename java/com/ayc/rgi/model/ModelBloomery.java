package com.ayc.rgi.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBloomery extends BaseRGIModel
{
	  //fields
	    ModelRenderer A;
	    ModelRenderer B;
	    ModelRenderer C;
	    ModelRenderer D1;
	    ModelRenderer D2;
	    ModelRenderer E;
	    ModelRenderer F;
	    ModelRenderer G;
	    ModelRenderer K;
	    ModelRenderer L1;
	    ModelRenderer L2;
	    ModelRenderer M1;
	    ModelRenderer M2;
	  
	  public ModelBloomery()
	  {
	    textureWidth = 128;
	    textureHeight = 64;
	    
	      A = new ModelRenderer(this, 0, 55);
	      A.addBox(0F, 0F, 0F, 8, 8, 1);
	      A.setRotationPoint(-4F, 12F, -8F);
	      A.setTextureSize(128, 64);
	      A.mirror = true;
	      setRotation(A, 0F, 0F, 0F);
	      B = new ModelRenderer(this, 18, 36);
	      B.addBox(0F, 0F, 0F, 12, 17, 11);
	      B.setRotationPoint(-6F, -6F, -6F);
	      B.setTextureSize(128, 64);
	      B.mirror = true;
	      setRotation(B, 0F, 0F, 0F);
	      C = new ModelRenderer(this, 14, 19);
	      C.addBox(0F, 0F, 0F, 14, 4, 13);
	      C.setRotationPoint(-7F, 11F, -7F);
	      C.setTextureSize(128, 64);
	      C.mirror = true;
	      setRotation(C, 0F, 0F, 0F);
	      D1 = new ModelRenderer(this, 64, 42);
	      D1.addBox(0F, 0F, 0F, 5, 8, 14);
	      D1.setRotationPoint(-8F, 15F, -7F);
	      D1.setTextureSize(128, 64);
	      D1.mirror = true;
	      setRotation(D1, 0F, 0F, 0F);
	      D2 = new ModelRenderer(this, 64, 42);
	      D2.addBox(0F, 0F, 0F, 5, 8, 14);
	      D2.setRotationPoint(3F, 15F, -7F);
	      D2.setTextureSize(128, 64);
	      D2.mirror = true;
	      setRotation(D2, 0F, 0F, 0F);
	      E = new ModelRenderer(this, 64, 25);
	      E.addBox(0F, 0F, 0F, 16, 1, 16);
	      E.setRotationPoint(-8F, 23F, -8F);
	      E.setTextureSize(128, 64);
	      E.mirror = true;
	      setRotation(E, 0F, 0F, 0F);
	      F = new ModelRenderer(this, 88, 43);
	      F.addBox(0F, 0F, 0F, 7, 8, 5);
	      F.setRotationPoint(-3F, 15F, -7F);
	      F.setTextureSize(128, 64);
	      F.mirror = true;
	      setRotation(F, 0F, 0F, 0F);
	      G = new ModelRenderer(this, 102, 61);
	      G.addBox(0F, 0F, 0F, 10, 2, 1);
	      G.setRotationPoint(-5F, 9F, -7F);
	      G.setTextureSize(128, 64);
	      G.mirror = true;
	      setRotation(G, 0F, 0F, 0F);
	      K = new ModelRenderer(this, 76, 11);
	      K.addBox(0F, 0F, 0F, 10, 5, 9);
	      K.setRotationPoint(-5F, -11F, -5F);
	      K.setTextureSize(128, 64);
	      K.mirror = true;
	      setRotation(K, 0F, 0F, 0F);
	      L1 = new ModelRenderer(this, 85, 5);
	      L1.addBox(0F, 0F, 0F, 8, 4, 2);
	      L1.setRotationPoint(-4F, -15F, -4F);
	      L1.setTextureSize(128, 64);
	      L1.mirror = true;
	      setRotation(L1, 0F, 0F, 0F);
	      L2 = new ModelRenderer(this, 85, 5);
	      L2.addBox(0F, 0F, 0F, 8, 4, 2);
	      L2.setRotationPoint(-4F, -15F, 1F);
	      L2.setTextureSize(128, 64);
	      L2.mirror = true;
	      setRotation(L2, 0F, 0F, 0F);
	      M1 = new ModelRenderer(this, 105, 13);
	      M1.addBox(0F, 0F, 0F, 2, 4, 3);
	      M1.setRotationPoint(-4F, -15F, -2F);
	      M1.setTextureSize(128, 64);
	      M1.mirror = true;
	      setRotation(M1, 0F, 0F, 0F);
	      M2 = new ModelRenderer(this, 105, 13);
	      M2.addBox(0F, 0F, 0F, 2, 4, 3);
	      M2.setRotationPoint(2F, -15F, -2F);
	      M2.setTextureSize(128, 64);
	      M2.mirror = true;
	      setRotation(M2, 0F, 0F, 0F);
	  }
	  
	  @Override
	  public void renderPlus(Entity entity, float f, float f1, float f2, float f3, float f4, float f5, float progress)
	  {
	    A.render(f5);
	    B.render(f5);
	    C.render(f5);
	    D1.render(f5);
	    D2.render(f5);
	    E.render(f5);
	    F.render(f5);
	    G.render(f5);
	    K.render(f5);
	    L1.render(f5);
	    L2.render(f5);
	    M1.render(f5);
	    M2.render(f5);
	  }
}