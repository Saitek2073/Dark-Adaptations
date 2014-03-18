package saitek.darkadaptations.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.ForgeDirection;
import saitek.darkadaptations.creativetabs.OreTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDarkswampgrass extends Block {

	public BlockDarkswampgrass(int id) {
		super(id, Material.grass);
		setCreativeTab(OreTab.tabOre);
		setLightValue(0.3F);
		setHardness(4F);
		setResistance(4F);
		setStepSound(Block.soundGrassFootstep);
		setUnlocalizedName(BlockInfo.DARKSWAMPGRASS_UNLOCALIZED_NAME);
	}
	public interface IBlockInfo {
		


		public void getBlockInfo(IBlockAccess world, int x, int y, int z, ForgeDirection side, EntityPlayer player, List<String> info, boolean debug);

	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		blockIcon = register.registerIcon(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.DARKSWAMPGRASS_TEXTURE);
		
		
	}
	


}
