package saitek.darkadaptations.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import saitek.darkadaptations.creativetabs.MainTab;
import saitek.darkadaptations.sounds.Sounds;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDarkGreatsword extends ItemSword {
	
	public ItemDarkGreatsword(int id, EnumToolMaterial par2EnumToolMaterial) {
		super(id, par2EnumToolMaterial);		
		setCreativeTab(MainTab.tabMain);
		setMaxStackSize(1);
	
		setUnlocalizedName(ItemInfo.DARKGREATSWORD_UNLOCALIZED_NAME);
		
	
}

@Override
public boolean itemInteractionForEntity(ItemStack itemstack, EntityPlayer player, EntityLivingBase target) {
	if (!target.worldObj.isRemote) {
		target.setFire(10);
		target.setInWeb();
		
		itemstack.setItemDamage(0);
		
	}else{
		itemstack.setItemDamage(itemstack.getItemDamage() + 1);
		
		
	}				
	return false;
		
		
		
		
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.DARKGREATSWORD_ICON);
	}
	

}