package saitek.darkadaptations.block;

import saitek.darkadaptations.common.DarkAdaptations;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockDarkIronOre extends Block {

	public BlockDarkIronOre(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setCreativeTab(DarkAdaptations.TabDark);
		this.setLightValue(0.2F);
		this.setHardness(5);
		this.setResistance(10);
		
	}
	public void registerIcons(IconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon("DarkAdaptations:DarkIronOre");
	}
}
