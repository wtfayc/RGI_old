package com.ayc.rgi.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockRGI extends ItemBlock{

	public ItemBlockRGI(Block block) 
	{
        super(block);
        setHasSubtypes(true);
    }
	
    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
 
        String name;
        switch(itemStack.getItemDamage()) 
        {
        	case 0:		name = "0";			break;
        	case 1:		name = "1";			break;
        	case 2:		name = "2";			break;
        	case 3:		name = "3";			break;
        	case 4:		name = "4";			break;
        	case 5:		name = "5";			break;
        	case 6:		name = "6";			break;
        	case 7:		name = "7";			break;
        	case 8:		name = "8";			break;
        	case 9:		name = "9";			break;
        	case 10:	name = "10";		break;
        	case 11:	name = "11";		break;
        	case 12:	name = "12";		break;
        	case 13:	name = "13";		break;
        	case 14:	name = "14";		break;
        	case 15:	name = "15";		break;
            default:	name = "errored";	break;
        }
        return getUnlocalizedName() + "_" + name;
    }
	
    @Override
    public int getMetadata(int meta) 
    {
        return meta;
    }
}