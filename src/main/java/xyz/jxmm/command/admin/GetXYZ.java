package xyz.jxmm.command.admin;

import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import xyz.jxmm.Duels;
import xyz.jxmm.command.ParentCommand;
import xyz.jxmm.command.SubCommand;

import java.util.ArrayList;
import java.util.List;

public class GetXYZ extends SubCommand {

    public GetXYZ(String name, String permission){
        super(name, permission);
    }
    @Override
    public void execute(CommandSender s, String[] args) {
        if (s instanceof ConsoleCommandSender){
            Duels.getPlugin().getLogger().info(Color.RED + "This command is for player");
        }

        Player player = (Player) s;
        s.sendMessage(String.valueOf(player.getAddress()));


    }


}
