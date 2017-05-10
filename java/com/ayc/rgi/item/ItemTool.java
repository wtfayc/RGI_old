package com.ayc.rgi.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.ayc.rgi.utility.Reference;
import com.ayc.rgi.utility.interfaces.IAmTheMaster;
import com.ayc.rgi.utility.interfaces.IRotationHandler;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemTool extends BaseItemRGI{

	private final static String name = "GIGItemTool"; 
	private int maxMeta = 1;
	private IIcon[] iconsBase = new IIcon[maxMeta];
	
	public ItemTool() 
	{
        super();
        this.setHasSubtypes(true);
        this.setUnlocalizedName(name);
        this.maxStackSize = 1;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) 
	{
	    for (int i = 0; i < iconsBase.length; i ++) 
	    {
	    	this.iconsBase[i] = iconRegister.registerIcon(Reference.TEXTURE_PATH + RGIItemTool.values()[i].textureName);
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
		for (int i = 0; i < maxMeta; i ++) 
	    {
	        list.add(new ItemStack(item, 1, i));
	    }
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) 
	{
	    return this.getUnlocalizedName() + "_" + RGIItemTool.values()[stack.getItemDamage()].itemName;
	}
	
	@Override
	public boolean onItemUse(ItemStack itemStack, EntityPlayer entityPlayer, World world, int x, int y, int z, int s, float par8, float par9, float par10)
	{
		TileEntity tileEntity = world.getTileEntity(x, y, z);
		if (tileEntity == null) return false;
		if (!entityPlayer.isSneaking())
		{
			if (tileEntity instanceof IRotationHandler) ((IRotationHandler) tileEntity).rotateModel();
			if (tileEntity instanceof IAmTheMaster) ((IAmTheMaster) tileEntity).assembleStructure();
		}
		if (entityPlayer.isSneaking())
		{
			if (tileEntity instanceof IAmTheMaster) ((IAmTheMaster) tileEntity).splitStructure();
		}
		return true;
	}
	
	private enum RGIItemTool
	{
		WRENCH("Wrench", "Wrench"),
		
		;
		public String itemName;
		public String textureName;
		
		private RGIItemTool(String itemName, String textureName)
		{
			this.itemName = itemName;
			this.textureName = textureName;
		}
	}
}