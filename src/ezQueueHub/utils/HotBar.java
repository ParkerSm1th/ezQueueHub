package com.yeetdev.ezQueueHub.utils;

import java.util.Arrays;

import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class HotBar implements Listener {

    public static void openHotbar(Player p)
    {

        final ItemStack a = new ItemStack(351, 1, (short) 10);
        ItemStack b = new ItemStack(Material.COMPASS, 1);
        final ItemStack c = new ItemStack(351, 1, (short) 8);


        ItemMeta bm = b.getItemMeta();
        ItemMeta am = a.getItemMeta();
        ItemMeta cm = c.getItemMeta();


        bm.setDisplayName("§9Server Selector");
        bm.setLore(Arrays.asList("§7Select your server to join!"));
        bm.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES});

        am.setDisplayName("§7Players: §aVisible");
        am.setLore(Arrays.asList("§7Right Click to Hide Players"));
        am.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES});

        cm.setDisplayName("§7Players: §cHidden");
        cm.setLore(Arrays.asList("§7Right Click to Show Players"));
        cm.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES});

        b.setItemMeta(bm);
        a.setItemMeta(am);
        c.setItemMeta(cm);

        p.getInventory().clear();
        p.getInventory().setItem(4, b);
        p.getInventory().setItem(8, a);


    }

    public static void hidePlayers(Player p)
    {

        final ItemStack c = new ItemStack(351, 1, (short) 8);

        ItemMeta cm = c.getItemMeta();


        cm.setDisplayName("§7Players: §cHidden");
        cm.setLore(Arrays.asList("§7Right Click to Show Players"));
        cm.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES});

        c.setItemMeta(cm);

        for (Player pl : Bukkit.getOnlinePlayers()) {
            p.hidePlayer(pl);
        }

        p.getInventory().setItem(8, c);

        Chat.getInstance().sendMessage(p, "All players are now hidden!");


    }

    public static void showHotbar(Player p)
    {

        final ItemStack a = new ItemStack(351, 1, (short) 10);




        ItemMeta am = a.getItemMeta();

        am.setDisplayName("§7Players: §aVisible");
        am.setLore(Arrays.asList("§7Right Click to Hide Players"));
        am.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES});

        a.setItemMeta(am);

        for (Player pl : Bukkit.getOnlinePlayers()) {
            p.showPlayer(pl);
        }

        p.getInventory().setItem(8, a);

        Chat.getInstance().sendMessage(p, "All players are now visible!");


    }




}
