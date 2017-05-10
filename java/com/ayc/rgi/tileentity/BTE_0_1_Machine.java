package com.ayc.rgi.tileentity;

import net.minecraft.nbt.NBTTagCompound;

import com.ayc.rgi.utility.interfaces.IMachineHandler;

/**Basic TileEntity with Description Packet logic > IMachineHandler + updateConstructor*/
public class BTE_0_1_Machine extends BTE_0_0_Base implements IMachineHandler{

	protected int tickTracker = 99; 
	protected int tickUpdateIdle = 100;
	protected int tickUpdate = tickUpdateIdle;
	protected boolean working;
	protected int guiID;
	
	protected BTE_0_1_Machine(int guiID)
	{
		this.guiID = guiID;
	}
	
	//=====================================Network=====================================
	@Override
    public void writeToNBT(NBTTagCompound nbt)
    {
        super.writeToNBT(nbt);
 		nbt.setBoolean("working", working);
 		nbt.setInteger("tickTracker", tickTracker);
 		nbt.setInteger("tickUpdate", tickUpdate);
    }
	
 	@Override
    public void readFromNBT(NBTTagCompound nbt)
    {
        super.readFromNBT(nbt);
 		working = nbt.getBoolean("working");
 		tickTracker = nbt.getInteger("tickTracker");
 		tickUpdate = nbt.getInteger("tickUpdate");
    }

	//=====================================Work=====================================
 	public void updateEntity()
 	{	
 		tickTracker++;
 		update1();
 		if ((tickTracker % 10) == 0) update2();
 		if (tickTracker >= tickUpdate)
 		{
 			update3();
 			tickTracker = 0;
 		}
 	}	
 	
 	/** Happens every tick */
 	protected void update1() {}
 	/** Happens every 10 ticks */
 	protected void update2() {}
 	/** Happens every tickUpdate ticks */
 	protected void update3() {}
 	
	//=====================================IMachineHandler=====================================
	public boolean getActive() 
	{
		return working;
	}

	public void setActive(boolean active) 
	{
		this.working = active;
	}

	public int getGuiID() 
	{
		if (guiID >= 0) return guiID;
		return -1;
	}
}