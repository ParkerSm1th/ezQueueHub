package com.yeetdev.ezQueueHub.listeners;


import com.yeetdev.ezQueueHub.utils.Chat;
import com.yeetdev.ezQueueHub.utils.HotBar;
import com.yeetdev.ezQueueHub.utils.ScoreBoard;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {

        Player player = e.getPlayer();
        HotBar.openHotbar(player);
        Chat.getInstance().sendMessage(player, "Welcome back!");

        ScoreBoard.createHubScoreboard(player);

    }

}
