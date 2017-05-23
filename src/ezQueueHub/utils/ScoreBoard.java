package com.yeetdev.ezQueueHub.utils;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import ru.tehkode.permissions.PermissionUser;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class ScoreBoard implements Listener {

    public static Plugin plugin;

    public static void createHubScoreboard(Player paramPlayer)
    {



        PermissionUser user = PermissionsEx.getUser(paramPlayer);



        ScoreboardManager manager = Bukkit.getScoreboardManager();
        Scoreboard sb = manager.getNewScoreboard();
        Objective obj = sb.registerNewObjective("Hub", "Lobby");
        obj.setDisplaySlot(DisplaySlot.SIDEBAR);
        obj.setDisplayName("");
        obj.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cHub"));
        obj.getScore(ChatColor.translateAlternateColorCodes('&', "&7&m---")).setScore(6);
        obj.getScore(ChatColor.translateAlternateColorCodes('&', "&cOnline:")).setScore(5);
        obj.getScore(ChatColor.translateAlternateColorCodes('&', "&7") + Bukkit.getServer().getOnlinePlayers().size()).setScore(4);

        String queue = Queue.getQueue(paramPlayer.getUniqueId());

        if (!(queue == null)) {

            obj.getScore(ChatColor.translateAlternateColorCodes('&', "&cRank:")).setScore(3);
            obj.getScore(ChatColor.translateAlternateColorCodes('&', "&7") + user.getPrefix()).setScore(2);

            obj.getScore(ChatColor.translateAlternateColorCodes('&', "&cCurrent Queue")).setScore(1);


            obj.getScore(ChatColor.translateAlternateColorCodes('&', "&7") + queue).setScore(0);

            int position = Queue.getPosition(paramPlayer.getUniqueId());
            int total = Queue.getQueueSize(queue);

            obj.getScore(ChatColor.translateAlternateColorCodes('&', "&cPosition: &7" + position + "/" + total)).setScore(-1);

            obj.getScore(ChatColor.translateAlternateColorCodes('&', "&cThanks for playing!")).setScore(-2);
            obj.getScore(ChatColor.translateAlternateColorCodes('&', "&7&m---")).setScore(-3);

        } else {
            String rank = ChatColor.translateAlternateColorCodes('&', user.getPrefix());
            obj.getScore("   ").setScore(3);
            obj.getScore(ChatColor.translateAlternateColorCodes('&', "&cRank:")).setScore(2);
            obj.getScore(ChatColor.translateAlternateColorCodes('&', "&7") + rank).setScore(1);
            obj.getScore("   ").setScore(-1);
            obj.getScore(ChatColor.translateAlternateColorCodes('&', "&cThanks for playing!")).setScore(-2);
            obj.getScore(ChatColor.translateAlternateColorCodes('&', "&7&m---")).setScore(-3);


        }
        paramPlayer.setScoreboard(sb);
    }

}
