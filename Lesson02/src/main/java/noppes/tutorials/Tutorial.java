package noppes.tutorials;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid="tutorial",name="Tutorial",version="1")
public class Tutorial {
	
	public static Item wand;
	
	public static Block spawn;

	@EventHandler
	public void init(FMLInitializationEvent ev) {
		wand = new ItemWand().setUnlocalizedName("tutorial_wand").setCreativeTab(CreativeTabs.tabTools).setTextureName("tutorial:wand");
		GameRegistry.registerItem(wand, "tutorial_wand");
		
		spawn = new BlockSpawn().setBlockName("tutorial_spawn").setBlockTextureName("tutorial:spawn").setCreativeTab(CreativeTabs.tabTools);
		GameRegistry.registerBlock(spawn, "tutorial_spawn");
	}
}
