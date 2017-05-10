package com.ayc.rgi.block.machine;

import com.ayc.rgi.block.B_BlockRGI;
import com.ayc.rgi.handler.CreativeTabsRGI;
import com.ayc.rgi.tileentity.multiblock.TE_M_Part;
import com.ayc.rgi.tileentity.multiblock.blastfurnace.TE_BF_GasOfftake;
import com.ayc.rgi.tileentity.multiblock.blastfurnace.TE_BF_Skimmer;
import com.ayc.rgi.tileentity.multiblock.blastfurnace.TE_BF_SlagRunner;
import com.ayc.rgi.tileentity.multiblock.hotblast.TE_HB_Separator;
import com.ayc.rgi.utility.Reference;
import com.ayc.rgi.utility.interfaces.IAmAChameleon;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Block_M_Part extends B_BlockRGI implements ITileEntityProvider{
	
	private final static String name = "MP";
	private static int maxMeta = 8;	//0:GasUptake 1:GasOfftake 2:BleederValve 3:IronNotch 4:Skimmer 5:CinderNotch 6:SlagRunner
								//7:HotBlastDuct
	
	private IIcon[] icons = new IIcon[maxMeta + 1];
	private IIcon[] iconsTech = new IIcon[1];
		
	public Block_M_Part()
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
		iconsTech[0] = iconRegister.registerIcon(Reference.TEXTURE_PATH + "Void");
    }

	@SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) 
	{
		return icons[meta];
	}
	
	@SideOnly(Side.CLIENT)
    public IIcon getIcon(IBlockAccess world, int x, int y, int z, int side) 
	{
		int meta = world.getBlockMetadata(x, y, z);
		TileEntity tileentity = world.getTileEntity(x, y, z);
		if (tileentity instanceof IAmAChameleon) if (((IAmAChameleon) tileentity).getChameleonState()) return iconsTech[0];
		return getIcon(side, meta);
	}

    @Override
    public boolean isOpaqueCube() 
    {
    	return false;
    }
    
    @Override
    public TileEntity createNewTileEntity(World world, int meta) 
    {
    	switch (meta)
    	{
    		case 1:		return new TE_BF_GasOfftake();
    		case 4:		return new TE_BF_Skimmer();
    		case 6:		return new TE_BF_SlagRunner();
    		case 7:		return new TE_HB_Separator();
    		default : 	return new TE_M_Part(); 
    	}
    }
}