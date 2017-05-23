package com.yeetdev.ezQueueHub.utils;



import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


import java.util.Arrays;

public class ServerSelector implements Listener {

    public static void openSelector(Player p) {



        Inventory i = Bukkit.createInventory(null, 9, "§cPlease select your server");

        ItemStack a = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemStack b = new ItemStack(Material.STONE_SWORD, 1);
        ItemStack c = new ItemStack(Material.IRON_SWORD, 1);

        ItemMeta am =  a.getItemMeta();
        ItemMeta bm = b.getItemMeta();
        ItemMeta cm = c.getItemMeta();



        am.setDisplayName(ChatColor.translateAlternateColorCodes('&', "§7» §cHCF §7«"));

        am.setLore(Arrays.asList(" ",
                "§cPlayers: §7(" + PlayerQuery.op1 + "§7/" + PlayerQuery.tp1 + "§7)",
                " ",
                " ",
                "§7Click to join the queue!",
                " "));

        bm.setDisplayName(ChatColor.translateAlternateColorCodes('&', "§7» §cSquads §7«"));

        bm.setLore(Arrays.asList(" ",
                "§cPlayers: §7(" + PlayerQuery.op2 + "§7/" + PlayerQuery.tp2 + "§7)",
                " ",
                " ",
                "§7Click to join the queue!",
                " "));

        cm.setDisplayName(ChatColor.translateAlternateColorCodes('&', "§7» §cKits §7«"));

        cm.setLore(Arrays.asList(" ",
                "§cPlayers: §7(" + PlayerQuery.op3 + "§7/" + PlayerQuery.tp3 + "§7)",
                " ",
                " ",
                "§7Click to join the queue!",
                " "));

        a.setItemMeta(am);
        b.setItemMeta(bm);
        c.setItemMeta(cm);

        i.setItem(2, b);

        i.setItem(4, a);

        i.setItem(6, c);


        p.openInventory(i);
    }


}
