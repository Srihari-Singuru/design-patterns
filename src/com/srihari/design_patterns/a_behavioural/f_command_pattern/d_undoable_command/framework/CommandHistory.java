package com.srihari.design_patterns.a_behavioural.f_command_pattern.d_undoable_command.framework;

import java.util.Stack;

public class CommandHistory {
    Stack<UndoableCommand> commands = new Stack<>();

    public void push(UndoableCommand undoableCommand){
        commands.push(undoableCommand);
    }

    public UndoableCommand pop(){
        return commands.pop();
    }
}
