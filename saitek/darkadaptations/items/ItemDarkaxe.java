package saitek.darkadaptations.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;
import saitek.darkadaptations.creativetabs.WeaponTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDarkaxe extends ItemAxe {

	public ItemDarkaxe(int id, EnumToolMaterial par2EnumToolMaterial) {
		super(id, par2EnumToolMaterial);
		setCreativeTab(WeaponTab.tabWeapon);
		setMaxStackSize(1);
		setUnlocalizedName(ItemInfo.DARKAXE_UNLOCALIZED_NAME);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.DARKAXE_ICON);
	}

}
