package com.revised.CallOfDutyMC;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class Classes {
	public static void classA(Player player){
		PlayerInventory inv = player.getInventory();
		ItemStack i = new ItemStack(Material.BOW,1);
		ItemStack ii = new ItemStack(Material.ARROW,64);
		ItemStack iii = new ItemStack(Material.ARROW,64);
		ItemStack iiii = new ItemStack(Material.ARROW,64);
		inv.addItem(i);
		inv.addItem(ii);
		inv.addItem(iii);
		inv.addItem(iiii);
	}
	public static void classB(Player player){
		PlayerInventory inv = player.getInventory();
		ItemStack b = new ItemStack(Material.DIAMOND_SWORD,1);
		ItemStack bb = new ItemStack(Material.GOLDEN_APPLE,1);
		ItemStack n = new ItemStack(Material.DIAMOND_BOOTS,1);
		ItemStack nn = new ItemStack(Material.DIAMOND_CHESTPLATE,1);
		ItemStack nnn = new ItemStack(Material.DIAMOND_HELMET,1);
		ItemStack nnnn = new ItemStack(Material.DIAMOND_LEGGINGS,1);
		inv.setBoots(n);
		inv.setChestplate(nn);
		inv.setHelmet(nnn);
		inv.setLeggings(nnnn);
		inv.addItem(b);
		inv.addItem(bb);
	}

}
