package com.srihari.design_patterns.a_behavioural.e_template_method_pattern.d_solution_2;

public class ChatWindow extends Window {
    @Override
    protected void onClosing() {
        System.out.println("Chat window on closing");
    }

    @Override
    protected void onClosed() {
        System.out.println("Chat window on closed");
    }
}
