package saitek.darkadaptations.items;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items {
	// Item variables
	public static Item darkgreatwand;
	public static Item darkgreatsword;
	
	// Tool Material
	public static EnumToolMaterial toolDark = EnumHelper.addToolMaterial("DARK", 3, 1500, 6.0F, 7.0F, 30);
	
	//Weapon Material
	public static EnumToolMaterial toolDarkGreatsword = EnumHelper.addToolMaterial("DARKGREATSWORD", 3, 1500, 6.0F, 10.0F, 30);
	
	//Misc
	public static Item darkdust;
	public static Item darkironingot;
	
	public static void init() {		
		//Weapons
		darkgreatsword = new ItemDarkGreatsword(ItemInfo.DARKGREATSWORD_ID, toolDarkGreatsword);
		darkgreatwand = new ItemDarkGreatWand(ItemInfo.DARKGREATWAND_ID);
		
		//Misc
		darkdust = new ItemDarkdust(ItemInfo.DARKDUST_ID);
		darkironingot = new ItemDarkIronIngot(ItemInfo.DARKIRONINGOT_ID);
		
	}
	
	public static void addNames() {
		//Weapons
		LanguageRegistry.addName(darkgreatwand, ItemInfo.DARKGREATWAND_NAME);
		LanguageRegistry.addName(darkgreatsword, ItemInfo.DARKGREATSWORD_NAME);
		
		//Misc
		LanguageRegistry.addName(darkdust, ItemInfo.DARKDUST_NAME);
		LanguageRegistry.addName(darkironingot, ItemInfo.DARKIRONINGOT_NAME);
	}
	
	public static void registerRecipes() {
		
		//Dark Great Wand
		GameRegistry.addRecipe(new ItemStack(darkgreatwand), new Object[] {
			"  X",
			" / ",
			"/  ",
							  
			'X', Items.darkdust,
			'/', Item.stick
		});
		
		
	}
}
