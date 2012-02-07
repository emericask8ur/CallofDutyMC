package com.revised.CallOfDutyMC;

import java.io.File;
import java.io.IOException;

import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import WriterClass.Writer;

public class EL implements Listener{
	public static boolean gran = false;
	public static boolean smoke = false;
	@EventHandler(priority = EventPriority.NORMAL)
	public void onProjectileHit(ProjectileHitEvent event){
		Entity e = event.getEntity();
		World w = e.getWorld();
		Location loc = e.getLocation();
		if(e instanceof org.bukkit.entity.Egg){
			if(gran){
				w.createExplosion(loc, 2);
			}
		}
		else if (e instanceof org.bukkit.entity.Snowball){
			if(smoke){
				w.createExplosion(loc, -10);
				w.createExplosion(loc, -2);
				for (int i = 0; i<5;i++){
					w.playEffect(loc, Effect.SMOKE, 1);
				}
			}
		}
	}
	@EventHandler(priority = EventPriority.NORMAL)
	public void onEntityDeath(EntityDeathEvent event){
		Entity e = event.getEntity();
		DamageCause cause = e.getLastDamageCause().getCause();
		event.getEntity().getLastDamageCause().getEntity();
		String out = "";
		File file = new File("death.text");
		if (file.exists()) {
			System.out.println("It already Exists!");
		} else {
			try {
				Writer.Write(file, "Events: " + cause); 
			} catch (IOException ii) {
				System.out.println("Failed to Create the File!");
			}
		}
	}
}
