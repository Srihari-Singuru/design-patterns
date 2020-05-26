package com.srihari.design_patterns.a_behavioural.b_state_pattern.b_solution_1;

public class Canvas {
    private ITool currentTool;

    public void mouseUp(){
        currentTool.mouseUp();
    }

    public void mouseDown(){
        currentTool.mouseDown();
    }

    public ITool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(ITool currentTool) {
        this.currentTool = currentTool;
    }
}
