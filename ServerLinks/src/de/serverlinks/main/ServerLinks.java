package de.serverlinks.main;



import org.bukkit.plugin.java.JavaPlugin;

import de.serverlinks.commands.*;


public class ServerLinks extends JavaPlugin{
	
	private static ServerLinks plugin;
	
	public void onEnable() {
		plugin = this;

		
		getCommand("discord").setExecutor(new DiscordCommand());
		getCommand("ts").setExecutor(new TSCommand());
		getCommand("web").setExecutor(new WebCommand());
		getCommand("forum").setExecutor(new ForumCommand());
		getCommand("twitter").setExecutor(new TwitterCommand());
		getCommand("shop").setExecutor(new ShopCommand());
		getCommand("yt").setExecutor(new YTCommand());
		getCommand("insta").setExecutor(new InstaCommand());

	}

	public static ServerLinks getPlugin() {
		return plugin;
	}


 
}