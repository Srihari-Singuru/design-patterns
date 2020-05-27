package com.srihari.design_patterns.a_behavioural.f_command_pattern.b_solution_1.framework;

/**
 * Assume we are creating a framework and this class is part of it
 */
public class Button {
    private String label;
    private final ICommand command;

    public Button(ICommand command) {
        this.command = command;
    }

    public void click(){
        command.execute();  // delegating the responsibility to implementor
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
