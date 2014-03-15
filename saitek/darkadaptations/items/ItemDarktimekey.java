package saitek.darkadaptations.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import saitek.darkadaptations.creativetabs.ItemTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDarktimekey extends Item {

	public ItemDarktimekey(int par1) {
		super(par1);
		setCreativeTab(ItemTab.tabItem);
		setUnlocalizedName(ItemInfo.DARKTIMEKEY_UNLOCALIZED_NAME);
	}
	
	
	@Override
	//@SideOnly(Side.CLIENT)
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World world,
			EntityPlayer player) {
		
		
		
		
		
		int xpos = (int)player.posX; int ypos = (int)player.posY; int zpos = (int)player.posZ;
		
		if(!world.isDaytime()){
			player.sleepInBedAt(  xpos,  ypos, zpos);
			player.sleepTimer = 2000;
		}
		
		return super.onItemRightClick(par1ItemStack, world, player);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.DARKTIMEKEY_ICON);
		
		
		
	}
	@Override
		@SideOnly(Side.CLIENT)
		public void addInformation(ItemStack itemstack, EntityPlayer player, List info, boolean useExtraInfomation) {
			info.add("Right Click to Change Night to Day");
			
			
		}
}
	
