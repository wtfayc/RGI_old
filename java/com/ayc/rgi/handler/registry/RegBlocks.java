package com.ayc.rgi.handler.registry;

import com.ayc.rgi.block.B_BlockRGI;
import com.ayc.rgi.block.B_BlockRGIMachine3D;
import com.ayc.rgi.block.decoration.BlockSeament;
import com.ayc.rgi.block.machine.BlockTechnical;
import com.ayc.rgi.block.machine.Block_M_Controller;
import com.ayc.rgi.block.machine.Block_M_Part;
import com.ayc.rgi.block.machine.Block_M_Structure;
import com.ayc.rgi.block.machine.BlockMachine3D;
import com.ayc.rgi.item.ItemBlockRGI;
import com.ayc.rgi.utility.Reference;

import cpw.mods.fml.common.registry.GameRegistry;


@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class RegBlocks
{
	public static final B_BlockRGI multiblock = new Block_M_Structure();
	public static final B_BlockRGI multipart = new Block_M_Part();
	public static final B_BlockRGI controller = new Block_M_Controller();
	public static final B_BlockRGIMachine3D machine3D = new BlockMachine3D();
	public static final B_BlockRGI technical = new BlockTechnical();
	public static final B_BlockRGI seament = new BlockSeament();
	
	public static void init()
	{
		GameRegistry.registerBlock(multiblock, ItemBlockRGI.class, "multiblock");
		GameRegistry.registerBlock(multipart, ItemBlockRGI.class, "multipart");
		GameRegistry.registerBlock(controller, ItemBlockRGI.class, "controller");
		GameRegistry.registerBlock(machine3D, ItemBlockRGI.class, "machine3D");
		GameRegistry.registerBlock(technical, ItemBlockRGI.class, "technical");
		GameRegistry.registerBlock(seament, ItemBlockRGI.class, "seament");
	}
}