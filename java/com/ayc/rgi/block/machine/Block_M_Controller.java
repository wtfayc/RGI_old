package com.ayc.rgi.block.machine;

import com.ayc.rgi.block.B_BlockRGI;
import com.ayc.rgi.handler.CreativeTabsRGI;
import com.ayc.rgi.tileentity.multiblock.bloomery.TE_B_Ctrl;
import com.ayc.rgi.tileentity.multiblock.stampmill.TE_SM_Ctrl;
import com.ayc.rgi.utility.Reference;
import com.ayc.rgi.utility.interfaces.IAmAChameleon;
import com.ayc.rgi.utility.interfaces.IAmTheMaster;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Block_M_Controller extends B_BlockRGI implements ITileEntityProvider{
	
	private final static String name = "MC";
	private static int maxMeta = 2;	//0:Bloomery, 1:StampMill
	
	private IIcon[] icons = new IIcon[maxMeta];
	private IIcon[] iconsTech = new IIcon[1];
		
	public Block_M_Controller()
	{
		super(Material.iron, maxMeta);
		this.setBlockName(name);
		this.setCreativeTab(CreativeTabsRGI.RGI_MULTIBLOCK_PARTS_TAB);
	}

 	//=====================================Model=====================================
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
    
 	//=====================================Interaction=====================================
    @Override
	public void breakBlock(World world, int x, int y, int z, Block oldid, int oldmeta) 
	{
		TileEntity tileentity = world.getTileEntity(x, y, z);
		if (tileentity != null)
		{
			if (tileentity instanceof IAmTheMaster) ((IAmTheMaster) tileentity).splitStructure();
			world.removeTileEntity(x, y, z);
		}
	}
    
 	//=====================================Function=====================================
    @Override
    public TileEntity createNewTileEntity(World world, int meta) 
    {
    	switch(meta) 
		{	
			case 0: 	return new TE_B_Ctrl();
			case 1:		return new TE_SM_Ctrl();
            default: 	return null;
		}
    }
}