package saitek.darkadaptations.creativetab;

import saitek.darkadaptations.common.DarkAdaptations;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabDark extends CreativeTabs {

	public CreativeTabDark(int par1, String par2Str) {
		super(par1, par2Str);		
	}
	public int getTabIconItemIndex() {
		return DarkAdaptations.DarkGreatsword.itemID;
	}
	public String getTranslatedTabLabel() {
		return "Dark Adaptations";
	}

}
