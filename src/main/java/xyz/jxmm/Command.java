package xyz.jxmm;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {
        if (label.equalsIgnoreCase(command.getName())){
            if (sender instanceof Player){
                sender.sendMessage("true");
            } else {
                sender.sendMessage("false");
            }
        }
        return false;
    }
}
