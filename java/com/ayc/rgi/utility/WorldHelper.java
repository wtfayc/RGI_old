package com.ayc.rgi.utility;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class WorldHelper {

	/**Check block in world for block*/
	public static boolean isBlock(World world, int x, int y, int z, Block block)
	{
		return world.getBlock(x, y, z) == block;
	}
	
	/**Check block in world for block and meta*/
	public static boolean isBlockMeta(World world, int x, int y, int z, Block block, int meta)
	{
		if(world.getBlockMetadata(x, y, z) == meta && world.getBlock(x, y, z) == block) return true;
		return false;
	}
	
	/**Returns direction XZ the player is looking at*/
	public static int whereAmIPointingTo(EntityLivingBase entityLiving)
	{
		int yaw = MathHelper.floor_double((double)(entityLiving.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
		return yaw;
	}
	
	/**Get Forge Direction from facing*/
	public static ForgeDirection getForgeDirectionFromFacing(int facing)
	{
		switch (facing)
		{
		case 0 : 	return ForgeDirection.SOUTH;
		case 1 :	return ForgeDirection.WEST;
		case 2 :	return ForgeDirection.NORTH;
		case 3 :	return ForgeDirection.EAST;
		default:	return ForgeDirection.UNKNOWN;
		}
	}
}