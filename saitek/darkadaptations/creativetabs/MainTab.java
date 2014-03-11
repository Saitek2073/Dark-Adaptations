package saitek.darkadaptations.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import saitek.darkadaptations.items.Items;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class MainTab {
	public static CreativeTabs tabMain = new CreativeTabs("darkadaptations") {
        public ItemStack getIconItemStack() {
        	return new ItemStack(Items.darkgreatwand, 1, 0);
        }
	};
	
	public static void initTabNames() {
		LanguageRegistry.instance().addStringLocalization("itemGroup.darkadaptations", "en_US", "Dark Adaptations");
	}
}
