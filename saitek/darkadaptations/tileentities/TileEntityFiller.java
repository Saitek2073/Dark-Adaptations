package saitek.darkadaptations.tileentities;

import net.minecraft.block.Block;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import saitek.darkadaptations.blocks.BlockInfo;

public class TileEntityFiller extends TileEntity {

	private static final int SPREAD_TIME = 4;
	public static int SPREAD_LEVELS;
		
	private int timer;
	private int level;
	
	public TileEntityFiller() {
		timer = SPREAD_TIME;
		level = 0;
	}
	
	public boolean isIdle() {
		return timer < 0;
	}
	
	@Override
	public void updateEntity() {
		if (!worldObj.isRemote) {
			if (timer == 0 && level < SPREAD_LEVELS) {
				spread(xCoord + 1, yCoord, zCoord);
				spread(xCoord - 1, yCoord, zCoord);
				spread(xCoord, yCoord, zCoord + 1);
				spread(xCoord, yCoord, zCoord - 1);
				
				
				worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, 1, 3);
			}else if (timer == SPREAD_TIME * (level - SPREAD_LEVELS)) {
				worldObj.setBlock(xCoord, yCoord, zCoord, Block.stone.blockID);
			}
			timer--;
		}
		
		//if (timer % 5 == 0) {
		//	worldObj.playSound(xCoord, yCoord, zCoord, "darkrising:filler.filler", 1F, 1F, false);
		//}
	}
	
	private void spread(int x, int y, int z) {
		if (
				worldObj.isAirBlock(x, y, z) || 
				worldObj.getBlockId(x, y, z) == Block.waterStill.blockID || 
				worldObj.getBlockId(x, y, z) == Block.waterMoving.blockID || 
				worldObj.getBlockId(x, y, z) == Block.lavaStill.blockID || 
				worldObj.getBlockId(x, y, z) == Block.lavaMoving.blockID
			    
			) {
			worldObj.setBlock(x, y, z, BlockInfo.DARKBLOCKFILLER_ID);
			
			TileEntity tile = worldObj.getBlockTileEntity(x, y, z);
			
			if (tile != null && tile instanceof TileEntityFiller) {
				TileEntityFiller filler = (TileEntityFiller)tile;
				filler.level = level + 1;
			}
		}
	}
	
	@Override
	public void writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);
		compound.setShort("Timer", (short)timer);
		compound.setByte("level", (byte)level);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound) {
		super.readFromNBT(compound);
		timer = compound.getShort("Timer");
		level = compound.getByte("level");
	}

}
