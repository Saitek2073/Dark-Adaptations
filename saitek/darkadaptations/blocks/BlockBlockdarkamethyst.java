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

public class BlockBlockdarkamethyst  extends Block{

	public BlockBlockdarkamethyst(int id) {
		super(id,Material.rock);
		 setCreativeTab(OreTab.tabOre);
		 setLightValue(0.6F);
		 setHardness(9F);
		 setResistance(60F);
		 setStepSound(Block.soundStoneFootstep);
		 setUnlocalizedName(BlockInfo.BLOCKDARKAMETHYST_UNLOCALIZED_NAME);	
	}
	public interface IBlockInfo {


		public void getBlockInfo(IBlockAccess world, int x, int y, int z, ForgeDirection side, EntityPlayer player, List<String> info, boolean debug);
   
}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		blockIcon = register.registerIcon(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.BLOCKDARKAMETHYST_TEXTURE);
	}
	
	
	
}
