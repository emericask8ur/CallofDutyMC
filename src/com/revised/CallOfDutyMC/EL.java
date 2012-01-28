package com.revised.CallOfDutyMC;

import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.event.entity.EntityListener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class EL extends EntityListener{
	public static boolean gran = false;
	public static boolean smoke = false;
	public void onProjectileHit(ProjectileHitEvent event){
		Entity e = event.getEntity();
		World w = e.getWorld();
		Location loc = e.getLocation();
		if(e instanceof org.bukkit.entity.Egg){
			if(gran){
			w.createExplosion(loc, 2);
		  }
		}
			if (e instanceof org.bukkit.entity.Snowball){
				if(smoke){
					w.createExplosion(loc, -10);
					w.createExplosion(loc, -2);
					w.playEffect(loc, Effect.SMOKE, 1);
					w.playEffect(loc, Effect.SMOKE, 1);
					w.playEffect(loc, Effect.SMOKE, 1);
					w.playEffect(loc, Effect.SMOKE, 1);
					w.playEffect(loc, Effect.SMOKE, 1);
			}
		}
	}
}
