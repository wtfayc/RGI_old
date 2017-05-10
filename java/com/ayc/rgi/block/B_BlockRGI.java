package com.ayc.rgi.block;

import java.util.List;

import com.ayc.rgi.handler.CreativeTabsRGI;
import com.ayc.rgi.utility.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**Basic Block class + metablocks*/
public class B_BlockRGI extends Block
{
	protected int maxMeta;
	
	public B_BlockRGI(Material material, int maxMeta)
	{
		super(material);
		this.setCreativeTab(CreativeTabsRGI.RGI_BASE_TAB);
		this.maxMeta = maxMeta;
	}
	
	public B_BlockRGI()
	{
		this(Material.rock, 0);
		this.setHardness(10.0f);
		this.setResistance(200.0f);
		this.setHarvestLevel("pickaxe",2);
	}
	
	@Override
	public String getUnlocalizedName()
	{
		return String.format("tile.%s%s", Reference.TEXTURE_PATH, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	{
		return unlocalizedName.substring(unlocalizedName.indexOf(".") +1);
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
	
	@Override 
	public int damageDropped(int meta) 
	{
		return meta;
	}
}