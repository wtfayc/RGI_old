package com.ayc.rgi.block.decoration;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

import com.ayc.rgi.block.B_BlockRGI;
import com.ayc.rgi.utility.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSeament  extends B_BlockRGI{
	
	private final static String name = "Seament";
	private static int maxMeta = 16; 	//0:Seament, 1:Cobble, 2:BigBrick, 3:MossyBigBrick, 4:CrackedBigBrick, 5:SmallBrick, 6:MossySmallBrick
								//7:CrackedSmallBrick, 8:Pillar, 9:PillarBot, 10:PillarTop, 11:Chiseled, 12:Tile, 13:MossyTile
								//14:CrackedTile, 15:Etched
	private IIcon[] icons = new IIcon[maxMeta + 2];
		
	public BlockSeament()
	{
		super(Material.rock, maxMeta);
		this.setBlockName(name);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) 
	{
		for(int i = 0; i < icons.length; i++) 
        {
             icons[i] = iconRegister.registerIcon(Reference.TEXTURE_PATH + name + i);
        }
    }

	@SideOnly(Side.CLIENT) //0-17
    public IIcon getIcon(int side, int meta) 
	{
		switch(meta) 
		{
          	case 0:		{switch(side){	case 0 : case 1:	return icons[0];	default:	return icons[1];}} //seament
          	case 1: 	return icons[2]; //cobble
            case 2: 	return icons[3]; //bigbrick
            case 3: 	return icons[4]; //mossybigbrick
            case 4: 	return icons[5]; //crackedbigbrick
            case 5: 	return icons[6]; //smallbrick
            case 6: 	return icons[7]; //mossysmallbrick
            case 7: 	return icons[8]; //crackedsmallbrick
            case 8: 	{switch(side){	case 0 : case 1:	return icons[9];	default:	return icons[10];}} //pillar
            case 9: 	{switch(side){	case 0 : return icons[11];	case 1: return icons[9];	default:	return icons[12];}} //pillarbot
            case 10: 	{switch(side){	case 0 : return icons[9];	case 1: return icons[11];	default:	return icons[13];}} //pillartop
            case 11:	return icons[14]; //chiseled
            case 12:	return icons[15]; //tile
            case 13:	return icons[16]; //mossytile
            case 14:	return icons[17]; //crackedtile
            default:	return icons[11]; //etched
		}
	}
}