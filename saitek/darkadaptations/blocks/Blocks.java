package saitek.darkadaptations.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Blocks {
	
	//public static Block filler;
	
	public static void init() {
		//filler = new BlockFiller(BlockInfo.FILLER_ID);
		//GameRegistry.registerBlock(filler, BlockInfo.FILLER_KEY);
	}
	
	public static void addNames() {
		//LanguageRegistry.addName(machine, BlockInfo.MACHINE_NAME);
	}
	
	public static void registerTileEntities() {
		//GameRegistry.registerTileEntity(TileEntityBomb.class, BlockInfo.BOMB_TE_KEY);
	}
	
	public static void registerRecipes() {
		/*
		GameRegistry.addRecipe(new ItemStack(bomb), new Object[] {
			"///",
			"/X/",
			"///",
							  
			'X', Block.tnt,
			'/', Block.wood
		});
		*/
	}
}

