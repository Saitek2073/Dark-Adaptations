package saitek.darkadaptations.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import saitek.darkadaptations.items.Items;

public class MainTab {
	public static CreativeTabs tabMain = new CreativeTabs("darkrisingmod") {
        public ItemStack getIconItemStack() {
        	return new ItemStack(Item.appleGold, 1, 0);
        }
	};
	
	public static void initTabNames() {
		//LanguageRegistry.instance().addStringLocalization("itemGroup.darkrisingmod", "en_US", "Darkrising's Mod");
	}
}
