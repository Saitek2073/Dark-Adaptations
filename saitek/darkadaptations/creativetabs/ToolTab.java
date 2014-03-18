package saitek.darkadaptations.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import saitek.darkadaptations.items.Items;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ToolTab {

	public static CreativeTabs tabTool = new CreativeTabs("darkadaptationstools") {
        public ItemStack getIconItemStack() {
        	return new ItemStack(Items.darkshovel, 1, 0);
        }
	};
	
	public static void initTabNames() {
		LanguageRegistry.instance().addStringLocalization("itemGroup.darkadaptationstools", "en_US", "Dark Adaptations Tools");
	}

}

