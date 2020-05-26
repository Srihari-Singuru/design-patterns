package com.srihari.design_patterns.a_behavioural.b_state_pattern.b_solution_1;

public class SelectionTool implements ITool {
    @Override
    public void mouseUp() {
        System.out.println("Selection icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("Draw dashed rectangle");
    }
}
