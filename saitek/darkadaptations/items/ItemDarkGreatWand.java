package saitek.darkadaptations.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import saitek.darkadaptations.creativetabs.MainTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class ItemDarkGreatWand extends Item {

	public ItemDarkGreatWand(int id) {
		super(id);
		setCreativeTab(MainTab.tabMain);
		setMaxStackSize(1);
		setUnlocalizedName(ItemInfo.DARKGREATWAND_UNLOCALIZED_NAME);	
	}
	
	@Override
	public boolean itemInteractionForEntity(ItemStack itemstack, EntityPlayer player, EntityLivingBase target) {
		if (!target.worldObj.isRemote) {
			target.motionY = 2;
			target.setFire(10);
		}				
		return false;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.DARKGREATWAND_ICON);
	}
}