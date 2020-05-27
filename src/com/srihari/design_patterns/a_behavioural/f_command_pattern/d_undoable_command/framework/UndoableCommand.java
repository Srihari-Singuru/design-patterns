package com.srihari.design_patterns.a_behavioural.f_command_pattern.d_undoable_command.framework;

public interface UndoableCommand extends Command {
    void unexecute();
}
