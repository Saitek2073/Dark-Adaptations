package saitek.darkadaptations.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import saitek.darkadaptations.common.DarkAdaptations;

public class BlockDarkGlowrock extends Block {

	public BlockDarkGlowrock(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setCreativeTab(DarkAdaptations.TabDark);
		this.setLightValue(0.9F);
		this.setHardness(4);
		this.setResistance(5);
		
	}
	public void registerIcons(IconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon("DarkAdaptations:DarkGlowrock");
	}
	public int idDropped(int par1, Random par2Random, int par3) {
		return DarkAdaptations.Darkdust.itemID;
	}
	public int quantityDropped(Random par1Random) {
		return 2;
	}
	
	
}
