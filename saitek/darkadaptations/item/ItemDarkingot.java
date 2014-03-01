package saitek.darkadaptations.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import saitek.darkadaptations.common.DarkAdaptations;

public class ItemDarkingot extends Item {

	public ItemDarkingot(int par1) {
		super(par1);
		this.setCreativeTab(DarkAdaptations.TabDark);
	}
	public void registerIcons(IconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("DarkAdaptations:Darkingot");
	}

}
