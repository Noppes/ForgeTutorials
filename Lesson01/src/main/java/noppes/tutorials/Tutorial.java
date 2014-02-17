package noppes.tutorials;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid="tutorial", name="Tutorial", version="1")
public class Tutorial {
	
	public static Item wand;

	@EventHandler
	public void preInit(FMLPreInitializationEvent ev) {
		wand = new ItemWand().setUnlocalizedName("tutorial_wand").setCreativeTab(CreativeTabs.tabTools).setTextureName("tutorial:wand");
		GameRegistry.registerItem(wand, "tutorial_wand");
	}
}
