package saitek.darkadaptations.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import saitek.darkadaptations.creativetabs.MainTab;
import saitek.darkadaptations.tileentities.TileEntityFiller;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDarkBlockfiller extends BlockContainer {
	public BlockDarkBlockfiller(int id) {
		super(id, Material.iron);
		//setCreativeTab(CreativeTabs.tabBlock);
		setCreativeTab(MainTab.tabMain);
		setHardness(2F);
		setStepSound(Block.soundMetalFootstep);
		setUnlocalizedName(BlockInfo.DARKBLOCKFILLER_UNLOCALIZED_NAME);
		setLightOpacity(0);
	}
	
	@SideOnly(Side.CLIENT)
	private Icon idleIcon;
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		blockIcon = register.registerIcon(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.DARKBLOCKFILLER_TEXTURE);
		idleIcon = register.registerIcon(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.DARKBLOCKFILLER_TEXTURE);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int meta) {
		return meta == 0 ? blockIcon : idleIcon;
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileEntityFiller();
	}
	
	@Override
	public int idDropped(int meta, Random random, int fortune) {
		return -1;
	}

}
