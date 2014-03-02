package saitek.darkadaptations;

import java.io.File;

import net.minecraftforge.common.Configuration;

public class ConfigHandler {
	public static void init(File file) {
		Configuration config = new Configuration(file);
		
		config.load();
		
		/*
		BlockInfo.MACHINE_ID = config.getBlock(BlockInfo.MACHINE_KEY, BlockInfo.MACHINE_DEFAULT).getInt();
		BlockInfo.BOMB_ID = config.getBlock(BlockInfo.BOMB_KEY, BlockInfo.BOMB_DEFAULT).getInt();
		BlockInfo.FILLER_ID = config.getBlock(BlockInfo.FILLER_KEY, BlockInfo.FILLER_DEFAULT).getInt();
		
		ItemInfo.WAND_ID = config.getItem(ItemInfo.WAND_KEY, ItemInfo.WAND_DEFAULT).getInt() - 256;
		ItemInfo.CARD_ID = config.getItem(ItemInfo.CARD_KEY, ItemInfo.CARD_DEFAULT).getInt() - 256;
		
		TileEntityFiller.SPREAD_LEVELS = config.get("filler", "Filler Spread Radius", 100).getInt();
		
		TileEntityBomb.SPREAD_LEVELS = config.get("bomb", "Bomb Spread Radius", 5).getInt();
		TileEntityBomb.EXPLOSIVE_POWER = config.get("bomb", "Bomb Explosive Power", 4).getInt();
		*/
		
		config.save();
	}
}
