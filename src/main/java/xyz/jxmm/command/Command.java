package xyz.jxmm.command;

import org.bukkit.Color;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import xyz.jxmm.Duels;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Command extends org.bukkit.command.Command {
    private List<Command> commands = new ArrayList<>();

    protected Command(String name) {
        super(name);
    }

    @Override
    public boolean execute(CommandSender sender, String commandLabel, String[] args) {
        if (args.length == 0){
            sendDefaultMessage(sender);
            return true;
        }

        if (sender instanceof ConsoleCommandSender){
            sender.sendMessage("This cmd is for player");
            return true;
        }

        //check for sub-commands
        for (Command sc : getSubCommands()) {
            if (sc.getName().equalsIgnoreCase(args[0])) {
                sc.execute(sender, Arrays.copyOfRange(args, 1, args.length));
                Duels.getPlugin().getLogger().info(Color.RED + "IN");
                return true;
            }
        }

        //send default message if not sub-command was found
        sendDefaultMessage(sender);
        return true;

    }

    public List<Command> getSubCommands() {
        return commands;
    }

    public abstract void sendDefaultMessage(CommandSender s);

    public abstract void execute(CommandSender s, String[] args);

    public void addCommand(Command command){
        commands.add(command);
    }
}
