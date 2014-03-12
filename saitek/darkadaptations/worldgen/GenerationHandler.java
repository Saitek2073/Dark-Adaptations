package saitek.darkadaptations.worldgen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import saitek.darkadaptations.blocks.BlockInfo;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class GenerationHandler implements IWorldGenerator {
	
	private WorldGenerator DarkIronOre;
	private WorldGenerator DarkGlowrock;
	private WorldGenerator DarkAmethystOre;
	
	public GenerationHandler() {
		GameRegistry.registerWorldGenerator(this);
		DarkIronOre = new WorldGenMinable(BlockInfo.DARKIRONORE_ID, 16);
		DarkGlowrock = new WorldGenMinable(BlockInfo.DARKGLOWROCK_ID, 16,Block.netherrack.blockID);
		DarkAmethystOre = new WorldGenMinable(BlockInfo.DARKAMETHYSTORE_ID, 16);
	}
	
	private void generateStandardOre(Random rand, int chunkX, int chunkZ, World world, int iterations, WorldGenerator gen, int lowestY, int highestY){
		for (int i = 0; i < iterations; i++) {
			int x = chunkX * 16 + rand.nextInt(16);
			int y = rand.nextInt(highestY - lowestY) + lowestY;
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, x, y, z);
		}
	}
	
	

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		generateStandardOre(random, chunkX, chunkZ, world, 20, DarkIronOre, 5, 35);
		generateStandardOre(random, chunkX, chunkZ, world, 20, DarkGlowrock, 0, 128);
		generateStandardOre(random, chunkX, chunkZ, world, 20, DarkAmethystOre, 0, 16);
	
	}

}
