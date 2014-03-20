package saitek.darkadaptations.items;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;
import saitek.darkadaptations.blocks.Blocks;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


public class Items {
	// Item variables
	public static Item darkgreatwand;
	public static Item darkgreatsword;
	public static Item darkwand;
	public static Item darksword;
	public static Item darkpickaxe;
	public static Item darkaxe;
	public static Item darkshovel;
	public static Item darktimekey;
	
	
	//public static Item darkironchestplate;
    //public static Item darkironhelmet;
    //public static Item darkironleggings;
	//public static Item darkironboots;
	
	
	//Dark Armor Material
	//public static EnumArmorMaterial armorDarkiron = EnumHelper.addArmorMaterial("Darkiron" , 40, new int [] {3, 8, 6, 3}, 30);
	
	//Dark Armor Set
	/*public static EnumArmorMaterial armorDarkironchestplate = EnumHelper.addArmorMaterial("Darkiron", 66, new int [] {6, 9, 9, 6}, 30);
	public static EnumArmorMaterial armorDarkironboots = EnumHelper.addArmorMaterial("Darkiron", 66, new int [] {6, 9, 9, 6}, 30);
	public static EnumArmorMaterial armorDarkironleggings = EnumHelper.addArmorMaterial("Darkiron", 66, new int [] {6, 9, 9, 6}, 30);
	public static EnumArmorMaterial armorDarkironhelmet = EnumHelper.addArmorMaterial("Darkiron", 60, new int [] {6, 9, 9, 9}, 30);
	*/
	//Tool Material
	public static EnumToolMaterial toolDark = EnumHelper.addToolMaterial("DARK", 3, 1500, 6.0F, 7.0F, 30);
	
	//Weapon Material
	public static EnumToolMaterial toolDarkGreatsword = EnumHelper.addToolMaterial("DARKGREATSWORD", 3, 1500, 6.0F, 20.0F, 30);
	public static EnumToolMaterial toolDarksword = EnumHelper.addToolMaterial("DARKSWORD", 3, 1500, 6.0F, 8.0F, 30);
	public static EnumToolMaterial toolDarkPickaxe = EnumHelper.addToolMaterial("DARKPICKAXE", 3, 1500, 6.0F, 8.0F, 30);
	public static EnumToolMaterial toolDarkaxe = EnumHelper.addToolMaterial("DARKAXE", 3, 1500, 6.0F, 8.0F, 30);
	public static EnumToolMaterial toolDarkshovel = EnumHelper.addToolMaterial("DARKSHOVEL", 3, 1500, 6.0F, 0F, 30);
	
	
	//Misc
	public static Item darkdust;
	public static Item darkamethyst;
	public static Item darkironingot;
	public static Item darkstick;
	public static Item darkironpowder;
	
	
	public static void init() {		
		//Weapons
		darkgreatsword = new ItemDarkGreatsword(ItemInfo.DARKGREATSWORD_ID, toolDarkGreatsword);
		darkgreatwand = new ItemDarkGreatWand(ItemInfo.DARKGREATWAND_ID);
		darkwand = new ItemDarkWand(ItemInfo.DARKWAND_ID);
		darksword = new ItemDarksword(ItemInfo.DARKSWORD_ID, toolDarksword);
		darkpickaxe = new ItemDarkPickaxe(ItemInfo.DARKPICKAXE_ID, toolDarkPickaxe);
		darkaxe = new ItemDarkaxe(ItemInfo.DARKAXE_ID, toolDarkaxe);
		darkshovel = new ItemDarkshovel(ItemInfo.DARKSHOVEL_ID, toolDarkshovel);
		
		//Dark Armor Set
		
		
		
		//darkironhelmet = new Darkironhelmet(ItemInfo.DARKIRONHELMET_ID, armorDarkironhelmet, 0, 0, "Dark");
		//darkironchestplate = new Darkironchestplate(ItemInfo.DARKIRONCHESTPLATE_ID, armorDarkironchestplate, 0, 1, "Dark" );		
		//darkironleggings = new Darkironleggings(ItemInfo.DARKIRONLEGGINGS_ID, armorDarkironleggings, 0, 2, "Dark" );
		//darkironboots = new Darkironboots(ItemInfo.DARKIRONBOOTS_ID, armorDarkironboots, 0, 3, "Dark" );
		
		//Misc
		darkamethyst = new ItemDarkAmethyst(ItemInfo.DARKAMETHYST_ID);
		darkdust = new ItemDarkdust(ItemInfo.DARKDUST_ID);
		darkironingot = new ItemDarkIronIngot(ItemInfo.DARKIRONINGOT_ID);
		darkstick = new ItemDarkstick(ItemInfo.DARKSTICK_ID);
		darktimekey = new ItemDarktimekey(ItemInfo.DARKTIMEKEY_ID);
		darkironpowder = new ItemDarkironpowder(ItemInfo.DARKIRONPOWDER_ID);
		
		
	}
	
