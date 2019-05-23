package de.serverlinks.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ShopCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			if(player.hasPermission("serverlinks.shop")) {
				if(args.length == 0) {
					
					player.sendMessage("§cShop: §b§lhttp://www.endergamesmc.de/shop");

				} else
					player.sendMessage("§cBitte benutze §6/shop§c!");
				
			} else
				player.sendMessage("§cDazu hast du keine Rechte!");
			
		}
		
		
		return false;
	}

	
	
}
