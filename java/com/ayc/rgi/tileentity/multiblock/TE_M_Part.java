package com.ayc.rgi.tileentity.multiblock;

import com.ayc.rgi.utility.interfaces.IAmAChameleon;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

/**Extension of TileEntityMStructure implementing IAmAChameleon, used for non ticking Multiblock parts*/
public class TE_M_Part extends TE_M_Structure implements IAmAChameleon{

	boolean state = false;
	
	//=====================================IAmAChameleon=====================================
	public void setChameleonState(World world, boolean trueForm)
	{
		this.state = trueForm;
	}
	
	public boolean getChameleonState()
	{
		return state;
	}
	
	//=====================================Base=====================================
	@Override
	public void readFromNBT(NBTTagCompound nbttagcompound)
	{
		super.readFromNBT(nbttagcompound);
		state = nbttagcompound.getBoolean("state");
	}

	@Override
	public void writeToNBT(NBTTagCompound nbttagcompound)
	{
		super.writeToNBT(nbttagcompound);
		nbttagcompound.setBoolean("state", state);
	}
}