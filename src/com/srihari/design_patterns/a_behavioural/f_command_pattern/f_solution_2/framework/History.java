package com.srihari.design_patterns.a_behavioural.f_command_pattern.f_solution_2.framework;

import java.util.Stack;

public class History {
    Stack<UndoableCommand> commands = new Stack<>();

    public void push(UndoableCommand undoableCommand){
        commands.push(undoableCommand);
    }

    public UndoableCommand pop(){
        return commands.pop();
    }
}
