package com.ayc.rgi.block;

import net.minecraft.block.material.Material;

/**This class extends BlockRGIBaseMachine and implements all the usual crap for model rendering*/
public class B_BlockRGIMachine3D extends B_BlockRGIMachine{
	
	public B_BlockRGIMachine3D(Material material, int maxMeta)
	{
		super(material, maxMeta);
	}

    @Override
    public int getRenderType()
    {
    	return -1;
    }
    
    @Override
    public boolean isOpaqueCube() 
    {
    	return false;
    }
    
    public boolean renderAsNormalBlock() 
    {
    	return false;
    }
}