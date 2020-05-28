package com.srihari.design_patterns.a_behavioural.g_observer_pattern.b_solution_1;

public class Chart implements Observer {
    @Override
    public void update() {
        System.out.println("Chart updated");
    }
}
