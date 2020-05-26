package com.srihari.design_patterns.a_behavioural.b_state_pattern.a_problem_1;

/**
 * Assume, we have a notepad with canvas (like pallet)
 * if user selects eraser, icon should change to eraser, and when user drags the mouse, then content should be erased
 *
 * In real application, the chances are, there will be more such pallet icons and even keyboard actions exists
 * then we need to repeat all this decision making inside every method (mouseUp, keyUp, mouseDown etc)
 *
 * This below code is not maintainable, not easily extensible
 *
 */
public class Canvas {
    private ToolType currentToolType;

    public void mouseUp(){
        if(currentToolType == ToolType.SELECTION)
            System.out.println("Selection icon");
        else if(currentToolType == ToolType.BRUSH)
            System.out.println("Brush icon");
        if(currentToolType == ToolType.ERASER)
            System.out.println("Eraser icon");
    }

    public void mouseDown(){
        if(currentToolType == ToolType.SELECTION)
            System.out.println("Draw dashed rectangle");
        else if(currentToolType == ToolType.BRUSH)
            System.out.println("Draw a line");
        if(currentToolType == ToolType.ERASER)
            System.out.println("Erase something");
    }

    public ToolType getCurrentToolType() {
        return currentToolType;
    }

    public void setCurrentToolType(ToolType currentToolType) {
        this.currentToolType = currentToolType;
    }
}
