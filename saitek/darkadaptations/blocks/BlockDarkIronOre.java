package saitek.darkadaptations.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.ForgeDirection;
import saitek.darkadaptations.creativetabs.MainTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDarkIronOre extends Block {
	
	public BlockDarkIronOre(int id) {
		super(id, Material.rock);
		setCreativeTab(MainTab.tabMain);
		setLightValue(0.2F);
		setHardness(4F);
		setResistance(10F);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName(BlockInfo.DARKIRONORE_UNLOCALIZED_NAME);
	}
	public interface IBlockInfo {
		


		public void getBlockInfo(IBlockAccess world, int x, int y, int z, ForgeDirection side, EntityPlayer player, List<String> info, boolean debug);

	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		blockIcon = register.registerIcon(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.DARKIRONORE_TEXTURE);
		
		
	}	
	
}
