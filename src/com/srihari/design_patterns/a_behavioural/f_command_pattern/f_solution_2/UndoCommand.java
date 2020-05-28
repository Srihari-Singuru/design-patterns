package com.srihari.design_patterns.a_behavioural.f_command_pattern.f_solution_2;

import com.srihari.design_patterns.a_behavioural.f_command_pattern.f_solution_2.framework.Command;
import com.srihari.design_patterns.a_behavioural.f_command_pattern.f_solution_2.framework.History;

public class UndoCommand implements Command {
    private final History history;

    public UndoCommand(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        history.pop().unexecute();
    }
}
