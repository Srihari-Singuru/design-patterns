package com.srihari.design_patterns.a_behavioural.b_state_pattern.b_solution_1;

public class EraserTool implements ITool {
    @Override
    public void mouseUp() {
        System.out.println("Eraser icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("Erase something");
    }
}
