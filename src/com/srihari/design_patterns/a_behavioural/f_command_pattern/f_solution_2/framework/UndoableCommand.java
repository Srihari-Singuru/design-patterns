package com.srihari.design_patterns.a_behavioural.f_command_pattern.f_solution_2.framework;

public interface UndoableCommand extends Command {
    void unexecute();
}
