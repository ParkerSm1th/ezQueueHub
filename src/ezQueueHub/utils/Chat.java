package com.yeetdev.ezQueueHub.utils;


import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import com.yeetdev.ezQueueHub.Main;
import org.bukkit.plugin.Plugin;

public class Chat {




    static Chat instance = new Chat();

    public static Chat getInstance() {
        return instance;
    }


    public void sendMessage(CommandSender sender, String message) {

        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4[&cHub&4] &c" + message));

    }

}