package saitek.darkadaptations.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import saitek.darkadaptations.creativetabs.MainTab;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemDarkAmethyst extends Item {

	public ItemDarkAmethyst(int id) {
		super(id);
		setCreativeTab(MainTab.tabMain);
		setUnlocalizedName(ItemInfo.DARKAMETHYST_NAME);
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.DARKAMETHYST_ICON);
	
	
	}
	

}
