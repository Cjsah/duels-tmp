package xyz.jxmm.duels;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;

import xyz.jxmm.duels.command.ParentCommand;


import java.io.File;
import java.sql.Timestamp;
import java.util.LinkedList;
import java.util.UUID;

public interface duels {
    IStats getStatsUtil();

    interface IStats {


        /**
         * This will give the lobby items to the player.
         * Not used in serverType BUNGEE.
         * This will clear the inventory first.
         */
        void sendLobbyCommandItems(Player p);
    }
    /**
     * Get bedWars main command
     */
    ParentCommand getBedWarsCommand();




}

