package saitek.darkadaptations.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import saitek.darkadaptations.items.Items;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class WeaponTab {
	public static CreativeTabs tabWeapon = new CreativeTabs("darkadaptationsweapons") {
        public ItemStack getIconItemStack() {
        	return new ItemStack(Items.darkgreatsword, 1, 0);
        }
	};
	
	public static void initTabNames() {
		LanguageRegistry.instance().addStringLocalization("itemGroup.darkadaptationsweapons", "en_US", "Dark Adaptations Weapons");
	}
}
