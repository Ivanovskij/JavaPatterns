package org.ivanovskiy.patterns.behavioral.command;

import java.util.List;

/**
 * Created by Ivanovskij Oleg on 16.07.2018
 */
public class MacrosInvoker implements Command {

    private List<Command> commands;

    public MacrosInvoker(List<Command> commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        commands.forEach(Command::execute);
    }

    @Override
    public void undo() {
        commands.forEach(Command::undo);
    }
}
