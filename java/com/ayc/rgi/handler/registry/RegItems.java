package com.ayc.rgi.handler.registry;

import net.minecraftforge.oredict.OreDictionary;

import com.ayc.rgi.item.BaseItemRGI;
import com.ayc.rgi.item.ItemRGI;
import com.ayc.rgi.item.ItemTool;
import com.ayc.rgi.utility.Reference;
import com.ayc.rgi.utility.list.RGIItems;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class RegItems {
	
	public static final BaseItemRGI itembase = new ItemRGI();
	public static final BaseItemRGI itemtool = new ItemTool();
	
	public static void init()
	{
		//GameRegistry.registerItem(itembase, "itembase");
		GameRegistry.registerItem(itemtool, "itemtool");
		
		for (RGIItems items : RGIItems.values())
		{
			if (items.isOredict)	OreDictionary.registerOre(items.oredictName, items.getItemStack(1));
		}
	}
}