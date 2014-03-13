package saitek.darkadaptations.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import saitek.darkadaptations.items.Items;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ItemTab {
	public static CreativeTabs tabItem = new CreativeTabs("darkadaptationsitems") {
        public ItemStack getIconItemStack() {
        	return new ItemStack(Items.darkdust, 1, 0);
        }
	};
	
	public static void initTabNames() {
		LanguageRegistry.instance().addStringLocalization("itemGroup.darkadaptationsitems", "en_US", "Dark Adaptations Items");
	}

}
