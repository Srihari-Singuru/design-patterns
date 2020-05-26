package com.srihari.design_patterns.a_behavioural.b_state_pattern.e_solution_2;

public class Walking implements ITravelMode {
    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (walking)");
        return 4;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (walking)");
        return 4;
    }
}
