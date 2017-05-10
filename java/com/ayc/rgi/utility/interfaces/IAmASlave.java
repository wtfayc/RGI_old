package com.ayc.rgi.utility.interfaces;

import net.minecraft.world.World;

/**Interface for Multiblock slave blocks*/
public interface IAmASlave {
	
	void setMaster(World world, int Xmaster, int Ymaster, int Zmaster);
	
	void die();

}