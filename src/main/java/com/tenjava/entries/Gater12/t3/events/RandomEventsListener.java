package com.tenjava.entries.Gater12.t3.events;

import java.util.HashSet;
import java.util.Set;

import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import com.tenjava.entries.Gater12.t3.TenJava;
import com.tenjava.entries.Gater12.t3.games.ZombieGame;
import com.tenjava.entries.Gater12.t3.misc.Difficulty;
import com.tenjava.entries.Gater12.t3.misc.Misc;

public class RandomEventsListener implements Listener{
	private TenJava plugin;
	private FileConfiguration config;
	
	public RandomEventsListener(TenJava plugin){
		this.plugin = plugin;
		this.config = plugin.getConfig();
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler(ignoreCancelled = true)
	public void onBreak(BlockBreakEvent e){
		Set<Material> l = new HashSet<>();{
			for(String s : config.getStringList("zombiegame.blocks"))
				l.add(Material.valueOf(s.toUpperCase()));
		}
		if(l.contains(e.getBlock().getType())){
			int c = config.getInt("zombiegame.chance");
			if(Misc.randomNumber(c) >= (c/2)){
				new ZombieGame(config.getInt("zombiegame.game-time"), Difficulty.valueOf(config.getString("zombiegame.difficulty").toUpperCase()), e.getPlayer());
			}
		}
	}
}
