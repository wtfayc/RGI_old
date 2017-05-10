package com.ayc.rgi.tileentity.multiblock.stampmill;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import com.ayc.rgi.tileentity.BTE_1_0_SI;
import com.ayc.rgi.utility.interfaces.IAmAChameleon;
import com.ayc.rgi.utility.interfaces.IAmTheMaster;
import com.ayc.rgi.utility.interfaces.ISpinRightRound;

public class TE_SM_Ctrl extends BTE_1_0_SI implements IAmAChameleon, IAmTheMaster, ISpinRightRound{

	boolean state = true;
	float progress = 0;
	
	public TE_SM_Ctrl() 
	{
		super(-1, 0);
	}
	
	@Override
	public void writeToNBT(NBTTagCompound nbt)
	{
		super.writeToNBT(nbt);
		nbt.setBoolean("state", state);
		progress = nbt.getFloat("progress");
	}
	
	@Override
	public void readFromNBT(NBTTagCompound nbt)
	{
		super.readFromNBT(nbt);
		state = nbt.getBoolean("state");
		nbt.setFloat("progress", (float)progress);
	}
	
 	//=====================================Base=====================================
 	public void updateEntity()
 	{	
 		progress += 2;
 		if (progress >= 100) progress = 0;
 	}
 	
	//=====================================IAmAChameleon=====================================
	public void setChameleonState(World world, boolean trueForm)
	{
		this.state = trueForm;
	}
	
	public boolean getChameleonState()
	{
		return state;
	}
	
	//=====================================IAmTheMaster=====================================
	public void splitStructure()
	{
		
	}
	
	public void assembleStructure()
	{
		
	}
	
	public boolean checkStructure()
	{
		return false;
	}
	//=====================================ISpinRightRound=====================================
	public float getProgress()
	{
		return progress;
	}
}