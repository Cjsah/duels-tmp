package xyz.jxmm.command.admin;

import org.bukkit.command.CommandSender;
import xyz.jxmm.command.Command;

import java.util.ArrayList;
import java.util.List;

public class Admin extends Command {
    private List<Command> commands = new ArrayList<>();
    public Admin(String name) {
        super(name);
        addCommand(new GetName("name"));
    }

    public void addCommand(Command command){
        commands.add(command);
    }

    @Override
    public void sendDefaultMessage(CommandSender s) {

    }

    @Override
    public void execute(CommandSender s, String[] args) {

    }
}
