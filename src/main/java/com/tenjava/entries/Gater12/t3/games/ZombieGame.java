package com.tenjava.entries.Gater12.t3.games;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.bukkit.entity.Player;

import com.tenjava.entries.Gater12.t3.misc.Difficulty;

public class ZombieGame {
	private static Set<UUID> ingame = new HashSet<>();
	public static boolean isInGame(Player p){
		return ingame.contains(p.getUniqueId());
	}
	
	private Player[] p;
	private int time;
	private Difficulty d;
	
	public ZombieGame(int time, Difficulty d, Player... p){
		this.p = p;
		this.time = time;
		this.d = d;
	}
	
	private void init(){
		
	}
}
