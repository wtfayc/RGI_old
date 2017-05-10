package com.ayc.rgi.handler;

import net.minecraft.tileentity.TileEntity;

import com.ayc.rgi.RGI;
import com.ayc.rgi.tileentity.BTE_0_0_Base;
import com.ayc.rgi.utility.Reference;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.internal.FMLProxyPacket;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

@Sharable
public class DescriptionNetworkHandler extends SimpleChannelInboundHandler<FMLProxyPacket>{

	public static final String CHANNEL = Reference.MOD_ID + "_Description";
	
	public static void init()
	{
		NetworkRegistry.INSTANCE.newChannel(CHANNEL, new DescriptionNetworkHandler());
	}
	
	@Override
	protected void channelRead0(ChannelHandlerContext ctx, FMLProxyPacket msg) throws Exception 
	{
		ByteBuf buf = msg.payload();
		int xCoord = buf.readInt();
		int yCoord = buf.readInt();
		int zCoord = buf.readInt();
		TileEntity tileEntity = RGI.proxy.getClientPlayer().worldObj.getTileEntity(xCoord, yCoord, zCoord);
		if (tileEntity instanceof BTE_0_0_Base)
		{
			((BTE_0_0_Base) tileEntity).readFromPacket(buf);
		}
	}
}