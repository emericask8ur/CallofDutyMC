package com.revised.CallOfDutyMC;

import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class PL implements Listener {
	public static boolean auto = false;
	public static boolean join = false;
	public static boolean on = false;
	public static boolean mini = false;

	@EventHandler(priority = EventPriority.NORMAL)
	public void onPlayerInteract(PlayerInteractEvent event) {
		Player p = event.getPlayer();
		World w = p.getWorld();
		ItemStack i = new ItemStack(Material.ARROW, 1);
		if (on) {
			if (event.getAction() == Action.LEFT_CLICK_AIR) {
				if (p.getItemInHand().getType() == Material.STICK && p.getInventory().contains(Material.ARROW)) {
					for (int x = 0; x < 1; x++) {
						p.launchProjectile(Arrow.class);
						p.getInventory().removeItem(i);
						w.createExplosion(p.getLocation(), -0);
					}
				}
				if (auto) {
					for (int a = 0; a < 4; a++) {
						p.launchProjectile(Arrow.class);
						p.getInventory().remove(new ItemStack(Material.ARROW, 1));
					}
					w.createExplosion(p.getLocation(), -2);
					p.getInventory().remove(new ItemStack(Material.ARROW, 1));
				}
			}
		}
		if (mini) {
			if (event.getAction() == Action.RIGHT_CLICK_AIR) {
				if (p.getItemInHand().getType() == Material.STICK && p.getInventory().contains(Material.ARROW)) {
					for (int b = 0; b < 9; b++) {
						p.launchProjectile(Arrow.class);
						p.getInventory().remove(new ItemStack(Material.ARROW, 1));
					}
					w.playEffect(p.getLocation(), Effect.BOW_FIRE, 6);
					p.getInventory().remove(new ItemStack(Material.ARROW, 3));
				}
			}
		}
	}
	@EventHandler(priority = EventPriority.NORMAL)
	public void onEntityDeath(EntityDeathEvent event){
		Entity ent = event.getEntity();
		World wa = ent.getWorld();
		if(ent instanceof Player){
			wa.dropItemNaturally(ent.getLocation(), new ItemStack(Material.ARROW,1)); 
		}
	}
}
