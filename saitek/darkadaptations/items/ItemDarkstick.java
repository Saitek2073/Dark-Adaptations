package saitek.darkadaptations.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import saitek.darkadaptations.creativetabs.ItemTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDarkstick extends Item {

	public ItemDarkstick(int id) {
		super(id);
		setCreativeTab(ItemTab.tabItem);
		setUnlocalizedName(ItemInfo.DARKSTICK_UNLOCALIZED_NAME);		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.DARKSTICK_ICON);
	}
	
}
