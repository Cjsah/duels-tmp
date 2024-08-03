package xyz.jxmm.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import xyz.jxmm.Duels;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class ParentCommand extends Command {

    private List<SubCommand> subCommands = new ArrayList<>();
    protected ParentCommand(String name) {
        super(name);
    }

    @Override
    public boolean execute(CommandSender sender, String commandLabel, String[] args) {
        if (args.length == 0){
            sendDefaultMessage(sender);
            return true;
        }

        //check for sub-commands
        for (SubCommand sc : getSubCommands()) {
            if (sc.getName().equalsIgnoreCase(args[0])) {
                Duels.getPlugin().getLogger().info(getSubCommands().toString());
                sc.execute(sender, Arrays.copyOfRange(args, 1, args.length));
                return true;
            }
        }

        //send default message if not sub-command was found
        sendDefaultMessage(sender);
        return true;

    }

    public abstract void sendDefaultMessage(CommandSender s);

    public void addSubCommand(SubCommand subCommand) {
        subCommands.add(subCommand);
    }

    public boolean hasSubCommand(String name) {
        for (SubCommand sc : getSubCommands()) {
            if (sc.getName().equalsIgnoreCase(name)) return true;
        }
        return false;
    }

    public SubCommand getSubCommand(String name) {
        for (SubCommand sc : getSubCommands()) {
            if (sc.getName().equalsIgnoreCase(name)) return sc;
        }
        return null;
    }

    public List<SubCommand> getSubCommands() {
        return subCommands;
    }

    public abstract void execute(CommandSender s, String[] args);
}
