package com.yeetdev.ezQueueHub.listeners;

import com.yeetdev.ezQueueHub.utils.Chat;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Event.Result;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.block.LeavesDecayEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class Blocks implements Listener
{



    @EventHandler
    public void onBreak(BlockBreakEvent e) {
        Player p = e.getPlayer();
        if (!(p.hasPermission("yourserver.bypass"))) {
            e.setCancelled(true);
        } else {
            Chat.getInstance().sendMessage(p, "Please edit the hub on the build server if this is more than a 1 block fix.");
        }
    }

    @EventHandler
    public void onBB3(LeavesDecayEvent e)
    {
        e.setCancelled(true);
    }

    @EventHandler
    public void onPlace(BlockPlaceEvent e) {
        Player p = e.getPlayer();
        if (!(p.hasPermission("yourserver.bypass"))) {
            e.setCancelled(true);
        } else {
            Chat.getInstance().sendMessage(p, "Please edit the hub on the build server if this is more than a 1 block fix.");
        }
    }

    @EventHandler
    public void door(PlayerInteractEvent e)
    {
        Block b = e.getClickedBlock();
        Player p = e.getPlayer();

        if(!p.isOp())
        {
            if(b != null)
            {
                if(b.getType() == Material.WOOD_DOOR
                        || (b.getType() == Material.WOODEN_DOOR)
                        || (b.getType() == Material.SPRUCE_DOOR)
                        || (b.getType() == Material.BIRCH_DOOR)
                        || (b.getType() == Material.DARK_OAK_DOOR)
                        || (b.getType() == Material.JUNGLE_DOOR)
                        || (b.getType() == Material.ACACIA_DOOR))
                {
                    e.setCancelled(true);
                    e.setUseInteractedBlock(Result.DENY);

                }
            }
        }
    }

    @EventHandler
    public void plate(PlayerInteractEvent e)
    {
        Block b = e.getClickedBlock();
        Player p = e.getPlayer();

        if(!p.isOp())
        {
            if(b != null)
            {
                if(b.getType() == Material.WOOD_PLATE
                        || (b.getType() == Material.GOLD_PLATE)
                        || (b.getType() == Material.IRON_PLATE))
                {
                    e.setCancelled(true);
                    e.setUseInteractedBlock(Result.DENY);

                }
            }
        }
    }

    @EventHandler
    public void button(PlayerInteractEvent e)
    {
        Block b = e.getClickedBlock();
        Player p = e.getPlayer();

        if(!p.isOp())
        {
            if(b != null)
            {
                if(b.getType() == Material.STONE_BUTTON
                        || (b.getType() == Material.WOOD_BUTTON ))
                {
                    e.setCancelled(true);
                    e.setUseInteractedBlock(Result.DENY);

                }
            }
        }
    }

    @EventHandler
    public void trapdoor(PlayerInteractEvent e)
    {
        Block b = e.getClickedBlock();
        Player p = e.getPlayer();

        if(!p.isOp())
        {
            if(b != null)
            {
                if(b.getType() == Material.TRAP_DOOR)
                {
                    e.setCancelled(true);
                    e.setUseInteractedBlock(Result.DENY);

                }
            }
        }
    }

}