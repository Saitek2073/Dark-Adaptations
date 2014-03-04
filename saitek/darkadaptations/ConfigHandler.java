package saitek.darkadaptations;

import java.io.File;

import net.minecraftforge.common.Configuration;
import saitek.darkadaptations.blocks.BlockInfo;
import saitek.darkadaptations.items.ItemInfo;

public class ConfigHandler {
	public static void init(File file) {
		Configuration config = new Configuration(file);
		
		config.load();
		

		
		//Items
			//Weapons
				ItemInfo.DARKGREATWAND_ID = config.getItem(ItemInfo.DARKGREATWAND_KEY, ItemInfo.DARKGREATWAND_DEFAULT).getInt() - 256;
				ItemInfo.DARKGREATSWORD_ID = config.getItem(ItemInfo.DARKGREATSWORD_KEY, ItemInfo.DARKGREATSWORD_DEFAULT).getInt() - 256;
				ItemInfo.DARKWAND_ID = config.getItem(ItemInfo.DARKWAND_KEY, ItemInfo.DARKWAND_DEFAULT).getInt() - 256;
			//Misc
				ItemInfo.DARKDUST_ID = config.getItem(ItemInfo.DARKDUST_KEY, ItemInfo.DARKDUST_DEFAULT).getInt() - 256;
				ItemInfo.DARKIRONINGOT_ID = config.getItem(ItemInfo.DARKIRONINGOT_KEY, ItemInfo.DARKIRONINGOT_DEFAULT).getInt() - 256;
				ItemInfo.DARKSTICK_ID = config.getItem(ItemInfo.DARKSTICK_KEY, ItemInfo.DARKSTICK_DEFAULT).getInt() - 256;
				ItemInfo.DARKSWORD_ID = config.getItem(ItemInfo.DARKSWORD_KEY, ItemInfo.DARKSWORD_DEFAULT).getInt() - 256;
				ItemInfo.DARKAMETHYST_ID = config.getItem(ItemInfo.DARKAMETHYST_KEY, ItemInfo.DARKAMETHYST_DEFAULT).getInt() - 256;
				ItemInfo.DARKPICKAXE_ID = config.getItem(ItemInfo.DARKPICKAXE_KEY, ItemInfo.DARKPICKAXE_DEFAULT).getInt() - 256;
				
				
 		//Blocks
			BlockInfo.DARKIRONORE_ID = config.getBlock(BlockInfo.DARKIRONORE_KEY, BlockInfo.DARKIRONORE_DEFAULT).getInt();
			BlockInfo.DARKGLOWROCK_ID = config.getBlock(BlockInfo.DARKGLOWROCK_KEY, BlockInfo.DARKGLOWROCK_DEFAULT).getInt();
			BlockInfo.DARKAMETHYSTORE_ID = config.getBlock(BlockInfo.DARKAMETHYSTORE_KEY, BlockInfo.DARKAMETHYSTORE_DEFAULT).getInt();
			
		config.save();
	}
}