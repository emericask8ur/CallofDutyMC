package com.revised.CallOfDutyMC;



import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import org.bukkit.event.player.PlayerListener;
import org.bukkit.inventory.ItemStack;


public class PL extends PlayerListener{
	public static boolean auto = false;
	public static boolean join = false;
	public static boolean on = false;
	public static boolean mini = false;
	public void onPlayerInteract(PlayerInteractEvent event){
		Player p = event.getPlayer();
		World w= p.getWorld();
		ItemStack i = new ItemStack(Material.ARROW,1);
		if(on){
		if(event.getAction() == Action.LEFT_CLICK_AIR){
			if(p.getItemInHand().getType() == Material.STICK){
					p.shootArrow();
					p.getInventory().removeItem(i);
					w.createExplosion(p.getLocation(), -0);
					}
				if(auto){
					p.shootArrow();
					p.shootArrow();
					p.shootArrow();
					p.shootArrow();
					w.createExplosion(p.getLocation(), -2);
					}
			}
		}
				if(mini){
					if(event.getAction()==Action.RIGHT_CLICK_AIR){
						if(p.getItemInHand().getType()==Material.STICK){
							p.shootArrow();
							p.shootArrow();
							p.shootArrow();
							p.shootArrow();
							p.shootArrow();
							p.shootArrow();
							p.shootArrow();
							p.shootArrow();
							p.shootArrow();
							p.shootArrow();
							p.shootArrow();
							p.shootArrow();
							w.playEffect(p.getLocation(), Effect.BOW_FIRE, 6);
							p.getInventory().removeItem(i);
							w.dropItem(p.getLocation(),i);
					}
					}
					
				}
			}
	}


