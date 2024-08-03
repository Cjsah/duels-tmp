package xyz.jxmm.command.admin;

import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import xyz.jxmm.command.ParentCommand;

public abstract class Admin extends ParentCommand {
    public static Admin instance;
    public Admin(String name) {
        super(name);
        instance = this;
        addSubCommand(new GetXYZ("getXYZ","duels.admin"));

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
