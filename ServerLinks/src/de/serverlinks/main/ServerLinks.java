package de.serverlinks.main;



import org.bukkit.plugin.java.JavaPlugin;

import de.serverlinks.commands.DiscordCommand;
import de.serverlinks.commands.TSCommand;
import de.serverlinks.commands.VoteCommand;
import de.serverlinks.commands.WebCommand;


public class ServerLinks extends JavaPlugin{
	
	private static ServerLinks plugin;
	
	public void onEnable() {
		plugin = this;

		
		getCommand("discord").setExecutor(new DiscordCommand());
		getCommand("ts").setExecutor(new TSCommand());
		getCommand("web").setExecutor(new WebCommand());
		getCommand("vote").setExecutor(new VoteCommand());

	}

	public static ServerLinks getPlugin() {
		return plugin;
	}


 
}