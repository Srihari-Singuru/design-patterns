package com.srihari.design_patterns.a_behavioural.e_template_method_pattern.d_solution_2;

public class BrowserWindow extends Window {
    @Override
    protected void onClosing() {
        System.out.println("Browser wndow on closing");
    }

    @Override
    protected void onClosed() {
        System.out.println("Browser window on closed");
    }
}
