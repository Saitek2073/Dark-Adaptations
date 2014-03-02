package saitek.darkadaptations.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import saitek.darkadaptations.block.BlockDarkGlowrock;
import saitek.darkadaptations.block.BlockDarkIronOre;
import saitek.darkadaptations.creativetab.CreativeTabDark;
import saitek.darkadaptations.item.ItemDarkAxe;
import saitek.darkadaptations.item.ItemDarkHoe;
import saitek.darkadaptations.item.ItemDarkPickaxe;
import saitek.darkadaptations.item.ItemDarkShovel;
import saitek.darkadaptations.item.ItemDarkSword;
import saitek.darkadaptations.item.ItemDarkWand;
import saitek.darkadaptations.item.ItemDarkdust;
import saitek.darkadaptations.item.ItemDarkingot;
import saitek.darkadaptations.weapon.ItemDarkGreatsword;
import saitek.darkadaptations.weapon.ItemDarkGreatwand;
import saitek.darkadaptations.worldgen.DarkGlowrockWorldgen;
import saitek.darkadaptations.worldgen.DarkIronOreWorldgen;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "DarkAdaptations", name = "Dark Adaptations", version = "1.0.0 Alpha")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class DarkAdaptations {
	@SidedProxy(clientSide = "saitek.darkadaptations.client.ClientProxy", serverSide = "saitek.darkadaptations.common.CommonProxy")
	public static CommonProxy proxy;
	
	//ConfigHandler.init(event.getSuggestedConfigurationFile());

	// Tool Material

	public static EnumToolMaterial toolDark = EnumHelper.addToolMaterial(
			"DARK", 3, 1500, 6.0F, 7.0F, 30);

	// Creativetabs
	public static CreativeTabs TabDark = new CreativeTabDark(
			CreativeTabs.getNextID(), "DarkTab");

	// Weapon Materials
	public static EnumToolMaterial toolDarkGreatsword = EnumHelper
			.addToolMaterial("DARKGREATSWORD", 3, 1500, 6.0F, 10.0F, 30);

	// Weapon Materials No Damage

	public static EnumToolMaterial toolDarkGreatwand = EnumHelper
			.addToolMaterial("DARKGREATWAND", 0, 1500, 6.0F, 0.0F, 30);

	// Armor Sets

	// Blocks
	public static Block DarkGlowrock = new BlockDarkGlowrock(3151,
			Material.glass).setUnlocalizedName("DarkGlowrock");
	public static Block DarkIronOre = new BlockDarkIronOre(3152, Material.rock)
			.setUnlocalizedName("DarkIronOre");

	// Items
	public static Item Darkdust = new ItemDarkdust(3153)
			.setUnlocalizedName("Darkdust");
	public static Item Darkingot = new ItemDarkingot(3154)
			.setUnlocalizedName("Darkingot");

	// worldgen

	public static DarkIronOreWorldgen WorldgenDarkIronOre = new DarkIronOreWorldgen();
	public static DarkGlowrockWorldgen WorldgenDarkGlowrock = new DarkGlowrockWorldgen();

	// Dark Toolset
	public static Item DarkPickaxe = new ItemDarkPickaxe(3155, toolDark)
			.setUnlocalizedName("DarkPickaxe");
	public static Item DarkShovel = new ItemDarkShovel(3156, toolDark)
			.setUnlocalizedName("DarkShovel");
	public static Item DarkAxe = new ItemDarkAxe(3157, toolDark)
			.setUnlocalizedName("DarkAxe");
	public static Item DarkHoe = new ItemDarkHoe(3158, toolDark)
			.setUnlocalizedName("DarkHoe");
	public static Item DarkSword = new ItemDarkSword(3159, toolDark)
			.setUnlocalizedName("DarkSword");
	public static Item DarkWand = new ItemDarkWand(3160, toolDark)
			.setUnlocalizedName("DarkWand");

	// Weapons
	public static Item DarkGreatsword = new ItemDarkGreatsword(3161,
			toolDarkGreatsword).setUnlocalizedName("Dark Greatsword");
	public static Item DarkGreatwand = new ItemDarkGreatwand(3162,
			toolDarkGreatwand).setUnlocalizedName("Dark Greatwand");

	@Init
	public void load(FMLInitializationEvent event) {

		proxy.registerRenderInformation();

	}

	public DarkAdaptations() {

		// Blocks
		GameRegistry.registerBlock(DarkGlowrock);
		GameRegistry.registerBlock(DarkIronOre);

		// Worldgen
		GameRegistry.registerWorldGenerator(WorldgenDarkIronOre);
		GameRegistry.registerWorldGenerator(WorldgenDarkGlowrock);

		// Crafting Recipes
		GameRegistry.addRecipe(new ItemStack(DarkGlowrock, 1), new Object[] {
				"X X", "   ", "X X", 'X', Darkdust });

		// Blocks

		LanguageRegistry.addName(DarkGlowrock, "Dark Glowrock");
		LanguageRegistry.addName(DarkIronOre, "Dark Iron Ore");

		// Items
		LanguageRegistry.addName(Darkdust, "Darkdust");
		LanguageRegistry.addName(Darkingot, "Dark Iron Ingot");

		// Dark Toolset Language Registries
		LanguageRegistry.addName(DarkPickaxe, "Dark Pickaxe");
		LanguageRegistry.addName(DarkShovel, "Dark Shovel");
		LanguageRegistry.addName(DarkAxe, "Dark  Axe");
		LanguageRegistry.addName(DarkHoe, "Dark Hoe");
		LanguageRegistry.addName(DarkSword, "Dark Sword");
		LanguageRegistry.addName(DarkWand, "Dark Wand");

		// Weapon Language Registries
		LanguageRegistry.addName(DarkGreatsword, "Dark Greatsword");
		LanguageRegistry.addName(DarkGreatwand, "Dark Great Wand");
	}
}
