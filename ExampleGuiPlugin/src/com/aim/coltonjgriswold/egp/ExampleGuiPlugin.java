package com.aim.coltonjgriswold.egp;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

import com.aim.coltonjgriswold.sga.api.SimpleGui;

public class ExampleGuiPlugin extends JavaPlugin implements Listener {

    public void onEnable() {
	getServer().getPluginManager().registerEvents(this, this);
    }
    
    @EventHandler
    public void OnClickAir(PlayerInteractEvent event) {
	if (event.getAction().equals(Action.LEFT_CLICK_AIR)) {
	    Player player = event.getPlayer();
	    SimpleGui gui = new SimpleGui(player, "Example Gui", 9);
	    gui.setSimpleButton(Material.CAKE, 4, "Click Me!", new ExampleAction(player));
	    gui.open();
	}
    }
}
