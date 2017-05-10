package com.ayc.rgi.utility.interfaces;

/**Interface for rotable blocks*/
public interface IRotationHandler 
{
	public void setWorldFacing(int worldFacing);

	public void rotateModel();

	public int getFacing();
}