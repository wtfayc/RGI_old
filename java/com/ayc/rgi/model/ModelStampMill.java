package com.ayc.rgi.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelStampMill extends BaseRGIModel
{
	  //fields
	    ModelRenderer mB1;
	    ModelRenderer mB2;
	    ModelRenderer mC1;
	    ModelRenderer mC2;
	    ModelRenderer mC3;
	    ModelRenderer mC4;
	    ModelRenderer mD1;
	    ModelRenderer mD2;
	    ModelRenderer mD3;
	    ModelRenderer mD4;
	    ModelRenderer mE1;
	    ModelRenderer mF1;
	    ModelRenderer mF2;
	    ModelRenderer mF3;
	    ModelRenderer mF4;
	    ModelRenderer mE2;
	    ModelRenderer mE3;
	    ModelRenderer mE4;
	    ModelRenderer mG1;
	    ModelRenderer mG2;
	    ModelRenderer mG3;
	    ModelRenderer mG4;
	    ModelRenderer H;
	    ModelRenderer I1;
	    ModelRenderer mJ1;
	    ModelRenderer mJ2;
	    ModelRenderer mK1;
	    ModelRenderer mK2;
	    ModelRenderer mK3;
	    ModelRenderer mK4;
	    ModelRenderer mK5;
	    ModelRenderer mK6;
	    ModelRenderer mK7;
	    ModelRenderer mK8;
	    ModelRenderer L1;
	    ModelRenderer L2;
	    ModelRenderer M1;
	    ModelRenderer M2;
	    ModelRenderer M3;
	    ModelRenderer M4;
	    ModelRenderer M5;
	    ModelRenderer M6;
	    ModelRenderer N1;
	    ModelRenderer N2;
	    ModelRenderer O1;
	    ModelRenderer P1;
	    ModelRenderer P2;
	    ModelRenderer O2;
	    ModelRenderer O3;
	    ModelRenderer Q1;
	    ModelRenderer Q2;
	    ModelRenderer S1;
	    ModelRenderer Q3;
	    ModelRenderer S2;
	    ModelRenderer Q4;
	    ModelRenderer S3;
	    ModelRenderer Q5;
	    ModelRenderer S4;
	    ModelRenderer I2;
	    ModelRenderer T;
	    ModelRenderer mU1;
	    ModelRenderer mU2;
	    ModelRenderer mU3;
	    ModelRenderer mU4;
	    ModelRenderer mU5;
	    ModelRenderer mU6;
	    ModelRenderer mU7;
	    ModelRenderer mU8;
	    ModelRenderer mU9;
	    ModelRenderer V1;
	    ModelRenderer V2;
	  
	  public ModelStampMill()
	  {
	    textureWidth = 256;
	    textureHeight = 128;
	    
	      mB1 = new ModelRenderer(this, 0, 75);
	      mB1.addBox(0F, 0F, 0F, 37, 2, 2);
	      mB1.setRotationPoint(-24.5F, -1F, -1F);
	      mB1.setTextureSize(64, 32);
	      mB1.mirror = true;
	      setRotation(mB1, 0F, 0F, 0F);
	      mB2 = new ModelRenderer(this, 0, 75);
	      mB2.addBox(0F, 0F, 0F, 37, 2, 2);
	      mB2.setRotationPoint(-24.5F, 0F, -1.5F);
	      mB2.setTextureSize(64, 32);
	      mB2.mirror = true;
	      setRotation(mB2, 0.7853982F, 0F, 0F);
	      mC1 = new ModelRenderer(this, 0, 112);
	      mC1.addBox(0F, 0F, 0F, 2, 4, 11);
	      mC1.setRotationPoint(5F, -2F, -5.5F);
	      mC1.setTextureSize(64, 32);
	      mC1.mirror = true;
	      setRotation(mC1, 0F, 0F, 0F);
	      mC2 = new ModelRenderer(this, 1, 108);
	      mC2.addBox(0F, 0F, 0F, 2, 11, 4);
	      mC2.setRotationPoint(1F, -5.5F, -2F);
	      mC2.setTextureSize(64, 32);
	      mC2.mirror = true;
	      setRotation(mC2, 0F, 0F, 0F);
	      mC3 = new ModelRenderer(this, 0, 112);
	      mC3.addBox(0F, 0F, 0F, 2, 4, 11);
	      mC3.setRotationPoint(-3F, -2F, -5.5F);
	      mC3.setTextureSize(64, 32);
	      mC3.mirror = true;
	      setRotation(mC3, 0F, 0F, 0F);
	      mC4 = new ModelRenderer(this, 1, 108);
	      mC4.addBox(0F, 0F, 0F, 2, 11, 4);
	      mC4.setRotationPoint(-7F, -5.5F, -2F);
	      mC4.setTextureSize(64, 32);
	      mC4.mirror = true;
	      setRotation(mC4, 0F, 0F, 0F);
	      mD1 = new ModelRenderer(this, 15, 110);
	      mD1.addBox(0F, 0F, 0F, 3, 10, 3);
	      mD1.setRotationPoint(0.5F, -7F, 5F);
	      mD1.setTextureSize(64, 32);
	      mD1.mirror = true;
	      setRotation(mD1, 0F, 0F, 0F);
	      mD2 = new ModelRenderer(this, 15, 110);
	      mD2.addBox(0F, 0F, 0F, 3, 10, 3);
	      mD2.setRotationPoint(-7.5F, -7F, 5F);
	      mD2.setTextureSize(64, 32);
	      mD2.mirror = true;
	      setRotation(mD2, 0F, 0F, 0F);
	      mD3 = new ModelRenderer(this, 15, 110);
	      mD3.addBox(0F, 0F, 0F, 3, 10, 3);
	      mD3.setRotationPoint(-3.5F, -10.3F, 5F);
	      mD3.setTextureSize(64, 32);
	      mD3.mirror = true;
	      setRotation(mD3, 0F, 0F, 0F);
	      mD4 = new ModelRenderer(this, 15, 110);
	      mD4.addBox(0F, 0F, 0F, 3, 10, 3);
	      mD4.setRotationPoint(4.5F, -10.3F, 5F);
	      mD4.setTextureSize(64, 32);
	      mD4.mirror = true;
	      setRotation(mD4, 0F, 0F, 0F);
	      mE1 = new ModelRenderer(this, 27, 99);
	      mE1.addBox(0F, 0F, 0F, 1, 27, 1);
	      mE1.setRotationPoint(-6.5F, -17F, 6F);
	      mE1.setTextureSize(64, 32);
	      mE1.mirror = true;
	      setRotation(mE1, 0F, 0F, 0F);
	      mF1 = new ModelRenderer(this, 32, 115);
	      mF1.addBox(0F, 0F, 0F, 4, 8, 4);
	      mF1.setRotationPoint(-8F, 10F, 4.5F);
	      mF1.setTextureSize(64, 32);
	      mF1.mirror = true;
	      setRotation(mF1, 0F, 0F, 0F);
	      mF2 = new ModelRenderer(this, 32, 115);
	      mF2.addBox(0F, 0F, 0F, 4, 8, 4);
	      mF2.setRotationPoint(-4F, 6.7F, 4.5F);
	      mF2.setTextureSize(64, 32);
	      mF2.mirror = true;
	      setRotation(mF2, 0F, 0F, 0F);
	      mF3 = new ModelRenderer(this, 32, 115);
	      mF3.addBox(0F, 0F, 0F, 4, 8, 4);
	      mF3.setRotationPoint(0F, 10F, 4.5F);
	      mF3.setTextureSize(64, 32);
	      mF3.mirror = true;
	      setRotation(mF3, 0F, 0F, 0F);
	      mF4 = new ModelRenderer(this, 32, 115);
	      mF4.addBox(0F, 0F, 0F, 4, 8, 4);
	      mF4.setRotationPoint(4F, 6.7F, 4.5F);
	      mF4.setTextureSize(64, 32);
	      mF4.mirror = true;
	      setRotation(mF4, 0F, 0F, 0F);
	      mE2 = new ModelRenderer(this, 27, 99);
	      mE2.addBox(0F, 0F, 0F, 1, 27, 1);
	      mE2.setRotationPoint(1.5F, -17F, 6F);
	      mE2.setTextureSize(64, 32);
	      mE2.mirror = true;
	      setRotation(mE2, 0F, 0F, 0F);
	      mE3 = new ModelRenderer(this, 27, 99);
	      mE3.addBox(0F, 0F, 0F, 1, 27, 1);
	      mE3.setRotationPoint(-2.5F, -20.3F, 6F);
	      mE3.setTextureSize(64, 32);
	      mE3.mirror = true;
	      setRotation(mE3, 0F, 0F, 0F);
	      mE4 = new ModelRenderer(this, 27, 99);
	      mE4.addBox(0F, 0F, 0F, 1, 27, 1);
	      mE4.setRotationPoint(5.5F, -20.3F, 6F);
	      mE4.setTextureSize(64, 32);
	      mE4.mirror = true;
	      setRotation(mE4, 0F, 0F, 0F);
	      mG1 = new ModelRenderer(this, 34, 110);
	      mG1.addBox(0F, 0F, 0F, 3, 2, 3);
	      mG1.setRotationPoint(-3.5F, -22.3F, 5F);
	      mG1.setTextureSize(64, 32);
	      mG1.mirror = true;
	      setRotation(mG1, 0F, 0F, 0F);
	      mG2 = new ModelRenderer(this, 34, 110);
	      mG2.addBox(0F, 0F, 0F, 3, 2, 3);
	      mG2.setRotationPoint(4.5F, -22.3F, 5F);
	      mG2.setTextureSize(64, 32);
	      mG2.mirror = true;
	      setRotation(mG2, 0F, 0F, 0F);
	      mG3 = new ModelRenderer(this, 34, 110);
	      mG3.addBox(0F, 0F, 0F, 3, 2, 3);
	      mG3.setRotationPoint(0.5F, -19F, 5F);
	      mG3.setTextureSize(64, 32);
	      mG3.mirror = true;
	      setRotation(mG3, 0F, 0F, 0F);
	      mG4 = new ModelRenderer(this, 34, 110);
	      mG4.addBox(0F, 0F, 0F, 3, 2, 3);
	      mG4.setRotationPoint(-7.5F, -19F, 5F);
	      mG4.setTextureSize(64, 32);
	      mG4.mirror = true;
	      setRotation(mG4, 0F, 0F, 0F);
	      H = new ModelRenderer(this, 0, 92);
	      H.addBox(0F, 0F, 0F, 18, 2, 5);
	      H.setRotationPoint(-9F, -17F, 4F);
	      H.setTextureSize(64, 32);
	      H.mirror = true;
	      setRotation(H, 0F, 0F, 0F);
	      I1 = new ModelRenderer(this, 0, 81);
	      I1.addBox(0F, 0F, 0F, 16, 6, 5);
	      I1.setRotationPoint(-8F, 18F, -24F);
	      I1.setTextureSize(64, 32);
	      I1.mirror = true;
	      setRotation(I1, 0F, 0F, 0F);
	      mJ1 = new ModelRenderer(this, 0, 71);
	      mJ1.addBox(0F, 0F, 0F, 9, 2, 2);
	      mJ1.setRotationPoint(-20F, 20F, 19F);
	      mJ1.setTextureSize(64, 32);
	      mJ1.mirror = true;
	      setRotation(mJ1, 0F, 0F, 0F);
	      mJ2 = new ModelRenderer(this, 0, 71);
	      mJ2.addBox(0F, 0F, 0F, 9, 2, 2);
	      mJ2.setRotationPoint(-20F, 21F, 18.5F);
	      mJ2.setTextureSize(64, 32);
	      mJ2.mirror = true;
	      setRotation(mJ2, 0.7853982F, 0F, 0F);
	      mK1 = new ModelRenderer(this, 0, 63);
	      mK1.addBox(0F, 0F, 0F, 2, 4, 4);
	      mK1.setRotationPoint(-19F, 19F, 18F);
	      mK1.setTextureSize(64, 32);
	      mK1.mirror = true;
	      setRotation(mK1, 0F, 0F, 0F);
	      mK2 = new ModelRenderer(this, 0, 63);
	      mK2.addBox(0F, 0F, 0F, 2, 4, 4);
	      mK2.setRotationPoint(-19F, 21F, 17F);
	      mK2.setTextureSize(64, 32);
	      mK2.mirror = true;
	      setRotation(mK2, 0.7853982F, 0F, 0F);
	      mK3 = new ModelRenderer(this, 0, 63);
	      mK3.addBox(0F, 0F, 0F, 2, 4, 4);
	      mK3.setRotationPoint(-19F, 20F, 17.5F);
	      mK3.setTextureSize(64, 32);
	      mK3.mirror = true;
	      setRotation(mK3, 0.3839724F, 0F, 0F);
	      mK4 = new ModelRenderer(this, 0, 63);
	      mK4.addBox(0F, 0F, 0F, 2, 4, 4);
	      mK4.setRotationPoint(-19F, 22.1F, 17.4F);
	      mK4.setTextureSize(64, 32);
	      mK4.mirror = true;
	      setRotation(mK4, 1.169371F, 0F, 0F);
	      mK5 = new ModelRenderer(this, 0, 63);
	      mK5.addBox(0F, 0F, 0F, 2, 4, 4);
	      mK5.setRotationPoint(-19F, -2F, -2F);
	      mK5.setTextureSize(64, 32);
	      mK5.mirror = true;
	      setRotation(mK5, 0F, 0F, 0F);
	      mK6 = new ModelRenderer(this, 0, 63);
	      mK6.addBox(0F, 0F, 0F, 2, 4, 4);
	      mK6.setRotationPoint(-19F, 0F, -3F);
	      mK6.setTextureSize(64, 32);
	      mK6.mirror = true;
	      setRotation(mK6, 0.7853982F, 0F, 0F);
	      mK7 = new ModelRenderer(this, 0, 63);
	      mK7.addBox(0F, 0F, 0F, 2, 4, 4);
	      mK7.setRotationPoint(-19F, 1.1F, -2.6F);
	      mK7.setTextureSize(64, 32);
	      mK7.mirror = true;
	      setRotation(mK7, 1.169371F, 0F, 0F);
	      mK8 = new ModelRenderer(this, 0, 63);
	      mK8.addBox(0F, 0F, 0F, 2, 4, 4);
	      mK8.setRotationPoint(-19F, -1F, -2.5F);
	      mK8.setTextureSize(64, 32);
	      mK8.mirror = true;
	      setRotation(mK8, 0.3839724F, 0F, 0F);
	      L1 = new ModelRenderer(this, 36, 95);
	      L1.addBox(0F, 0F, 0F, 3, 1, 32);
	      L1.setRotationPoint(-19.5F, -3.1F, 1F);
	      L1.setTextureSize(64, 32);
	      L1.mirror = true;
	      setRotation(L1, -0.8028514F, 0F, 0F);
	      L2 = new ModelRenderer(this, 37, 96);
	      L2.addBox(0F, 0F, 0F, 3, 1, 31);
	      L2.setRotationPoint(-19.5F, 1F, -2F);
	      L2.setTextureSize(64, 32);
	      L2.mirror = true;
	      setRotation(L2, -0.8080874F, 0F, 0F);
	      M1 = new ModelRenderer(this, 133, 93);
	      M1.addBox(0F, 0F, 0F, 3, 1, 3);
	      M1.setRotationPoint(-19.5F, -3.1F, -2F);
	      M1.setTextureSize(64, 32);
	      M1.mirror = true;
	      setRotation(M1, 0F, 0F, 0F);
	      M2 = new ModelRenderer(this, 128, 92);
	      M2.addBox(0F, 0F, 0F, 3, 3, 1);
	      M2.setRotationPoint(-19.5F, -1.4F, -3F);
	      M2.setTextureSize(64, 32);
	      M2.mirror = true;
	      setRotation(M2, 0F, 0F, 0F);
	      M3 = new ModelRenderer(this, 142, 93);
	      M3.addBox(0F, 0F, 0F, 3, 1, 2);
	      M3.setRotationPoint(-19.5F, -1.4F, -3F);
	      M3.setTextureSize(64, 32);
	      M3.mirror = true;
	      setRotation(M3, 1.0297442F, 0F, 0F);
	      M4 = new ModelRenderer(this, 133, 93);
	      M4.addBox(0F, 0F, 0F, 3, 1, 3);
	      M4.setRotationPoint(-19.5F, 23F, 18.7F);
	      M4.setTextureSize(64, 32);
	      M4.mirror = true;
	      setRotation(M4, 0F, 0F, 0F);
	      M5 = new ModelRenderer(this, 128, 92);
	      M5.addBox(0F, 0F, 0F, 3, 3, 1);
	      M5.setRotationPoint(-19.5F, 19.8F, 22.3F);
	      M5.setTextureSize(64, 32);
	      M5.mirror = true;
	      setRotation(M5, 0F, 0F, 0F);
	      M6 = new ModelRenderer(this, 128, 92);
	      M6.addBox(0F, 0F, 0F, 3, 2, 1);
	      M6.setRotationPoint(-19.5F, 22F, 22.6F);
	      M6.setTextureSize(64, 32);
	      M6.mirror = true;
	      setRotation(M6, -0.9599310F, 0F, 0F);
	      N1 = new ModelRenderer(this, 106, 80);
	      N1.addBox(0F, 0F, 0F, 3, 41, 7);
	      N1.setRotationPoint(9F, -17F, 3F);
	      N1.setTextureSize(64, 32);
	      N1.mirror = true;
	      setRotation(N1, 0F, 0F, 0F);
	      N2 = new ModelRenderer(this, 106, 80);
	      N2.addBox(0F, 0F, 0F, 3, 41, 7);
	      N2.setRotationPoint(-12F, -17F, 3F);
	      N2.setTextureSize(64, 32);
	      N2.mirror = true;
	      setRotation(N2, 0F, 0F, 0F);
	      O1 = new ModelRenderer(this, 131, 97);
	      O1.addBox(0F, 0F, 0F, 3, 26, 5);
	      O1.setRotationPoint(9F, -2F, -2F);
	      O1.setTextureSize(64, 32);
	      O1.mirror = true;
	      setRotation(O1, 0F, 0F, 0F);
	      P1 = new ModelRenderer(this, 148, 14);
	      P1.addBox(0F, 0F, 0F, 1, 9, 48);
	      P1.setRotationPoint(-9F, 15F, -24F);
	      P1.setTextureSize(64, 32);
	      P1.mirror = true;
	      setRotation(P1, 0F, 0F, 0F);
	      P2 = new ModelRenderer(this, 148, 14);
	      P2.addBox(0F, 0F, 0F, 1, 9, 48);
	      P2.setRotationPoint(8F, 15F, -24F);
	      P2.setTextureSize(64, 32);
	      P2.mirror = true;
	      setRotation(P2, 0F, 0F, 0F);
	      O2 = new ModelRenderer(this, 161, 97);
	      O2.addBox(0F, 0F, 0F, 6, 26, 5);
	      O2.setRotationPoint(-15F, -2F, -2F);
	      O2.setTextureSize(64, 32);
	      O2.mirror = true;
	      setRotation(O2, 0F, 0F, 0F);
	      O3 = new ModelRenderer(this, 147, 98);
	      O3.addBox(0F, 0F, 0F, 3, 26, 4);
	      O3.setRotationPoint(-24F, -2F, -2F);
	      O3.setTextureSize(64, 32);
	      O3.mirror = true;
	      setRotation(O3, 0F, 0F, 0F);
	      Q1 = new ModelRenderer(this, 183, 105);
	      Q1.addBox(0F, 0F, 0F, 3, 20, 3);
	      Q1.setRotationPoint(-24F, 5F, -1F);
	      Q1.setTextureSize(64, 32);
	      Q1.mirror = true;
	      setRotation(Q1, 0F, 0F, -0.4712389F);
	      Q2 = new ModelRenderer(this, 195, 87);
	      Q2.addBox(0F, 0F, 0F, 2, 25, 3);
	      Q2.setRotationPoint(9.5F, 0F, -2F);
	      Q2.setTextureSize(64, 32);
	      Q2.mirror = true;
	      setRotation(Q2, -0.5235988F, 0F, 0F);
	      S1 = new ModelRenderer(this, 205, 118);
	      S1.addBox(0F, 0F, 0F, 3, 3, 5);
	      S1.setRotationPoint(9F, 21F, -15F);
	      S1.setTextureSize(64, 32);
	      S1.mirror = true;
	      setRotation(S1, 0F, 0F, 0F);
	      Q3 = new ModelRenderer(this, 195, 87);
	      Q3.addBox(0F, 0F, 0F, 2, 38, 3);
	      Q3.setRotationPoint(9.5F, -12F, 7F);
	      Q3.setTextureSize(64, 32);
	      Q3.mirror = true;
	      setRotation(Q3, 0.3490659F, 0F, 0F);
	      S2 = new ModelRenderer(this, 205, 118);
	      S2.addBox(0F, 0F, 0F, 3, 3, 5);
	      S2.setRotationPoint(9F, 21F, 17.83333F);
	      S2.setTextureSize(64, 32);
	      S2.mirror = true;
	      setRotation(S2, 0F, 0F, 0F);
	      Q4 = new ModelRenderer(this, 195, 87);
	      Q4.addBox(0F, 0F, 0F, 2, 23, 3);
	      Q4.setRotationPoint(-14F, 1F, 0F);
	      Q4.setTextureSize(64, 32);
	      Q4.mirror = true;
	      setRotation(Q4, 0.3490659F, 0F, 0F);
	      S3 = new ModelRenderer(this, 205, 110);
	      S3.addBox(0F, 0F, 0F, 6, 3, 5);
	      S3.setRotationPoint(-14.5F, 21F, 6.5F);
	      S3.setTextureSize(64, 32);
	      S3.mirror = true;
	      setRotation(S3, 0F, 0F, 0F);
	      Q5 = new ModelRenderer(this, 195, 87);
	      Q5.addBox(0F, 0F, 0F, 2, 25, 3);
	      Q5.setRotationPoint(-11.5F, 0F, -2F);
	      Q5.setTextureSize(64, 32);
	      Q5.mirror = true;
	      setRotation(Q5, -0.5235988F, 0F, 0F);
	      S4 = new ModelRenderer(this, 205, 118);
	      S4.addBox(0F, 0F, 0F, 3, 3, 5);
	      S4.setRotationPoint(-12F, 21F, -15F);
	      S4.setTextureSize(64, 32);
	      S4.mirror = true;
	      setRotation(S4, 0F, 0F, 0F);
	      I2 = new ModelRenderer(this, 0, 81);
	      I2.addBox(0F, 0F, 0F, 16, 6, 5);
	      I2.setRotationPoint(-8F, 18F, 19F);
	      I2.setTextureSize(64, 32);
	      I2.mirror = true;
	      setRotation(I2, 0F, 0F, 0F);
	      T = new ModelRenderer(this, 78, 38);
	      T.addBox(0F, 0F, 0F, 16, 4, 38);
	      T.setRotationPoint(-8F, 20F, -19F);
	      T.setTextureSize(64, 32);
	      T.mirror = true;
	      setRotation(T, 0F, 0F, 0F);
	      mU1 = new ModelRenderer(this, 148, 73);
	      mU1.addBox(0F, 0F, 0F, 16, 1, 2);
	      mU1.setRotationPoint(-8F, 19F, -19F);
	      mU1.setTextureSize(64, 32);
	      mU1.mirror = true;
	      setRotation(mU1, 0F, 0F, 0F);
	      mU2 = new ModelRenderer(this, 148, 71);
	      mU2.addBox(0F, 0F, 0F, 16, 1, 4);
	      mU2.setRotationPoint(-8F, 19F, -16F);
	      mU2.setTextureSize(64, 32);
	      mU2.mirror = true;
	      setRotation(mU2, 0F, 0F, 0F);
	      mU3 = new ModelRenderer(this, 148, 71);
	      mU3.addBox(0F, 0F, 0F, 16, 1, 4);
	      mU3.setRotationPoint(-8F, 19F, -11F);
	      mU3.setTextureSize(64, 32);
	      mU3.mirror = true;
	      setRotation(mU3, 0F, 0F, 0F);
	      mU4 = new ModelRenderer(this, 148, 71);
	      mU4.addBox(0F, 0F, 0F, 16, 1, 4);
	      mU4.setRotationPoint(-8F, 19F, -6F);
	      mU4.setTextureSize(64, 32);
	      mU4.mirror = true;
	      setRotation(mU4, 0F, 0F, 0F);
	      mU5 = new ModelRenderer(this, 148, 71);
	      mU5.addBox(0F, 0F, 0F, 16, 1, 4);
	      mU5.setRotationPoint(-8F, 19F, -1F);
	      mU5.setTextureSize(64, 32);
	      mU5.mirror = true;
	      setRotation(mU5, 0F, 0F, 0F);
	      mU6 = new ModelRenderer(this, 148, 71);
	      mU6.addBox(0F, 0F, 0F, 16, 1, 4);
	      mU6.setRotationPoint(-8F, 19F, 4F);
	      mU6.setTextureSize(64, 32);
	      mU6.mirror = true;
	      setRotation(mU6, 0F, 0F, 0F);
	      mU7 = new ModelRenderer(this, 148, 71);
	      mU7.addBox(0F, 0F, 0F, 16, 1, 4);
	      mU7.setRotationPoint(-8F, 19F, 9F);
	      mU7.setTextureSize(64, 32);
	      mU7.mirror = true;
	      setRotation(mU7, 0F, 0F, 0F);
	      mU8 = new ModelRenderer(this, 148, 71);
	      mU8.addBox(0F, 0F, 0F, 16, 1, 4);
	      mU8.setRotationPoint(-8F, 19F, 14F);
	      mU8.setTextureSize(64, 32);
	      mU8.mirror = true;
	      setRotation(mU8, 0F, 0F, 0F);
	      mU9 = new ModelRenderer(this, 148, 71);
	      mU9.addBox(0F, 0F, 0F, 16, 1, 4);
	      mU9.setRotationPoint(-8F, 19F, 19F);
	      mU9.setTextureSize(64, 32);
	      mU9.mirror = true;
	      setRotation(mU9, 0F, 0F, 0F);
	      V1 = new ModelRenderer(this, 12, 63);
	      V1.addBox(0F, 0F, 0F, 2, 4, 4);
	      V1.setRotationPoint(-11F, 19F, 18F);
	      V1.setTextureSize(64, 32);
	      V1.mirror = true;
	      setRotation(V1, 0F, 0F, 0F);
	      V2 = new ModelRenderer(this, 12, 63);
	      V2.addBox(0F, 0F, 0F, 2, 4, 4);
	      V2.setRotationPoint(-16F, 19F, 18F);
	      V2.setTextureSize(64, 32);
	      V2.mirror = true;
	      setRotation(V2, 0F, 0F, 0F);
	  }
	  
	  @Override
	  public void renderPlus(Entity entity, float f, float f1, float f2, float f3, float f4, float f5, float progress)
	  {
		  GL11.glTranslated(1, 1, 0);
		  H.render(f5);
		  I1.render(f5);
		  L1.render(f5);
		  L2.render(f5);
		  M1.render(f5);
		  M2.render(f5);
		  M3.render(f5);
		  M4.render(f5);
		  M5.render(f5);
		  M6.render(f5);
		  N1.render(f5);
		  N2.render(f5);
		  O1.render(f5);
		  P1.render(f5);
		  P2.render(f5);
		  O2.render(f5);
		  O3.render(f5);
		  Q1.render(f5);
		  Q2.render(f5);
		  S1.render(f5);
		  Q3.render(f5);
		  S2.render(f5);
		  Q4.render(f5);
		  S3.render(f5);
		  Q5.render(f5);
		  S4.render(f5);
		  I2.render(f5);
		  T.render(f5);
		  V1.render(f5);
		  V2.render(f5);	  
		  //Rotation
		  float angle = (float) progress / 100 * 180;
		  GL11.glRotatef(angle, 1, 0, 0);  
		  mB1.render(f5);
		  mB2.render(f5);  
		  mC1.render(f5);
		  mC2.render(f5);
		  mC3.render(f5);
		  mC4.render(f5);
		  mK5.render(f5);
		  mK6.render(f5);
		  mK7.render(f5);
		  mK8.render(f5);
		  GL11.glRotatef(-angle, 1, 0, 0);
		  float ydim = 1.3125F;
		  float zdim = 1.25F;
		  GL11.glTranslated(0, ydim, zdim);
		  GL11.glRotatef(angle, 1, 0, 0);
		  GL11.glTranslated(0, -ydim, -zdim);
		  mJ1.render(f5);
		  mJ2.render(f5);
		  mK1.render(f5);
		  mK2.render(f5);
		  mK3.render(f5);
		  mK4.render(f5);
		  GL11.glTranslated(0, ydim, zdim);
		  GL11.glRotatef(-angle, 1, 0, 0);
		  GL11.glTranslated(0, -ydim, -zdim);  
		  //Translation
		  float mvt3 = (float) progress / 100 * 0.3125F;
		  float mvt = getMvt(progress + 10);
		  float shiftedprogress = progress + 61;
		  if (shiftedprogress >= 101) shiftedprogress = progress - 40; 
		  float mvt2 = getMvt(shiftedprogress);
		  GL11.glTranslatef(0.0F, -mvt, 0.0F);
		  mD1.render(f5);
		  mD2.render(f5);
		  mE1.render(f5);
		  mE2.render(f5);
		  mF1.render(f5);
		  mF3.render(f5);
		  mG3.render(f5);
		  mG4.render(f5);
		  GL11.glTranslatef(0.0F, (float) (mvt - mvt2 + 0.3125 * 2 / 3), 0.0F);
		  mD3.render(f5);
		  mD4.render(f5);
		  mE3.render(f5);
		  mE4.render(f5);
		  mF2.render(f5);
		  mF4.render(f5);
		  mG1.render(f5);
		  mG2.render(f5);
		  GL11.glTranslatef(0.0F,(float) (mvt2 - 0.3125 * 2 / 3), 0.0F);		  
		  GL11.glTranslatef(0.0F, 0.0F, -mvt3); 	  
		  mU1.render(f5);
		  mU2.render(f5);
		  mU3.render(f5);
		  mU4.render(f5);
		  mU5.render(f5);
		  mU6.render(f5);
		  mU7.render(f5);
		  mU8.render(f5);
		  mU9.render(f5);
	  }
	  
	  private float getMvt(float progress)
	  {
		  float archaic = progress - 20;
		  float mvt = 0;
		  if (archaic >= 0 && archaic < 60) mvt = (float) archaic / 60 * 0.3125F;
		  if (archaic >= 60 && archaic < 70) mvt = (float) (70 - archaic) / 10 * 0.3125F;
		  return mvt;
	  }
}