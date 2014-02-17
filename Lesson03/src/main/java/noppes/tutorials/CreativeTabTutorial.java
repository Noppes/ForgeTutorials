package noppes.tutorials;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabTutorial extends CreativeTabs{

	public CreativeTabTutorial(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return Tutorial.wand;
	}

}
