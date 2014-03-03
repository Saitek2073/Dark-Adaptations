package saitek.darkadaptations.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import saitek.darkadaptations.creativetabs.MainTab;
import saitek.darkadaptations.items.Items;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDarkGlowrock extends Block {
	
	public BlockDarkGlowrock(int id) {
		super(id, Material.glass);
		setCreativeTab(MainTab.tabMain);
		setLightValue(0.9F);
		setHardness(0.3F);
		setResistance(5F);
		setStepSound(Block.soundGlassFootstep);
		setUnlocalizedName(BlockInfo.DARKGLOWROCK_UNLOCALIZED_NAME);
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
