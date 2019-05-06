package de.serverlinks.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class VoteCommand  implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			if(player.hasPermission("serverlinks.vote")) {
				if(args.length == 0) {
					
					player.sendMessage("§cVote: §b§l");

				} else
					player.sendMessage("§cBitte benutze §6/vote§c!");
				
			} else
				player.sendMessage("§cDazu hast du keine Rechte!");
			
		}
		
		
		return false;
	}

	
	
}