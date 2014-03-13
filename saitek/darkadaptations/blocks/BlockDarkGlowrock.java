package saitek.darkadaptations.blocks;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.ForgeDirection;
import saitek.darkadaptations.creativetabs.WeaponTab;
import saitek.darkadaptations.creativetabs.OreTab;
import saitek.darkadaptations.items.Items;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDarkGlowrock extends Block {
	
	public BlockDarkGlowrock(int id) {
		super(id, Material.glass);
		setCreativeTab(OreTab.tabOre);
		setLightValue(0.9F);
		setHardness(0.3F);
		setResistance(5F);
		setStepSound(Block.soundGlassFootstep);
		setUnlocalizedName(BlockInfo.DARKGLOWROCK_UNLOCALIZED_NAME);
	}
	public interface IBlockInfo {


		public void getBlockInfo(IBlockAccess world, int x, int y, int z, ForgeDirection side, EntityPlayer player, List<String> info, boolean debug);

	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		blockIcon = register.registerIcon(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.DARKGLOWROCK_TEXTURE);
	}
	
	@Override
	public int idDropped(int par1, Random par2Random, int par3) {
		return Items.darkdust.itemID;
	}
		
	@Override
	public int quantityDropped(Random par1Random) {
		return 2;
	}
}
