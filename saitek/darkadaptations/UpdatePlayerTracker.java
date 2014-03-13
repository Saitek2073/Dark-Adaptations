package saitek.darkadaptations;

import net.minecraft.entity.player.EntityPlayer;
import cpw.mods.fml.common.IPlayerTracker;

public class UpdatePlayerTracker implements IPlayerTracker {

	@Override
	public void onPlayerLogin(EntityPlayer player) {
        if (ModInfo.UPDATEA == true) {
            player.addChatMessage(ModInfo.NAME + ": A new version is available!");
        }else{
player.addChatMessage(ModInfo.NAME + ": Is up to date.");
     }
        
    }

	@Override
	public void onPlayerLogout(EntityPlayer player) {
		
	}

	@Override
	public void onPlayerChangedDimension(EntityPlayer player) {
		
	}

	@Override
	public void onPlayerRespawn(EntityPlayer player) {
		
	}

}
