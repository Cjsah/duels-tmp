package xyz.jxmm;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandMap;
import org.bukkit.plugin.java.JavaPlugin;

public final class duels extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("test").setExecutor(new Command());

        this.getLogger().info(ChatColor.AQUA + "成功加载");
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
