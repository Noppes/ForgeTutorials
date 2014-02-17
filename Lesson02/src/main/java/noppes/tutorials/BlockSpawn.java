package noppes.tutorials;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockSpawn extends Block{

	public BlockSpawn() {
		super(Material.rock);
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9){
		if(!world.isRemote){
			EntitySheep sheep = new EntitySheep(world);
			sheep.setPosition(x + 0.5, y + 1, z + 0.5);
			//gives the sheep a random color
			sheep.setFleeceColor(world.rand.nextInt(16));
			world.spawnEntityInWorld(sheep);
		}
		return true;
	}
}
