package saitek.darkadaptations.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import saitek.darkadaptations.creativetabs.MainTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDarkdust extends Item {

	public ItemDarkdust(int id) {
		super(id);
		setCreativeTab(MainTab.tabMain);
		setUnlocalizedName(ItemInfo.DARKDUST_UNLOCALIZED_NAME);	
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.DARKDUST_ICON);
	}
}
