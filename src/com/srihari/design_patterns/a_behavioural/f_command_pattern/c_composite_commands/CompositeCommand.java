package com.srihari.design_patterns.a_behavioural.f_command_pattern.c_composite_commands;

import com.srihari.design_patterns.a_behavioural.f_command_pattern.c_composite_commands.framework.ICommand;

import java.util.LinkedList;
import java.util.List;

/**
 * this class comprises of multiple commands,
 * so that we can replay them
 */
public class CompositeCommand implements ICommand {
    List<ICommand> commands = new LinkedList<>();

    public void add(ICommand command){
        commands.add(command);
    }

    @Override
    public void execute() {
        commands.forEach(ICommand::execute);    // executing all the commands
    }
}
