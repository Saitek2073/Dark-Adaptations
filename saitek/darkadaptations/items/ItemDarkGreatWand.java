package saitek.darkadaptations.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import saitek.darkadaptations.creativetabs.WeaponTab;
import saitek.darkadaptations.sounds.Sounds;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class ItemDarkGreatWand extends Item {

	@SideOnly(Side.CLIENT)
	private Icon chargedIcon;
	public ItemDarkGreatWand(int id) {
		super(id);
		setCreativeTab(WeaponTab.tabWeapon);
		setMaxStackSize(1);
		setUnlocalizedName(ItemInfo.DARKGREATWAND_UNLOCALIZED_NAME);	
	}
	
	@Override
	public boolean itemInteractionForEntity(ItemStack itemstack, EntityPlayer player, EntityLivingBase target) {
		if (!target.worldObj.isRemote) {
			target.motionY = 2;
			target.setFire(20);
			if (isCharged(itemstack.getItemDamage())) {
				target.motionX = (target.posX - player.posX) * 2;
				
				itemstack.setItemDamage(0);
				Sounds.DARKGREATWAND_USE.play(target.posX, target.posY, target.posZ, 1, 3);
			}else{
				itemstack.setItemDamage(itemstack.getItemDamage() + 1);
				Sounds.DARKGREATWAND_USE.play(target.posX, target.posY, target.posZ, 1, 0);
			}	
			
			
		}				
		return false;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.DARKGREATWAND_ICON);
		chargedIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.DARKGREATWANDCHARGED_ICON);		
	}
	
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemstack, EntityPlayer player, List info, boolean useExtraInformation) {
		info.add("This weapon has been used " + itemstack.getItemDamage() + " times");
		info.add("Right click to send mob in the air");
		
		if (isCharged(itemstack.getItemDamage())) {
			info.add("This weapon is charged");
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIconFromDamage(int dmg) {
		if (isCharged(dmg)) {
			return chargedIcon;
		}else{
			return itemIcon;
		}
	}
	
	private boolean isCharged(int dmg){
		return dmg >= 5;
	}
	
}