package de.serverlinks.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class ForumCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			if(player.hasPermission("serverlinks.forum")) {
				if(args.length == 0) {
					
					player.sendMessage("§cForum: §b§lhttp://www.endergamesmc.de/forum/");

				} else
					player.sendMessage("§cBitte benutze §6/forum§c!");
				
			} else
				player.sendMessage("§cDazu hast du keine Rechte!");
			
		}
		
		
		return false;
	}

	
	

}
