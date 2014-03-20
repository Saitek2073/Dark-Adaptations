package saitek.darkadaptations.blocks;

import net.minecraft.block.BlockPortal;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.src.ModLoader;
import net.minecraft.world.World;
import saitek.darkadaptations.DarkAdaptations;

public class BlockDarkTeleporter extends BlockPortal {

	public BlockDarkTeleporter(int id) {
		super(id);
	}
	
	
	public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity){
		if(entity.ridingEntity == null && entity.riddenByEntity == null && entity instanceof EntityPlayerMP ){
			EntityPlayerMP player = (EntityPlayerMP) entity;
			MinecraftServer server = MinecraftServer.getServer();
			
			if(player.timeUntilPortal > 0){
				player.timeUntilPortal = 10;
			}else if(player.dimension != DarkAdaptations.dimensionIdDarkVoid){ 
				player.timeUntilPortal = 10;
				player.mcServer.getConfigurationManager().transferPlayerToDimension(player, DarkAdaptations.dimensionIdDarkVoid, new TeleporterDarkvoid(server.worldServerForDimension(DarkAdaptations.dimensionIdDarkVoid)));
			}else{
				player.timeUntilPortal = 10;
				player.mcServer.getConfigurationManager().transferPlayerToDimension(player, 0, new TeleporterDarkvoid(server.worldServerForDimension(0)));	
			 }
		}
	}
	
	public boolean tryToCreatePortal(World world, int x, int y, int z){
		byte b = 0;
		byte b1 = 0;
		
		if(world.getBlockId(x-1, y, z) == Blocks.blockdarkamethyst.blockID || world.getBlockId(x+1, y, z) == Blocks.blockdarkamethyst.blockID){
			b = 1;			
		}
		
		if(world.getBlockId(x, y, z-1) == Blocks.blockdarkamethyst.blockID || world.getBlockId(x, y, z+1) == Blocks.blockdarkamethyst.blockID){
			b1 = 1;
		}	
			
		if(b == b1){
			return false;
		}else{
			if(world.isAirBlock(x-b, y, z-b1)){
				x-=b;
				z-=z;
			}
			
			
			for(int i = -1; i <= 2; i++){
				for(int j = -1; j <= 3; j++){
					boolean flag = (i == -1 || 1 == 2 || j == -1 || j == 3);
					
					if(i != -1 && i != 2 || j != -1 && j != 3){
						int k = world.getBlockId(x + (b*i), y+j, z+(b1*i));
						
						if(flag){
							if(k != Blocks.blockdarkamethyst.blockID){
								return false;
						}
					  }
				   }
				}		
			}
		}
		
		
		return false;
	}
	
	public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5){
	
	}
	
	
}
