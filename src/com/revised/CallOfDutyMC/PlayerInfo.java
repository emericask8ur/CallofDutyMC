package com.revised.CallOfDutyMC;

import java.util.HashMap;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerEvent;


public class PlayerInfo {
	  //Main Code
	  private static HashMap<String, PlayerInfo> storedInfo = new HashMap<String, PlayerInfo>();
	  public static PlayerInfo get(String playerName) {
	    PlayerInfo info = storedInfo.get(playerName);
	    if (info == null) {
	      info = new PlayerInfo();
	      storedInfo.put(playerName, info);
	    }
	    return info;
	  }
	  public static PlayerInfo get(Player player) {
	    return get(player.getName());
	  }
	  public static PlayerInfo get(PlayerEvent event) {
	    return get(event.getPlayer());
	  }
	  public static PlayerInfo get(Entity entity) {
	    if (entity instanceof Player) {
	      return get((Player) entity);
	    } else {
	      return get(entity.getClass().getSimpleName());
	    }
	  }
	  //Sub Code
	  
	  public PlayerInfo() {
	    //Set the default values here
	    this.isPredator = false;
	    this.killedEntityCount = 0;
	  }
	  
	  public boolean isPredator;
	  public int killedEntityCount;
	  
	}