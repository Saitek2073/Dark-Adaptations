package saitek.darkadaptations.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;
import saitek.darkadaptations.common.DarkAdaptations;

public class ItemDarkAxe extends ItemAxe {

	public ItemDarkAxe(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setCreativeTab(DarkAdaptations.TabDark);
	}
	public void registerIcons(IconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("DarkAdaptations:DarkAxe");
	}
	
}
