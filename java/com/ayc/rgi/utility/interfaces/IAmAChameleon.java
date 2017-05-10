package com.ayc.rgi.utility.interfaces;

import net.minecraft.world.World;

/**Interface for chameleon blocks*/
public interface IAmAChameleon {
	
	void setChameleonState(World world, boolean trueForm);
	
	boolean getChameleonState();

}