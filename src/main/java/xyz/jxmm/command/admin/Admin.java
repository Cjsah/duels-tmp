package xyz.jxmm.command.admin;

import org.bukkit.command.CommandSender;
import xyz.jxmm.command.Command;

public class Admin extends Command {
    public Admin(String name) {
        super(name);
        addCommand(new GetName("name"));
    }

    @Override
    public void sendDefaultMessage(CommandSender s) {

    }

    @Override
    public void execute(CommandSender s, String[] args) {

    }
}
