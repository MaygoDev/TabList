package fr.maygo.tablist;

import org.bukkit.plugin.java.JavaPlugin;

import fr.maygo.tablist.listener.PlayerJoin;

public class Main extends JavaPlugin {
	
	public static Main instance;
	
	@Override
	public void onEnable() {
		instance = this;
		saveDefaultConfig();
		getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
	}
	
	public static String getHeader() {
		return instance.getConfig().getString("header");
	}

	public static String getFooter() {
		return instance.getConfig().getString("footer");
	}
	
	
}
