package saitek.darkadaptations.blocks;

import java.util.Random;

import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldServer;

public class TeleporterDarkvoid extends Teleporter {
	
	private final WorldServer worldServerInstance;
	private final Random random;

	public TeleporterDarkvoid(WorldServer par1WorldServer) {
		super(par1WorldServer);
		
		this.worldServerInstance =  par1WorldServer;
		this.random = new Random(par1WorldServer.getSeed());
	}

	
	
}
