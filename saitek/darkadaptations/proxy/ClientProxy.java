package saitek.darkadaptations.proxy;

import saitek.darkadaptations.sounds.SoundHandler;

public class ClientProxy extends CommonProxy {	
	@Override
	public void initSounds() {
		new SoundHandler();
	}
	
	@Override
	public void initRenderers() {
		
	}
}
