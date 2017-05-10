package com.ayc.rgi.block.machine;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.ayc.rgi.block.B_BlockRGIMachine3D;
import com.ayc.rgi.handler.CreativeTabsRGI;
import com.ayc.rgi.tileentity.multiblock.bloomery.TE_B_Bellow;
import com.ayc.rgi.tileentity.multiblock.bloomery.TE_B_BellowAuto;
import com.ayc.rgi.utility.WorldHelper;
import com.ayc.rgi.utility.interfaces.IAmTiered;
import com.ayc.rgi.utility.interfaces.IRotationHandler;


public class BlockMachine3D extends B_BlockRGIMachine3D implements ITileEntityProvider{
	
	private final static String name = "M3D";
	private static int maxMeta = 7;	//0-1:Bellow, 2-6:BellowAutomation
	
	public BlockMachine3D()
	{
		super(Material.iron, maxMeta);
		this.setBlockName(name);
		this.setCreativeTab(CreativeTabsRGI.RGI_MACHINES_TAB);
	}
	
	@Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityLiving, ItemStack itemStack)
    {
   		int meta = world.getBlockMetadata(x, y, z);
		TileEntity tileEntity = world.getTileEntity(x, y, z);
    	if (tileEntity == null) return;
   		if (tileEntity instanceof IRotationHandler)
   		{
   			((IRotationHandler) tileEntity).setWorldFacing(WorldHelper.whereAmIPointingTo(entityLiving));
			world.markBlockForUpdate(x, y, z);
   		}
   		if (tileEntity instanceof IAmTiered) ((IAmTiered) tileEntity).setTier(meta);
    }
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float vecX, float vecY, float vecZ) 
	{
		int meta = world.getBlockMetadata(x, y, z);
		TileEntity tileEntity = world.getTileEntity(x, y, z);
		if (tileEntity == null) return false;
		if (meta == 0 && player.getHeldItem() == null) 
		{
			if (!world.isRemote) ((TE_B_Bellow) tileEntity).activation();
			return true;
	    }
		return false;
	}

    @Override
    public TileEntity createNewTileEntity(World world, int meta) 
    {
    	switch(meta) 
		{	
			case 0: 	
			case 1:		return new TE_B_Bellow();
			case 2:	
			case 3:	
			case 4:	
			case 5:		
			case 6:		return new TE_B_BellowAuto();
            default: 	return null;
		}
    }
}