package com.revised.CallOfDutyMC;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public class EX {
	/*
	 * Implement  Buying of Classes
	 */
	
	public static void nuke(World world, Location location){
		world.createExplosion(location, 60);
	}
	
	public static void KILL(Entity ent){
		float get = ((Player) ent).getExp();
		float x = get + 10;
		((Player) ent).setExp(x);
	}
}
