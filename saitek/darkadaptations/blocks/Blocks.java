package saitek.darkadaptations.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import saitek.darkadaptations.items.Items;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Blocks {	
	//Blocks
	public static Block darkironore;
	public static Block darkglowrock;
	public static Block darkamethystore;
	
	//Game Registry 
	
	public static void init() {		
		darkironore = new BlockDarkIronOre(BlockInfo.DARKIRONORE_ID);
		GameRegistry.registerBlock(darkironore, BlockInfo.DARKIRONORE_KEY);
		
		darkglowrock = new BlockDarkGlowrock(BlockInfo.DARKGLOWROCK_ID);
		GameRegistry.registerBlock(darkglowrock, BlockInfo.DARKGLOWROCK_KEY);
		
		darkamethystore = new BlockDarkAmethystOre(BlockInfo.DARKAMETHYSTORE_ID);
		GameRegistry.registerBlock(darkamethystore, BlockInfo.DARKAMETHYSTORE_KEY);
		
		
		
	}
	
	//LanguageRegistry
	
	public static void addNames() {
		LanguageRegistry.addName(darkironore, BlockInfo.DARKIRONORE_NAME);
		LanguageRegistry.addName(darkglowrock, BlockInfo.DARKGLOWROCK_NAME);
		LanguageRegistry.addName(darkamethystore, BlockInfo.DARKAMETHYSTORE_NAME);
		
		
		
	}
	
	public static void registerTileEntities() {
		//GameRegistry.registerTileEntity(TileEntityBomb.class, BlockInfo.BOMB_TE_KEY);
	}
	
	public static void registerRecipes() {
		GameRegistry.addRecipe(new ItemStack(darkglowrock), new Object[] {
			"X X",
			"   ",
			"X X",
							 
			'X', Items.darkdust
		});
		
	}
}

