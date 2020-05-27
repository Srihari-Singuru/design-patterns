package com.srihari.design_patterns.a_behavioural.e_template_method_pattern.d_solution_2;

public abstract class Window {
    public void close() {
        onClosing();

        System.out.println("Removing the window from the screen");

        onClosed();
    }

    protected abstract void onClosing();

    protected abstract void onClosed();
}
