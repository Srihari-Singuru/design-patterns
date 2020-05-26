package com.srihari.design_patterns.a_behavioural.b_state_pattern.b_solution_1;

public class BrushTool implements ITool {
    @Override
    public void mouseUp() {
        System.out.println("Brush icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("Draw a line");
    }
}
