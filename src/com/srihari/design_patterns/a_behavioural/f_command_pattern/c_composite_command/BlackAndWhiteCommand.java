package com.srihari.design_patterns.a_behavioural.f_command_pattern.c_composite_command;

import com.srihari.design_patterns.a_behavioural.f_command_pattern.c_composite_command.framework.ICommand;

public class BlackAndWhiteCommand implements ICommand {
    @Override
    public void execute() {
        System.out.println("Black and White command");
    }
}
