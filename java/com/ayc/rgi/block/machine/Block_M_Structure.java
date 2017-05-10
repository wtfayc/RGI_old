package com.ayc.rgi.block.machine;

import com.ayc.rgi.block.B_BlockRGI;
import com.ayc.rgi.handler.CreativeTabsRGI;
import com.ayc.rgi.tileentity.multiblock.TE_M_Structure;
import com.ayc.rgi.tileentity.multiblock.blastfurnace.TE_BF_ReceivingHopper;
import com.ayc.rgi.tileentity.multiblock.blastfurnace.TE_BF_Sensor;
import com.ayc.rgi.tileentity.multiblock.blastfurnace.TE_BF_Tuyere;
import com.ayc.rgi.utility.Reference;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Block_M_Structure extends B_BlockRGI implements ITileEntityProvider{
	
	private final static String name = "MS";
	private static int maxMeta = 6;	//0:CastHouseBricks 1:RefactoryBricks 2:ConicalBell 3:ReceivingHopper 4:Sensor 5:Tuyere
	
	private IIcon[] icons = new IIcon[maxMeta];
		
	public Block_M_Structure()
	{
		super(Material.iron, maxMeta);
		this.setBlockName(name);
		this.setCreativeTab(CreativeTabsRGI.RGI_MULTIBLOCK_PARTS_TAB);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) 
	{
         for(int i = 0; i < icons.length; i++) 
        {
             icons[i] = iconRegister.registerIcon(Reference.TEXTURE_PATH + name + i);
        }
    }

	@SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) 
	{
		switch(meta) 
		{
          	case 1: 	return icons[1];
          	case 2: 	return icons[2];
          	case 3: 	return icons[3];
          	case 4: 	return icons[4];
          	case 5: 	return icons[5];
            default :	return icons[0];
		}
	}

    @Override
    public TileEntity createNewTileEntity(World world, int meta) 
    {
    	switch (meta)
    	{
    		case 3 : 	return new TE_BF_ReceivingHopper();
    		case 4 :	return new TE_BF_Sensor();
    		case 5 :	return new TE_BF_Tuyere();
    		default : 	return new TE_M_Structure(); 
    	}
    }
}