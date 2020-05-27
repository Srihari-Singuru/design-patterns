package com.srihari.design_patterns.a_behavioural.e_template_method_pattern.c_problem_2;

public class Window {
    public void close() {
        //TODO: custom windows may need to execute some code before the window
        // is closed.

        System.out.println("Removing the window from the screen");

        //TODO: custom windows may need to execute some code after the window
        // is closed.
    }
}
