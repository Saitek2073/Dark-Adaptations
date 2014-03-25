package saitek.darkadaptations.biomes;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeManager;
import cpw.mods.fml.common.registry.GameRegistry;

public class Biomes {
	
//Biomes
	
	public static BiomeGenBase biomeTarnen;
	
	
	
	
	
	
	
	
	
	
	
	
//Game Registry
	public static void init() {	
		
		biomeTarnen = new BiomeGenTarnen(30).setColor(522674).setBiomeName("Tarnen Quag").func_76733_a(9154376).setMinMaxHeight(0.1F, 0.1F).setTemperatureRainfall(0.8F, 0.9F);		
		GameRegistry.addBiome(biomeTarnen);
		BiomeManager.addVillageBiome(biomeTarnen, true);	
		
		
	}
	
	
	
	

}
