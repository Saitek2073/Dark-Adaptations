package saitek.darkadaptations.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import saitek.darkadaptations.blocks.Blocks;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class OreTab {
	public static CreativeTabs tabOre = new CreativeTabs("darkadaptationsworldgen") {
        public ItemStack getIconItemStack() {
        	return new ItemStack(Blocks.darkamethystore, 1, 0);
        }
	};
	
	public static void initTabNames() {
		LanguageRegistry.instance().addStringLocalization("itemGroup.darkadaptationsworldgen", "en_US", "Dark Adaptations World Gen");
	
	}
}
