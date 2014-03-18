package saitek.darkadaptations.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import saitek.darkadaptations.creativetabs.WeaponTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDarkGreatsword extends ItemSword {
	
	public ItemDarkGreatsword(int id, EnumToolMaterial par2EnumToolMaterial) {
		super(id, par2EnumToolMaterial);		
		setCreativeTab(WeaponTab.tabWeapon);
		setMaxStackSize(1);
		
		
	
		setUnlocalizedName(ItemInfo.DARKGREATSWORD_UNLOCALIZED_NAME);
		
	
}
	
	
	
	
	

@Override
public boolean itemInteractionForEntity(ItemStack itemstack, EntityPlayer player, EntityLivingBase target) {
	if (!target.worldObj.isRemote) {
		target.setFire(10);
		target.setInWeb();
		
		itemstack.setItemDamage(itemstack.getItemDamage() + 5);
		
	}else{
		itemstack.setItemDamage(itemstack.getItemDamage() + 5);
		
		
	}				
	return false;
		
		
		
		
	}


public ItemStack onItemRightClick(ItemStack itemstack, World world,
			EntityPlayer player) {
		
			itemstack.setItemDamage(itemstack.getItemDamage() + 10);
		
				return itemstack;
		
	}


	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.DARKGREATSWORD_ICON);
		
	}
		@Override
		@SideOnly(Side.CLIENT)
		public void addInformation(ItemStack itemstack, EntityPlayer player, List info, boolean useExtraInfomation) {
			info.add("Right click to set fire and web ");
	}
	

}