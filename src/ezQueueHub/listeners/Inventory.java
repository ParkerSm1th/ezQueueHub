package com.yeetdev.ezQueueHub.listeners;

import com.yeetdev.ezQueueHub.utils.Chat;
import com.yeetdev.ezQueueHub.utils.HotBar;
import com.yeetdev.ezQueueHub.utils.ServerSelector;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;

/**
 * Created by Parker on 5/22/17.
 */
public class Inventory implements Listener {

    @EventHandler
    private void invCheck1(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getWhoClicked() != null && e.getWhoClicked() instanceof Player) {
            if (e.getInventory() != null && e.getClickedInventory() != null) {
                if (e.getCurrentItem() != null) {
                    if (e.getCurrentItem().getType() == Material.COMPASS) {
                        e.setCancelled(true);
                        Player p1 = (Player) e.getWhoClicked();
                        ServerSelector.openSelector(p1);
                        p.closeInventory();
                    }

                }
            }
        }

    }
    @EventHandler
    public void build(InventoryClickEvent e)
    {

        if(e.getWhoClicked() != null)
        {
            if(e.getInventory() != null &&  e.getClickedInventory() != null)
            {
                if(e.getCurrentItem().getType() == Material.DIAMOND_SWORD) {
                    e.setCancelled(true);

                    Player p = (Player) e.getWhoClicked();
                    e.setCancelled(true);
                    p.closeInventory();
                    Chat.getInstance().sendMessage(p, "Connecting...");
                    p.performCommand("play HCF");
                }
            }
        }
    }
    @EventHandler
    public void dev(InventoryClickEvent e)
    {

        if(e.getWhoClicked() != null)
        {
            if(e.getInventory() != null &&  e.getClickedInventory() != null)
            {
                if(e.getCurrentItem() != null)
                {
                    if(e.getCurrentItem().hasItemMeta())
                    {
                        if(e.getCurrentItem().getItemMeta().hasDisplayName())
                        {
                            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§7» §cSquads §7«"))
                            {
                                e.setCancelled(true);

                                Player p = (Player) e.getWhoClicked();
                                p.closeInventory();
                                Chat.getInstance().sendMessage(p, "Connecting...");
                                p.performCommand("play Squads");
                            }
                        }
                    }
                }
            }
        }
    }
    @EventHandler
    public void sb(InventoryClickEvent e)
    {

        if(e.getWhoClicked() != null)
        {
            if(e.getInventory() != null &&  e.getClickedInventory() != null)
            {
                if(e.getCurrentItem() != null)
                {
                    if(e.getCurrentItem().hasItemMeta())
                    {
                        if(e.getCurrentItem().getItemMeta().hasDisplayName())
                        {
                            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§7» §cKits §7«"))
                            {
                                e.setCancelled(true);
                                Player p = (Player) e.getWhoClicked();
                                p.closeInventory();
                                Chat.getInstance().sendMessage(p, "Connecting...");
                                p.performCommand("play Kits");
                            }
                        }
                    }
                }
            }
        }
    }
    @EventHandler
    private void invCheck(PlayerDropItemEvent e) {
        Player p = e.getPlayer();

        e.setCancelled(true);

    }

    @EventHandler
    private void openinv(PlayerInteractEvent e) {
        Player p = (Player) e.getPlayer();

        if (e.getItem() == null || e.getItem().getType() == Material.AIR) return;
        if (e.getItem().getType() == Material.INK_SACK) {
            if (e.getItem().getItemMeta().getDisplayName() == "§7Players: §aVisible") {
                e.setCancelled(true);
                HotBar.hidePlayers(p);
            } else {
                HotBar.showHotbar(p);

                e.setCancelled(true);


            }
            e.setCancelled(true);
        }
    }

    @EventHandler
    private void openinv3(PlayerInteractEvent e) {
        Player p = (Player) e.getPlayer();

        if (e.getItem() == null || e.getItem().getType() == Material.AIR) return;
        if (e.getItem().getType() == Material.COMPASS) {
            e.setCancelled(true);
            ServerSelector.openSelector(p);
        }
    }

    @EventHandler
    private void invCheck(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (e.getWhoClicked() != null && e.getWhoClicked() instanceof Player) {
            if (e.getInventory() != null && e.getClickedInventory() != null) {
                if (e.getCurrentItem() != null) {
                    if (e.getCurrentItem().getType() == Material.INK_SACK) {
                        if (e.getCurrentItem().getItemMeta().getDisplayName() == "§7Players: §aVisible") {
                            e.setCancelled(true);
                            HotBar.hidePlayers(p);
                        } else {
                            HotBar.showHotbar(p);

                            e.setCancelled(true);


                        }

                    }
                }
            }
        }
    }
}

