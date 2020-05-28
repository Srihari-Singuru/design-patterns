package com.srihari.design_patterns.a_behavioural.g_observer_pattern.b_solution_1;

public class SpreadSheet implements Observer {
    @Override
    public void update() {
        System.out.println("SpreadSheet notified");
    }
}
