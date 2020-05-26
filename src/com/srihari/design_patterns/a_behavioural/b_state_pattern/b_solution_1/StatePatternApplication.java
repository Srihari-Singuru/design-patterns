package com.srihari.design_patterns.a_behavioural.b_state_pattern.b_solution_1;

public class StatePatternApplication {
    public static void main(String[] args) {
        var canvas = new Canvas();

        canvas.setCurrentTool(new SelectionTool()); // if new class gets defined, we can use that as well
                                                    // This is like Open Closed Principle
        canvas.mouseUp();
        canvas.mouseDown();
    }
}
