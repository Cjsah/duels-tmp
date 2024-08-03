package xyz.jxmm.command;

import org.bukkit.command.CommandSender;

public abstract class SubCommand {
    private String name;

    private String permission;

    public SubCommand(String name, String permission) {
        this.name = name;
        this.permission = permission;
    }

    public abstract void execute(CommandSender s, String[] args);

    public String getName() {
        return name;
    }
}
