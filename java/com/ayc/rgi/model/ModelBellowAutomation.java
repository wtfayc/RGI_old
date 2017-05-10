package com.ayc.rgi.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelBellowAutomation extends BaseRGIModel
{
	  //fields
	    ModelRenderer mA1;
	    ModelRenderer mA2;
	    ModelRenderer mB1;
	    ModelRenderer mB2;
	    ModelRenderer mA3;
	    ModelRenderer mA4;
	    ModelRenderer C1;
	    ModelRenderer C2;
	    ModelRenderer mD1;
	    ModelRenderer mD2;
	    ModelRenderer mD3;
	    ModelRenderer mD4;
	    ModelRenderer mE2;
	    ModelRenderer mF1;
	    ModelRenderer mG1;
	    ModelRenderer mG2;
	    ModelRenderer mF2;
	    ModelRenderer mG3;
	    ModelRenderer mG4;
	    ModelRenderer mH1;
	    ModelRenderer mH2;
	    ModelRenderer I;
	    ModelRenderer J1;
	    ModelRenderer K1;
	    ModelRenderer L1;
	    ModelRenderer M1;
	    ModelRenderer N1;
	    ModelRenderer N2;
	    ModelRenderer J2;
	    ModelRenderer K2;
	    ModelRenderer L2;
	    ModelRenderer O1;
	    ModelRenderer O2;
	    ModelRenderer O3;
	    ModelRenderer O4;
	    ModelRenderer M2;
	    ModelRenderer M3;
	    ModelRenderer P1;
	    ModelRenderer P2;
	    ModelRenderer P3;
	    ModelRenderer P4;
	    ModelRenderer mQ1;
	    ModelRenderer mQ2;
	    ModelRenderer mQ3;
	    ModelRenderer mQ4;
	    ModelRenderer R1;
	    ModelRenderer S1;
	    ModelRenderer S2;
	    ModelRenderer T1;
	    ModelRenderer T2;
	    ModelRenderer T3;
	    ModelRenderer T4;
	    ModelRenderer R2;
	    ModelRenderer S3;
	    ModelRenderer S4;
	    ModelRenderer mE1;
	  
	  public ModelBellowAutomation()
	  {
	    textureWidth = 128;
	    textureHeight = 64;
	    
	      mA1 = new ModelRenderer(this, 0, 48);
	      mA1.addBox(0F, 0F, 0F, 3, 1, 15);
	      mA1.setRotationPoint(2F, 8F, 8F);
	      mA1.setTextureSize(128, 64);
	      mA1.mirror = true;
	      setRotation(mA1, 0F, 0F, 0F);
	      mA2 = new ModelRenderer(this, 0, 48);
	      mA2.addBox(0F, 0F, 0F, 3, 1, 15);
	      mA2.setRotationPoint(-5F, 8F, 8F);
	      mA2.setTextureSize(128, 64);
	      mA2.mirror = true;
	      setRotation(mA2, 0F, 0F, 0F);
	      mB1 = new ModelRenderer(this, 21, 59);
	      mB1.addBox(0F, 0F, 0F, 10, 1, 3);
	      mB1.setRotationPoint(-5F, 8F, 5F);
	      mB1.setTextureSize(128, 64);
	      mB1.mirror = true;
	      setRotation(mB1, 0F, 0F, 0F);
	      mB2 = new ModelRenderer(this, 21, 59);
	      mB2.addBox(0F, 0F, 0F, 10, 1, 3);
	      mB2.setRotationPoint(-5F, 23F, 5F);
	      mB2.setTextureSize(128, 64);
	      mB2.mirror = true;
	      setRotation(mB2, 0F, 0F, 0F);
	      mA3 = new ModelRenderer(this, 0, 48);
	      mA3.addBox(0F, 0F, 0F, 3, 1, 15);
	      mA3.setRotationPoint(-5F, 23F, 8F);
	      mA3.setTextureSize(128, 64);
	      mA3.mirror = true;
	      setRotation(mA3, 0F, 0F, 0F);
	      mA4 = new ModelRenderer(this, 0, 48);
	      mA4.addBox(0F, 0F, 0F, 3, 1, 15);
	      mA4.setRotationPoint(2F, 23F, 8F);
	      mA4.setTextureSize(128, 64);
	      mA4.mirror = true;
	      setRotation(mA4, 0F, 0F, 0F);
	      C1 = new ModelRenderer(this, 0, 57);
	      C1.addBox(0F, 0F, 0F, 3, 5, 1);
	      C1.setRotationPoint(-5F, 19F, 3F);
	      C1.setTextureSize(128, 64);
	      C1.mirror = true;
	      setRotation(C1, 0F, 0F, 0F);
	      C2 = new ModelRenderer(this, 0, 57);
	      C2.addBox(0F, 0F, 0F, 3, 5, 1);
	      C2.setRotationPoint(2F, 8F, 3F);
	      C2.setTextureSize(128, 64);
	      C2.mirror = true;
	      setRotation(C2, 0F, 0F, 0F);
	      mD1 = new ModelRenderer(this, 80, 59);
	      mD1.addBox(0F, 0F, 0F, 4, 4, 1);
	      mD1.setRotationPoint(-5F, 14F, 3F);
	      mD1.setTextureSize(128, 64);
	      mD1.mirror = true;
	      setRotation(mD1, 0F, 0F, 0F);
	      mD2 = new ModelRenderer(this, 80, 59);
	      mD2.addBox(0F, 0F, 0F, 4, 4, 1);
	      mD2.setRotationPoint(-3F, 13.2F, 3F);
	      mD2.setTextureSize(128, 64);
	      mD2.mirror = true;
	      setRotation(mD2, 0F, 0F, 0.7853982F);
	      mD3 = new ModelRenderer(this, 80, 59);
	      mD3.addBox(0F, 0F, 0F, 4, 4, 1);
	      mD3.setRotationPoint(1F, 14F, 3F);
	      mD3.setTextureSize(128, 64);
	      mD3.mirror = true;
	      setRotation(mD3, 0F, 0F, 0F);
	      mD4 = new ModelRenderer(this, 80, 59);
	      mD4.addBox(0F, 0F, 0F, 4, 4, 1);
	      mD4.setRotationPoint(3F, 13.2F, 3F);
	      mD4.setTextureSize(128, 64);
	      mD4.mirror = true;
	      setRotation(mD4, 0F, 0F, 0.7853982F);
	      mE2 = new ModelRenderer(this, 76, 56);
	      mE2.addBox(0F, 0F, 0F, 1, 7, 1);
	      mE2.setRotationPoint(3F, 8F, 4F);
	      mE2.setTextureSize(128, 64);
	      mE2.mirror = true;
	      setRotation(mE2, 0F, 0F, 0F);
	      mF1 = new ModelRenderer(this, 80, 48);
	      mF1.addBox(0F, 0F, 0F, 2, 2, 9);
	      mF1.setRotationPoint(-1F, 15F, -8.5F);
	      mF1.setTextureSize(128, 64);
	      mF1.mirror = true;
	      setRotation(mF1, 0F, 0F, 0F);
	      mG1 = new ModelRenderer(this, 79, 52);
	      mG1.addBox(0F, 0F, 0F, 2, 2, 3);
	      mG1.setRotationPoint(-4F, 15F, 0F);
	      mG1.setTextureSize(128, 64);
	      mG1.mirror = true;
	      setRotation(mG1, 0F, 0F, 0F);
	      mG2 = new ModelRenderer(this, 79, 52);
	      mG2.addBox(0F, 0F, 0F, 2, 2, 3);
	      mG2.setRotationPoint(2F, 15F, 0F);
	      mG2.setTextureSize(128, 64);
	      mG2.mirror = true;
	      setRotation(mG2, 0F, 0F, 0F);
	      mF2 = new ModelRenderer(this, 80, 48);
	      mF2.addBox(0F, 0F, 0F, 2, 2, 9);
	      mF2.setRotationPoint(0F, 14.6F, -8.5F);
	      mF2.setTextureSize(128, 64);
	      mF2.mirror = true;
	      setRotation(mF2, 0F, 0F, 0.7853982F);
	      mG3 = new ModelRenderer(this, 79, 52);
	      mG3.addBox(0F, 0F, 0F, 2, 2, 3);
	      mG3.setRotationPoint(3F, 14.6F, 0F);
	      mG3.setTextureSize(128, 64);
	      mG3.mirror = true;
	      setRotation(mG3, 0F, 0F, 0.7853982F);
	      mG4 = new ModelRenderer(this, 79, 52);
	      mG4.addBox(0F, 0F, 0F, 2, 2, 3);
	      mG4.setRotationPoint(-3F, 14.6F, 0F);
	      mG4.setTextureSize(128, 64);
	      mG4.mirror = true;
	      setRotation(mG4, 0F, 0F, 0.7853982F);
	      mH1 = new ModelRenderer(this, 93, 53);
	      mH1.addBox(0F, 0F, 0F, 3, 3, 1);
	      mH1.setRotationPoint(0F, 13.8F, 0F);
	      mH1.setTextureSize(128, 64);
	      mH1.mirror = true;
	      setRotation(mH1, 0F, 0F, 0.7853982F);
	      mH2 = new ModelRenderer(this, 93, 53);
	      mH2.addBox(0F, 0F, 0F, 3, 3, 1);
	      mH2.setRotationPoint(-1.5F, 14.5F, 0F);
	      mH2.setTextureSize(128, 64);
	      mH2.mirror = true;
	      setRotation(mH2, 0F, 0F, 0F);
	      I = new ModelRenderer(this, 0, 38);
	      I.addBox(0F, 0F, 0F, 14, 1, 9);
	      I.setRotationPoint(-7F, 23F, -7F);
	      I.setTextureSize(128, 64);
	      I.mirror = true;
	      setRotation(I, 0F, 0F, 0F);
	      J1 = new ModelRenderer(this, 0, 24);
	      J1.addBox(0F, 0F, 0F, 16, 13, 1);
	      J1.setRotationPoint(-8F, 11F, -8F);
	      J1.setTextureSize(128, 64);
	      J1.mirror = true;
	      setRotation(J1, 0F, 0F, 0F);
	      K1 = new ModelRenderer(this, 34, 34);
	      K1.addBox(0F, 0F, 0F, 10, 3, 1);
	      K1.setRotationPoint(-5F, 8F, -8F);
	      K1.setTextureSize(128, 64);
	      K1.mirror = true;
	      setRotation(K1, 0F, 0F, 0F);
	      L1 = new ModelRenderer(this, 47, 29);
	      L1.addBox(0F, 0F, 0F, 1, 8, 9);
	      L1.setRotationPoint(7F, 16F, -7F);
	      L1.setTextureSize(128, 64);
	      L1.mirror = true;
	      setRotation(L1, 0F, 0F, 0F);
	      M1 = new ModelRenderer(this, 34, 24);
	      M1.addBox(0F, 0F, 0F, 4, 9, 1);
	      M1.setRotationPoint(-2F, 14F, -2F);
	      M1.setTextureSize(128, 64);
	      M1.mirror = true;
	      setRotation(M1, 0F, 0F, 0F);
	      N1 = new ModelRenderer(this, 44, 28);
	      N1.addBox(0F, 0F, 0F, 2, 5, 1);
	      N1.setRotationPoint(2F, 18F, -2F);
	      N1.setTextureSize(128, 64);
	      N1.mirror = true;
	      setRotation(N1, 0F, 0F, 0F);
	      N2 = new ModelRenderer(this, 44, 28);
	      N2.addBox(0F, 0F, 0F, 2, 5, 1);
	      N2.setRotationPoint(-4F, 18F, -2F);
	      N2.setTextureSize(128, 64);
	      N2.mirror = true;
	      setRotation(N2, 0F, 0F, 0F);
	      J2 = new ModelRenderer(this, 0, 24);
	      J2.addBox(0F, 0F, 0F, 16, 13, 1);
	      J2.setRotationPoint(-8F, 11F, 2F);
	      J2.setTextureSize(128, 64);
	      J2.mirror = true;
	      setRotation(J2, 0F, 0F, 0F);
	      K2 = new ModelRenderer(this, 34, 34);
	      K2.addBox(0F, 0F, 0F, 10, 3, 1);
	      K2.setRotationPoint(-5F, 8F, 2F);
	      K2.setTextureSize(128, 64);
	      K2.mirror = true;
	      setRotation(K2, 0F, 0F, 0F);
	      L2 = new ModelRenderer(this, 47, 29);
	      L2.addBox(0F, 0F, 0F, 1, 8, 9);
	      L2.setRotationPoint(-8F, 16F, -7F);
	      L2.setTextureSize(128, 64);
	      L2.mirror = true;
	      setRotation(L2, 0F, 0F, 0F);
	      O1 = new ModelRenderer(this, 0, 42);
	      O1.addBox(0F, 0F, 0F, 1, 3, 2);
	      O1.setRotationPoint(7F, 13F, -7F);
	      O1.setTextureSize(128, 64);
	      O1.mirror = true;
	      setRotation(O1, 0F, 0F, 0F);
	      O2 = new ModelRenderer(this, 0, 42);
	      O2.addBox(0F, 0F, 0F, 1, 3, 2);
	      O2.setRotationPoint(7F, 13F, 0F);
	      O2.setTextureSize(128, 64);
	      O2.mirror = true;
	      setRotation(O2, 0F, 0F, 0F);
	      O3 = new ModelRenderer(this, 0, 42);
	      O3.addBox(0F, 0F, 0F, 1, 3, 2);
	      O3.setRotationPoint(-8F, 13F, -7F);
	      O3.setTextureSize(128, 64);
	      O3.mirror = true;
	      setRotation(O3, 0F, 0F, 0F);
	      O4 = new ModelRenderer(this, 0, 42);
	      O4.addBox(0F, 0F, 0F, 1, 3, 2);
	      O4.setRotationPoint(-8F, 13F, 0F);
	      O4.setTextureSize(128, 64);
	      O4.mirror = true;
	      setRotation(O4, 0F, 0F, 0F);
	      M2 = new ModelRenderer(this, 34, 24);
	      M2.addBox(0F, 0F, 0F, 4, 9, 1);
	      M2.setRotationPoint(-5F, 14F, 1F);
	      M2.setTextureSize(128, 64);
	      M2.mirror = true;
	      setRotation(M2, 0F, 0F, 0F);
	      M3 = new ModelRenderer(this, 34, 24);
	      M3.addBox(0F, 0F, 0F, 4, 9, 1);
	      M3.setRotationPoint(1F, 14F, 1F);
	      M3.setTextureSize(128, 64);
	      M3.mirror = true;
	      setRotation(M3, 0F, 0F, 0F);
	      P1 = new ModelRenderer(this, 0, 51);
	      P1.addBox(0F, 0F, 0F, 1, 5, 1);
	      P1.setRotationPoint(2F, 8F, 4F);
	      P1.setTextureSize(128, 64);
	      P1.mirror = true;
	      setRotation(P1, 0F, 0F, 0F);
	      P2 = new ModelRenderer(this, 0, 51);
	      P2.addBox(0F, 0F, 0F, 1, 5, 1);
	      P2.setRotationPoint(4F, 8F, 4F);
	      P2.setTextureSize(128, 64);
	      P2.mirror = true;
	      setRotation(P2, 0F, 0F, 0F);
	      P3 = new ModelRenderer(this, 0, 51);
	      P3.addBox(0F, 0F, 0F, 1, 5, 1);
	      P3.setRotationPoint(-5F, 19F, 4F);
	      P3.setTextureSize(128, 64);
	      P3.mirror = true;
	      setRotation(P3, 0F, 0F, 0F);
	      P4 = new ModelRenderer(this, 0, 51);
	      P4.addBox(0F, 0F, 0F, 1, 5, 1);
	      P4.setRotationPoint(-3F, 19F, 4F);
	      P4.setTextureSize(128, 64);
	      P4.mirror = true;
	      setRotation(P4, 0F, 0F, 0F);
	      mQ1 = new ModelRenderer(this, 11, 61);
	      mQ1.addBox(0F, 0F, 0F, 1, 1, 1);
	      mQ1.setRotationPoint(-6F, 8F, 6F);
	      mQ1.setTextureSize(128, 64);
	      mQ1.mirror = true;
	      setRotation(mQ1, 0F, 0F, 0F);
	      mQ2 = new ModelRenderer(this, 11, 61);
	      mQ2.addBox(0F, 0F, 0F, 1, 1, 1);
	      mQ2.setRotationPoint(-6F, 23F, 6F);
	      mQ2.setTextureSize(128, 64);
	      mQ2.mirror = true;
	      setRotation(mQ2, 0F, 0F, 0F);
	      mQ3 = new ModelRenderer(this, 11, 61);
	      mQ3.addBox(0F, 0F, 0F, 1, 1, 1);
	      mQ3.setRotationPoint(5F, 23F, 6F);
	      mQ3.setTextureSize(128, 64);
	      mQ3.mirror = true;
	      setRotation(mQ3, 0F, 0F, 0F);
	      mQ4 = new ModelRenderer(this, 11, 61);
	      mQ4.addBox(0F, 0F, 0F, 1, 1, 1);
	      mQ4.setRotationPoint(5F, 8F, 6F);
	      mQ4.setTextureSize(128, 64);
	      mQ4.mirror = true;
	      setRotation(mQ4, 0F, 0F, 0F);
	      R1 = new ModelRenderer(this, 120, 45);
	      R1.addBox(0F, 0F, 0F, 1, 16, 3);
	      R1.setRotationPoint(-7F, 8F, 5F);
	      R1.setTextureSize(128, 64);
	      R1.mirror = true;
	      setRotation(R1, 0F, 0F, 0F);
	      S1 = new ModelRenderer(this, 116, 47);
	      S1.addBox(0F, 0F, 0F, 1, 16, 1);
	      S1.setRotationPoint(-6F, 8F, 5F);
	      S1.setTextureSize(128, 64);
	      S1.mirror = true;
	      setRotation(S1, 0F, 0F, 0F);
	      S2 = new ModelRenderer(this, 116, 47);
	      S2.addBox(0F, 0F, 0F, 1, 16, 1);
	      S2.setRotationPoint(-6F, 8F, 7F);
	      S2.setTextureSize(128, 64);
	      S2.mirror = true;
	      setRotation(S2, 0F, 0F, 0F);
	      T1 = new ModelRenderer(this, 106, 57);
	      T1.addBox(0F, 0F, 0F, 1, 3, 4);
	      T1.setRotationPoint(-8F, 21F, 3F);
	      T1.setTextureSize(128, 64);
	      T1.mirror = true;
	      setRotation(T1, 0F, 0F, 0F);
	      T2 = new ModelRenderer(this, 106, 57);
	      T2.addBox(0F, 0F, 0F, 1, 3, 4);
	      T2.setRotationPoint(-8F, 12F, 3F);
	      T2.setTextureSize(128, 64);
	      T2.mirror = true;
	      setRotation(T2, 0F, 0F, 0F);
	      T3 = new ModelRenderer(this, 106, 57);
	      T3.addBox(0F, 0F, 0F, 1, 3, 4);
	      T3.setRotationPoint(7F, 12F, 3F);
	      T3.setTextureSize(128, 64);
	      T3.mirror = true;
	      setRotation(T3, 0F, 0F, 0F);
	      T4 = new ModelRenderer(this, 106, 57);
	      T4.addBox(0F, 0F, 0F, 1, 3, 4);
	      T4.setRotationPoint(7F, 21F, 3F);
	      T4.setTextureSize(128, 64);
	      T4.mirror = true;
	      setRotation(T4, 0F, 0F, 0F);
	      R2 = new ModelRenderer(this, 120, 45);
	      R2.addBox(0F, 0F, 0F, 1, 16, 3);
	      R2.setRotationPoint(6F, 8F, 5F);
	      R2.setTextureSize(128, 64);
	      R2.mirror = true;
	      setRotation(R2, 0F, 0F, 0F);
	      S3 = new ModelRenderer(this, 116, 47);
	      S3.addBox(0F, 0F, 0F, 1, 16, 1);
	      S3.setRotationPoint(5F, 8F, 7F);
	      S3.setTextureSize(128, 64);
	      S3.mirror = true;
	      setRotation(S3, 0F, 0F, 0F);
	      S4 = new ModelRenderer(this, 116, 47);
	      S4.addBox(0F, 0F, 0F, 1, 16, 1);
	      S4.setRotationPoint(5F, 8F, 5F);
	      S4.setTextureSize(128, 64);
	      S4.mirror = true;
	      setRotation(S4, 0F, 0F, 0F);
	      mE1 = new ModelRenderer(this, 76, 56);
	      mE1.addBox(0F, 0F, 0F, 1, 7, 1);
	      mE1.setRotationPoint(-4F, 17F, 4F);
	      mE1.setTextureSize(128, 64);
	      mE1.mirror = true;
	      setRotation(mE1, 0F, 0F, 0F);
	  }
	  
	  @Override
	  public void renderPlus(Entity entity, float f, float f1, float f2, float f3, float f4, float f5, float progress)
	  {  
	    C1.render(f5);
	    C2.render(f5);
	    I.render(f5);
	    J1.render(f5);
	    K1.render(f5);
	    L1.render(f5);
	    M1.render(f5);
	    N1.render(f5);
	    N2.render(f5);
	    J2.render(f5);
	    K2.render(f5);
	    L2.render(f5);
	    O1.render(f5);
	    O2.render(f5);
	    O3.render(f5);
	    O4.render(f5);
	    M2.render(f5);
	    M3.render(f5);
	    P1.render(f5);
	    P2.render(f5);
	    P3.render(f5);
	    P4.render(f5);
	    R1.render(f5);
	    S1.render(f5);
	    S2.render(f5);
	    T1.render(f5);
	    T2.render(f5);
	    T3.render(f5);
	    T4.render(f5);
	    R2.render(f5);
	    S3.render(f5);
	    S4.render(f5);
	    //Rotation
	    float angle = (float) progress / 100 * 360;
	    GL11.glTranslated(0, 1, 0);
	    GL11.glRotatef(angle, 0, 0, 1);
	    GL11.glTranslated(0, -1, 0);
	    mF1.render(f5);
	    mF2.render(f5);    
	    mH1.render(f5);
	    mH2.render(f5);
	    GL11.glTranslated(0, 1, 0);
	    GL11.glRotatef(-angle, 0, 0, 1);
	    GL11.glTranslated(0, -1, 0);
	    float xdim = -0.2F;
	    GL11.glTranslated(xdim, 1, 0);
	    GL11.glRotatef(-angle, 0, 0, 1);
	    GL11.glTranslated(-xdim, -1, 0);
	    mD1.render(f5);
	    mD2.render(f5);
	    mG1.render(f5);
	    mG4.render(f5);
	    GL11.glTranslated(xdim, 1, 0);
	    GL11.glRotatef(angle, 0, 0, 1);
	    GL11.glTranslated(-xdim, -1, 0);
	    GL11.glTranslated(-xdim, 1, 0);
	    GL11.glRotatef(-angle, 0, 0, 1);
	    GL11.glTranslated(xdim, -1, 0);
	    mD3.render(f5);
	    mD4.render(f5);
	    mG2.render(f5);
	    mG3.render(f5);
	    GL11.glTranslated(-xdim, 1, 0);
	    GL11.glRotatef(angle, 0, 0, 1);
	    GL11.glTranslated(xdim, -1, 0);
	    //Translation
	    float mvt = MathHelper.sin((float) (Math.PI * progress / 100)) * 0.1875F;
	    GL11.glTranslatef(0.0F, mvt, 0.0F);
	    mA1.render(f5);
	    mA2.render(f5);
	    mB1.render(f5);
	    mE2.render(f5);	    
	    mQ1.render(f5);
	    mQ4.render(f5);
	    GL11.glTranslatef(0.0F, -2 * mvt, 0.0F);   
	    mB2.render(f5);
	    mA3.render(f5);
	    mA4.render(f5);
	    mE1.render(f5);
	    mQ2.render(f5);
	    mQ3.render(f5); 
	  }
}