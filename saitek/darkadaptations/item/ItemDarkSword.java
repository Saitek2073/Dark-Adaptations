package saitek.darkadaptations.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;
import saitek.darkadaptations.common.DarkAdaptations;

public class ItemDarkSword extends ItemSword {

	public ItemDarkSword(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setCreativeTab(DarkAdaptations.TabDark);	
	}
	public void registerIcons(IconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("DarkAdaptations:DarkSword");
	}

}
	


