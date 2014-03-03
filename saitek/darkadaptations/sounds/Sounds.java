package saitek.darkadaptations.sounds;

import net.minecraft.client.Minecraft;

public enum Sounds {
	DARKGREATWAND_USE("end"),
	DARKWAND_USE("wand");
	
	
	
	
	
	public static final String SOUNDS_LOCATION = "darkadaptations";
    private String name;
    
    Sounds(String name) {
    	this.name = name;
    }
	
    public String getName() {
    	return name;
    }
    
    public void play(double x, double y, double z, float volume, float pitch) {
    	Minecraft.getMinecraft().sndManager.playSound(SOUNDS_LOCATION + ":" + name, (float)x, (float)y, (float)z, volume, pitch);
    }
}
