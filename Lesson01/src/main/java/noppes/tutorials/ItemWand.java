package noppes.tutorials;

import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemWand extends Item {

	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int x, int y, int z, int face, float par8, float par9, float par10) {
		if (face != 1)
			return false;
		if (!par3World.isRemote) {
			EntityPig pig = new EntityPig(par3World);
			pig.setPosition(x + 0.5, y + 1, z + 0.5);
			par3World.spawnEntityInWorld(pig);
		}
		return true;
	}
}
