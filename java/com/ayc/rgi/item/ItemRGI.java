package com.ayc.rgi.item;

import java.util.List;

import com.ayc.rgi.utility.Reference;
import com.ayc.rgi.utility.list.RGIItems;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemRGI extends BaseItemRGI{
	
	private final static String name = "GIGBaseItem"; 
	private int maxMetaBase = 0;
	private IIcon[] iconsBase = new IIcon[maxMetaBase];
	
	public ItemRGI() 
	{
        super();
        this.setHasSubtypes(true);
        this.setUnlocalizedName(name);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) 
	{
	    for (int i = 0; i < iconsBase.length; i ++) 
	    {
	    	this.iconsBase[i] = iconRegister.registerIcon(Reference.TEXTURE_PATH + RGIItems.values()[i].itemName);
	    }	
	}
	
	@Override
	public IIcon getIconFromDamage(int meta) 
	{
		return this.iconsBase[meta];   
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list) 
	{
		for (int i = 0; i < maxMetaBase; i ++) 
	    {
	        list.add(new ItemStack(item, 1, i));
	    }
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) 
	{
	    return this.getUnlocalizedName() + "_" + RGIItems.values()[stack.getItemDamage()].itemName;
	}

}