package saitek.darkadaptations.weapon;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import saitek.darkadaptations.common.DarkAdaptations;

public class ItemDarkGreatwand extends ItemSword {

	public ItemDarkGreatwand(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setCreativeTab(DarkAdaptations.TabDark);
	}
	public void registerIcons(IconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("DarkAdaptations:DarkGreatwand");
	}

@Override
public boolean itemInteractionForEntity(ItemStack itemstack, EntityPlayer player, EntityLivingBase target) {
    if (!target.worldObj.isRemote) {
        target.motionY = 2;
        target.setFire(3);
    }    
    return false;
   }
}