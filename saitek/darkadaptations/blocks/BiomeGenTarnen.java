package saitek.darkadaptations.blocks;

import net.minecraft.block.Block;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;

public class BiomeGenTarnen extends BiomeGenBase {

	public BiomeGenTarnen(int id) {
		super(id);
		
		this.topBlock = (byte)Block.grass.blockID;
		this.fillerBlock = (byte)Block.dirt.blockID;
		

		this.theBiomeDecorator.treesPerChunk = 3;
		this.theBiomeDecorator.waterlilyPerChunk = 6;
		this.theBiomeDecorator.grassPerChunk = 1;
		this.theBiomeDecorator.mushroomsPerChunk = 5;
		this.theBiomeDecorator.flowersPerChunk = 5;
		this.theBiomeDecorator.reedsPerChunk = 5;
		this.theBiomeDecorator.sandPerChunk = 5;
		this.theBiomeDecorator.cactiPerChunk = 5;
		
		
			
		
		this.spawnableMonsterList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableMonsterList.add(new SpawnListEntry(EntityEnderman.class, 5, 5, 8));
		
		
		
	}

}
