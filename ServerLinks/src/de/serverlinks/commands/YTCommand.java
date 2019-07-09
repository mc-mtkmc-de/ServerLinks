package de.serverlinks.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class YTCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			if(player.hasPermission("sys.yt")) {
				if(args.length == 0) {
					
					player.sendMessage("§8§m========§e§lYoutubeKanäle§8§m========");
					player.sendMessage("§cMigidinhoo:   §b§lwww.youtube.com/channel/UCHHBrdQsfy-6lF1CqgassxA");
					player.sendMessage("§cExoKing:      §b§lwww.youtube.com/channel/UCpdInMGTKJ0exkjYAEzLmTA");

				} else
					player.sendMessage("§cBitte benutze §6/yt§c!");
				
			} else
				player.sendMessage("§cDazu hast du keine Rechte!");
			
		}
		
		
		return false;
	}

	
	
}