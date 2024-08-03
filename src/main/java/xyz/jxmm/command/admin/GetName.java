package xyz.jxmm.command.admin;

import org.bukkit.Color;
import org.bukkit.command.CommandSender;
import xyz.jxmm.command.Command;

import java.util.ArrayList;
import java.util.List;

public class GetName extends Command {
    private List<Command> commands = new ArrayList<>();
    protected GetName(String name) {
        super(name);
    }

    @Override
    public void sendDefaultMessage(CommandSender s) {

    }

    @Override
    public void execute(CommandSender s, String[] args) {
        s.sendMessage(Color.AQUA + "Your name is" + Color.RED + s.getName());
    }
}
