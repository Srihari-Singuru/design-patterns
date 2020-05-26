package com.srihari.design_patterns.a_behavioural.b_state_pattern.e_solution_2;

public class Driving implements ITravelMode {
    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (driving)");
        return 1;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (driving)");
        return 1;
    }
}