	public static void addNames() {
		//Weapons
		LanguageRegistry.addName(darkgreatwand, ItemInfo.DARKGREATWAND_NAME);
		LanguageRegistry.addName(darkgreatsword, ItemInfo.DARKGREATSWORD_NAME);
		LanguageRegistry.addName(darkwand, ItemInfo.DARKWAND_NAME);
		
		//Armor
		
		//LanguageRegistry.addName(darkironchestplate, ItemInfo.DARKIRONCHESTPLATE_NAME);
		//LanguageRegistry.addName(darkironboots, ItemInfo.DARKIRONBOOTS_NAME);
		//LanguageRegistry.addName(darkironleggings, ItemInfo.DARKIRONLEGGINGS_NAME);
		//LanguageRegistry.addName(darkironhelmet, ItemInfo.DARKIRONHELMET_NAME);
		
		
		
				
		//Misc
		LanguageRegistry.addName(darkdust, ItemInfo.DARKDUST_NAME);
		LanguageRegistry.addName(darkamethyst, ItemInfo.DARKAMETHYST_NAME);
		LanguageRegistry.addName(darkironingot, ItemInfo.DARKIRONINGOT_NAME);
		LanguageRegistry.addName(darkstick, ItemInfo.DARKSTICK_NAME);
		LanguageRegistry.addName(darksword, ItemInfo.DARKSWORD_NAME);
		LanguageRegistry.addName(darkaxe, ItemInfo.DARKAXE_NAME);
		LanguageRegistry.addName(darkpickaxe, ItemInfo.DARKPICKAXE_NAME);
		LanguageRegistry.addName(darkshovel, ItemInfo.DARKSHOVEL_NAME);
		LanguageRegistry.addName(darktimekey, ItemInfo.DARKTIMEKEY_NAME);
		LanguageRegistry.addName(darkironpowder, ItemInfo.DARKIRONPOWDER_NAME);
		
		
		
		
		
		//RenderingRegistry.addNewArmourRendererPrefix("Dark");
     }
	
	public static void registerRecipes() {
		
		//Ore dictionary
		OreDictionary.registerOre("DarkIronIngot", darkironingot);
		OreDictionary.registerOre("DarkAmethyst", darkamethyst);
		
		//Dark Great Wand
		GameRegistry.addRecipe(new ItemStack(darkgreatwand), new Object[] {
			" X ",
			" / ",
			" B ",
							  
			'X', Items.darkwand,
			'/', Items.darkstick,
			'B', Item.blazeRod
		});
		
		//Dark Wand
		GameRegistry.addRecipe(new ItemStack(darkwand), new Object[] {
			"  X",
			" / ",
			"/  ",
									  
			'X', Items.darkdust,
			'/', Items.darkstick
		});
		
		//Darkstick
		GameRegistry.addRecipe(new ItemStack(darkstick, 4), new Object[] {
			"  X",
			" X ",
			"/  ",

			'X', Items.darkamethyst,
			'/', Item.stick
		
		});
	
		//Darksword
		GameRegistry.addRecipe(new ItemStack(darksword), new Object[] {
			"X  ",
			"X  ",
			"/  ",

			'X', Items.darkironingot,
			'/', Items.darkstick	
		});
		
		
		//Dark Pickaxe
		GameRegistry.addRecipe(new ItemStack(darkpickaxe), new Object[] {
			"XXX",
			" / ",
			" / ",
			
			'X', Items.darkironingot,
			'/', Items.darkstick
			
		});	
		
		//Dark Axe
		GameRegistry.addRecipe(new ItemStack(darkaxe), new Object[] {
			"XX ",
			"X/ ",
			" / ",
			
			'X', Items.darkironingot,
			'/', Items.darkstick
			
		});
		
		
		
		//Dark Great Sword
		GameRegistry.addRecipe(new ItemStack(darkgreatsword), new Object[] {
			"X*X",
			"*#*",
			"&/&",
			
			'X', Items.darksword,
			'/', Items.darkstick,
			'*', Items.darkamethyst,
			'#', Items.darkwand,
			'&', Items.darkdust,
			
			
			
		});
		
		//Dark Shovel
		GameRegistry.addRecipe(new ItemStack(darkshovel), new Object[] {
			" X ",
			" / ",
			" / ",
			
			'X', Items.darkironingot,
			'/', Items.darkstick
			
		});
			
		
		
		//Dark Iron
		FurnaceRecipes.smelting().addSmelting(Blocks.darkironore.blockID, 0, new ItemStack(darkironingot), 0.5F);
		
		
	
	}
}
	

	
	
	
	