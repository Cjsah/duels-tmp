package xyz.jxmm.command;

import net.md_5.bungee.api.ChatMessageType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import xyz.jxmm.Duels;
import xyz.jxmm.command.admin.Admin;

import java.util.Arrays;

public class MainCommand extends ParentCommand {
    public static MainCommand instance;
    public MainCommand(String name){
        super(name);
        instance = this;
        addSubCommand(new Admin("admin","duels.admin"));

    }

    @Override
    public void sendDefaultMessage(CommandSender s) {
        if (s instanceof ConsoleCommandSender) return;
        Player p = (Player) s;

        s.sendMessage(" ");
        s.sendMessage("§8§l|-" + " §6" + Duels.getPlugin().getDescription().getName() + " v" + Duels.getPlugin().getDescription().getVersion() + " §7- §cCommands");
        s.sendMessage(" ");
        if (hasSubCommand("admin")) {
            p.sendMessage("admin");
        }

    }


}
