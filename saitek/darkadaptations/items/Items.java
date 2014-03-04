package saitek.darkadaptations.items;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;
import saitek.darkadaptations.blocks.Blocks;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


public class Items {
	// Item variables
	public static Item darkgreatwand;
	public static Item darkgreatsword;
	public static Item darkwand;
	public static Item darksword;
	public static Item darkpickaxe;
	
	//Tool Material
	public static EnumToolMaterial toolDark = EnumHelper.addToolMaterial("DARK", 3, 1500, 6.0F, 7.0F, 30);
	
	//Weapon Material
	public static EnumToolMaterial toolDarkGreatsword = EnumHelper.addToolMaterial("DARKGREATSWORD", 3, 1500, 6.0F, 10.0F, 30);
	public static EnumToolMaterial toolDarksword = EnumHelper.addToolMaterial("DARKSWORD" , 3, 1500, 6.0F, 8.0F, 30);
	public static EnumToolMaterial toolDarkPickaxe = EnumHelper.addToolMaterial("DARKPICKAXE", 3, 1500, 6.0F, 8.0F, 30);
	
	//Misc
	public static Item darkdust;
	public static Item darkamethyst;
	public static Item darkironingot;
	public static Item darkstick;
	
	
	public static void init() {		
		//Weapons
		darkgreatsword = new ItemDarkGreatsword(ItemInfo.DARKGREATSWORD_ID, toolDarkGreatsword);
		darkgreatwand = new ItemDarkGreatWand(ItemInfo.DARKGREATWAND_ID);
		darkwand = new ItemDarkWand(ItemInfo.DARKWAND_ID);
		darksword = new ItemDarksword(ItemInfo.DARKSWORD_ID, toolDarksword);
		darkpickaxe = new ItemDarkPickaxe(ItemInfo.DARKPICKAXE_ID, toolDarkPickaxe);
		//Misc
		darkamethyst = new ItemDarkAmethyst(ItemInfo.DARKAMETHYST_ID);
		darkdust = new ItemDarkdust(ItemInfo.DARKDUST_ID);
		darkironingot = new ItemDarkIronIngot(ItemInfo.DARKIRONINGOT_ID);
		darkstick = new ItemDarkstick(ItemInfo.DARKSTICK_ID);
		
		
	}
	
	public static void addNames() {
		//Weapons
		LanguageRegistry.addName(darkgreatwand, ItemInfo.DARKGREATWAND_NAME);
		LanguageRegistry.addName(darkgreatsword, ItemInfo.DARKGREATSWORD_NAME);
		LanguageRegistry.addName(darkwand, ItemInfo.DARKWAND_NAME);
		LanguageRegistry.addName(darkpickaxe, ItemInfo.DARKPICKAXE_NAME);
		
		//Misc
		LanguageRegistry.addName(darkdust, ItemInfo.DARKDUST_NAME);
		LanguageRegistry.addName(darkamethyst, ItemInfo.DARKAMETHYST_NAME);
		LanguageRegistry.addName(darkironingot, ItemInfo.DARKIRONINGOT_NAME);
		LanguageRegistry.addName(darkstick, ItemInfo.DARKSTICK_NAME);
		LanguageRegistry.addName(darksword, ItemInfo.DARKSWORD_NAME);
		
		
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
		GameRegistry.addRecipe(new ItemStack(darkstick), new Object[] {
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
			
		
		
		//Dark Iron
		FurnaceRecipes.smelting().addSmelting(Blocks.darkironore.blockID, 0, new ItemStack(darkironingot), 0.1F);
		
		
	
	}
}
	

	
	
	
	