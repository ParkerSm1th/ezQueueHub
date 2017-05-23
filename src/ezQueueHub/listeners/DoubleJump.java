package com.yeetdev.ezQueueHub.listeners;

import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerToggleFlightEvent;
import org.bukkit.util.Vector;

public class DoubleJump implements Listener {

    @EventHandler
    public void onMove(PlayerMoveEvent e) {
        Player p = e.getPlayer();
        if (p.getGameMode() == GameMode.CREATIVE || p.getGameMode() == GameMode.SPECTATOR) return;

        if (p.isOnGround()) {
            if (!p.getAllowFlight()) {
                p.setAllowFlight(true);
            }
        }
    }

    @EventHandler
    public void onToggleFly(PlayerToggleFlightEvent e) {
        Player p = e.getPlayer();

        if (p.getGameMode() == GameMode.CREATIVE || p.getGameMode() == GameMode.SPECTATOR)
            return;

        e.setCancelled(true);
        p.setFlying(false);
        p.setAllowFlight(false);
        Location loc = p.getLocation();
        Vector v = loc.getDirection().multiply(2.5f).setY(2.2);
        p.setVelocity(v);
        p.getWorld().playEffect(p.getLocation(), Effect.MOBSPAWNER_FLAMES, 5);
        p.getWorld().playEffect(p.getLocation(), Effect.MOBSPAWNER_FLAMES, 5);
        p.getWorld().playEffect(p.getLocation(), Effect.MOBSPAWNER_FLAMES, 5);
        p.getWorld().playEffect(p.getLocation(), Effect.MOBSPAWNER_FLAMES, 5);
        loc.getWorld().playSound(p.getLocation(), Sound.FIREWORK_BLAST, 1, 0.2f);


    }

}
