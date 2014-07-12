package com.tenjava.entries.Gater12.t3.managers;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.bukkit.entity.Player;

import com.tenjava.entries.Gater12.t3.games.ZombieGame;

public enum ZombieGameManager {
	INSTANCE;
	
	private Map<UUID, ZombieGame> map = new HashMap<>();
	
	public boolean isInGame(Player p){
		return map.containsKey(p.getUniqueId());
	}
	
	public ZombieGame getZombieGame(Player p){
		if(!isInGame(p)) throw new NullPointerException("A ZombieGame object does not exist for this player!");
		else{
			return map.get(p.getUniqueId());
		}
	}
	
	public void addIntoGame(Player p, ZombieGame g){
		if(isInGame(p)) map.get(p.getUniqueId()).stop();
		map.put(p.getUniqueId(), g);
	}
}
