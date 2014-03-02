package saitek.darkadaptations.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import saitek.darkadaptations.creativetabs.MainTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDarkIronOre extends Block {
	
	public BlockDarkIronOre(int id) {
		super(id, Material.rock);
		setCreativeTab(MainTab.tabMain);
		setLightValue(0.2F);
		setHardness(3F);
		setResistance(10F);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName(BlockInfo.DARKIRONORE_UNLOCALIZED_NAME);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		blockIcon = register.registerIcon(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.DARKIRONORE_TEXTURE);
	}	
}
