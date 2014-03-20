package saitek.darkadaptations;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderTutorial extends WorldProvider {
	
	public void registerWorldChunckManger(){
		this.worldChunkMgr = new WorldChunkManagerHell(DarkAdaptations.biomesTarnen, 0.2F, 0.5F);
		this.dimensionId = DarkAdaptations.dimensionIdDarkVoid;
	}
	
	public IChunkProvider createChunkProvider(){
		return new ChunkProviderDarkVoid(this.worldObj, this.worldObj.getSeed(), true);
	}
	
	public String getDimensionName() {
		return "Dark Void Dimension";
	}

}
