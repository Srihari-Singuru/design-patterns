package com.srihari.design_patterns.a_behavioural.f_command_pattern.d_undoable_command.framework;

public class UndoCommand implements Command {
    private final CommandHistory history;

    public UndoCommand(CommandHistory history) {
        this.history = history;
    }

    @Override
    public void execute() {
        history.pop().unexecute();
    }
}
