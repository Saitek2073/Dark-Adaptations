package saitek.darkadaptations.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import saitek.darkadaptations.creativetabs.MainTab;
import saitek.darkadaptations.sounds.Sounds;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class ItemDarkWand extends Item  {

	public ItemDarkWand(int id) {
		super(id);
		setCreativeTab(MainTab.tabMain);
		setMaxStackSize(1);
		setUnlocalizedName(ItemInfo.DARKWAND_UNLOCALIZED_NAME);
	}
	
	@Override
	public boolean itemInteractionForEntity(ItemStack itemstack, EntityPlayer player, EntityLivingBase target) {
		if (!target.worldObj.isRemote) {
			target.setFire(10);
			target.setInWeb();
			
			itemstack.setItemDamage(0);
			Sounds.DARKWAND_USE.play(target.posX, target.posY, target.posZ, 1, 3);
		}else{
			itemstack.setItemDamage(itemstack.getItemDamage() + 1);
			Sounds.DARKWAND_USE.play(target.posX, target.posY, target.posZ, 1, 0);
			
		}				
		return false;		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.DARKWAND_ICON);
	}
}

