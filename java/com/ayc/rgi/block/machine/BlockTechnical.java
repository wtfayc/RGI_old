package com.ayc.rgi.block.machine;

import java.util.List;
import java.util.Random;

import com.ayc.rgi.block.B_BlockRGI;
import com.ayc.rgi.tileentity.technical.TE_Tech_GAG;
import com.ayc.rgi.utility.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.client.particle.EffectRenderer;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockTechnical extends B_BlockRGI implements ITileEntityProvider{

	private final String name = "Technical";
	private int maxMeta = 1; //0:GAG
	private IIcon[] icons = new IIcon[maxMeta];
		
	public BlockTechnical()
	{
		super();
		this.setBlockName(name);
		this.setCreativeTab(null);
	}
	
	@Override
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
		return icons[meta];
	}
	
	@Override
	public void breakBlock(World world, int x, int y, int z, Block oldid, int oldmeta) 
	{
		TileEntity tileentity = world.getTileEntity(x, y, z);
		if (tileentity != null)
		{
			if (tileentity instanceof TE_Tech_GAG) ((TE_Tech_GAG) tileentity).die();
			world.removeTileEntity(x, y, z);
		}
	}
    
    @SideOnly(Side.CLIENT)
    public boolean addDestroyEffects(World world, int x, int y, int z, int meta, EffectRenderer effectRenderer)
    {
    	if (meta == 0) return true; //GAG
    	else return false;
    }
    
	@Override
    public boolean shouldSideBeRendered(IBlockAccess world, int x, int y, int z, int side)
    {
    	int meta = world.getBlockMetadata(x, y, z);   
    	if (meta == 0) return false; //GAG
    	else return true;
    }
    
    @Override
    public boolean isOpaqueCube()
    {
    	return false;
    }
    
    @Override
    public TileEntity createNewTileEntity(World world, int meta) 
    {
    	switch(meta) 
		{
  			case 0 : 	return new TE_Tech_GAG(); //GAG
            default: 	return null;
		}
    }
    
	@Override
	public Item getItemDropped (int meta, Random par2Random, int par3)
	{
		return null;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void getSubBlocks(Item item, CreativeTabs creativeTabs, List list) 
    {
         for(int i = 0; i < maxMeta; i++)
         {
        	 list.add(new ItemStack(item, 1, i));
         }
    }
}