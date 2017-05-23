package com.yeetdev.ezQueueHub.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.entity.PlayerDeathEvent;


public class EntityDamage implements Listener {

    @EventHandler
    public void onEntityDamage(EntityDamageEvent e) {
        if (e.getEntity() instanceof Player) {
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void onDeath(PlayerDeathEvent e)
    {
        e.setDeathMessage(null);
        e.setDroppedExp(0);
        e.setKeepLevel(true);
        e.setKeepInventory(true);
    }

    @EventHandler
    public void onFoodLevelChange(FoodLevelChangeEvent event) {

        if (event.getEntity() == null || !(event.getEntity() instanceof Player)) return;
        Player player = (Player) event.getEntity();

        event.setCancelled(true);

    }

}