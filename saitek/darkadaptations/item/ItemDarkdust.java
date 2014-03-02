package saitek.darkadaptations.item;

import java.util.Random;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import saitek.darkadaptations.common.DarkAdaptations;

public class ItemDarkdust extends Item {

	public ItemDarkdust(int par1) {
		super(par1);
		this.setCreativeTab(DarkAdaptations.TabDark);
	}
	public void registerIcons(IconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("DarkAdaptations:Darkdust");
	}
	public int idDropped(int par1, Random par2Random, int par3) {
		return DarkAdaptations.Darkdust.itemID;
	}
	public int quantityDropped(Random par1Random) {
		return 2;
	}

}
