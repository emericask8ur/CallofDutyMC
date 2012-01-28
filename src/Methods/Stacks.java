package Methods;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Stacks {
	
	/*
	 * @return ItemStack
	 */
	public static ItemStack stack(Material material, int amount){
		return new ItemStack(material,amount);
	}
}
