package xyz.jxmm.command.admin;

import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import xyz.jxmm.command.SubCommand;

public class Admin extends SubCommand {
    public static Admin instance;
    public Admin(String name, String permission) {
        super(name, permission);
        instance = this;

    }
    @Override
    public void execute(CommandSender s, String[] args) {
        if (s instanceof ConsoleCommandSender){
            s.sendMessage("This command is for players!");
            return;
        };
        Player p = (Player) s;

        String group = "default";

        if (args.length == 1) {
            group = args[0];
        }
    }
}
