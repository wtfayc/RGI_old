package com.ayc.rgi.tileentity;

import com.ayc.rgi.handler.DescriptionNetworkHandler;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import cpw.mods.fml.common.network.internal.FMLProxyPacket;
import net.minecraft.network.Packet;
import net.minecraft.tileentity.TileEntity;

/**Basic TileEntity with Description Packet logic*/
public class BTE_0_0_Base extends TileEntity{

	@Override
 	public Packet getDescriptionPacket() 
 	{
		ByteBuf buf = Unpooled.buffer();
		buf.writeInt(xCoord);
		buf.writeInt(yCoord);
		buf.writeInt(zCoord);
		writeToPacket(buf);
		return new FMLProxyPacket(buf, DescriptionNetworkHandler.CHANNEL);
	}

	protected void writeToPacket(ByteBuf buf)
	{
		
	}
	
	public void readFromPacket(ByteBuf buf) 
	{
		
	}
}