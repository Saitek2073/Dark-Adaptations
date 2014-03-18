package saitek.darkadaptations;

import saitek.darkadaptations.blocks.Biomes;
import saitek.darkadaptations.blocks.Blocks;
import saitek.darkadaptations.creativetabs.ItemTab;
import saitek.darkadaptations.creativetabs.OreTab;
import saitek.darkadaptations.creativetabs.ToolTab;
import saitek.darkadaptations.creativetabs.WeaponTab;
import saitek.darkadaptations.items.Items;
import saitek.darkadaptations.network.PacketHandler;
import saitek.darkadaptations.proxy.CommonProxy;
import saitek.darkadaptations.worldgen.GenerationHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = ModInfo.MODID, name = ModInfo.NAME, version = ModInfo.VERSION)
@NetworkMod(channels = {ModInfo.CHANNEL}, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)
public class DarkAdaptations {
	
	@Instance(ModInfo.MODID)
	public static DarkAdaptations instance;
	
	@SidedProxy(clientSide = "saitek.darkadaptations.proxy.ClientProxy", serverSide = "saitek.darkadaptations.proxy.CommonProxy")	
	
	public static CommonProxy proxy;
	
	
	
	
	
	@EventHandler
	public void PreInit(FMLPreInitializationEvent event) {
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		Items.init();
		Blocks.init();
		Biomes.init();
		
		proxy.initSounds();
		proxy.initRenderers();
		
		GameRegistry.registerPlayerTracker(new UpdatePlayerTracker());
		new UpdateChecker();
	}

	@EventHandler
	public void Init(FMLInitializationEvent event) {
		Items.addNames();
		Blocks.addNames();
		
		WeaponTab.initTabNames();
		OreTab.initTabNames();
		ItemTab.initTabNames();
		ToolTab.initTabNames();
		
		
		
		
		Items.registerRecipes();
		Blocks.registerRecipes();
		
		Blocks.registerTileEntities();
		
		new GenerationHandler();
		
		//Entities.init();
		
	}

	@EventHandler
	public void PostInit(FMLPostInitializationEvent event) {
		
	}
}
