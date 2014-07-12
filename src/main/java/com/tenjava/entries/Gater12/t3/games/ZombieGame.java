package com.tenjava.entries.Gater12.t3.games;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitTask;

import com.tenjava.entries.Gater12.t3.managers.ZombieGameManager;
import com.tenjava.entries.Gater12.t3.misc.Difficulty;

public class ZombieGame {
	
	private Player p;
	private int time;
	private Difficulty d;
	private BukkitTask bt;
	
	public ZombieGame(int time, Difficulty d, Player p){
		this.p = p;
		this.time = time;
		this.d = d;
	}
	
	private void init(){
		ZombieGameManager.INSTANCE.addIntoGame(p, this);
	}
	
	public void stop(){
		bt.cancel();
	}
}
