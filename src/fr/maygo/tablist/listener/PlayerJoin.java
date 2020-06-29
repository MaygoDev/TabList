package fr.maygo.tablist.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import fr.maygo.tablist.Main;
import fr.maygo.tablist.TabList;

public class PlayerJoin implements Listener{
	
	@EventHandler
	public static void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		TabList.sendHeaderFooter(player, Main.getHeader(), Main.getFooter());
	}
	
}
