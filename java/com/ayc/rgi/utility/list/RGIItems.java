package com.ayc.rgi.utility.list;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public enum RGIItems {
	
	/*
	SODIUM_HYDROXIDE("SodiumHydroxide", true, "dust", RegItems.itembase, 1),
	CLEANSED_GRACILARIA("CleansedGracilaria", false, "", RegItems.itembase, 2),
	AGAR("Agar", false, "", RegItems.itembase, 3),
	SALT("Salt", true, "dust", RegItems.itembase, 4),
	DEWATERED_SLUDGE("DewateredSludge", false, "", RegItems.itembase, 5),
	*/
	;
	public String itemName;
	public boolean isOredict;
	public String oredictPrefix;
	public Item item;
	public int meta;
	public String oredictName;
	
	private RGIItems (String itemName, boolean isOredict, String oredictPrefix, Item item, int meta)
	{
		this.itemName = itemName;
		this.isOredict = isOredict;
		this.oredictPrefix = oredictPrefix;
		this.item = item;
		this.meta = meta;
		this.oredictName = oredictPrefix + itemName;
	}
	
	public ItemStack getItemStack(int qqty)
	{
		return new ItemStack(item, qqty, meta);
	}
	
}
