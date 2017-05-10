package com.ayc.rgi.handler;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTabsRGI
{
		public static CreativeTabs RGI_BASE_TAB = new CreativeTabs("RGI BASE")
		{
			@Override
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem()
			{
				return Items.ender_eye;
			}
		};
		
		public static CreativeTabs RGI_MACHINES_TAB = new CreativeTabs("RGI MACHINES")
		{
			@Override
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem()
			{
				return Items.ender_eye;
			}
		};
		
		public static CreativeTabs RGI_MULTIBLOCK_PARTS_TAB = new CreativeTabs("RGI MULTIBLOCK PARTS")
		{
			@Override
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem()
			{
				return Items.ender_eye;
			}
		};
}