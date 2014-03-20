package saitek.darkadaptations.biomes;

import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.registry.GameRegistry;

public class Biomes {
	
//Biomes
	
	public static BiomeGenBase biomeTarnen;
	
	
	
	
	
	
	
	
	
	
	
	
//Game Registry
	public static void init() {	
		
		biomeTarnen = new BiomeGenTarnen(25).setBiomeName("Tarnen").func_76733_a(9154376).setTemperatureRainfall(2.0F, 0.0F).setMinMaxHeight(0.3F, 0.8F);		
		GameRegistry.addBiome(biomeTarnen);
		
		
		
		
		
		
	}
	
	
	
	

}
