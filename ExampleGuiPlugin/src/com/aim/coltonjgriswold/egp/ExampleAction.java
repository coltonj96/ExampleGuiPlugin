package com.aim.coltonjgriswold.egp;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;

import com.aim.coltonjgriswold.sga.api.gui.SimpleAction;

public class ExampleAction implements SimpleAction {

    private Player p;
    
    public ExampleAction(Player player) {
	p = player;
    }
    
    @Override
    public void run(ClickType click) {
	p.sendMessage("The Cake Is A Lie!");
	p.closeInventory();
    }

}
