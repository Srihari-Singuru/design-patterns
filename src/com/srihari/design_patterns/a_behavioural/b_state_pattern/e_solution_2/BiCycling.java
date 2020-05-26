package com.srihari.design_patterns.a_behavioural.b_state_pattern.e_solution_2;

public class BiCycling implements ITravelMode {
    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (bicycling)");
        return 2;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (bicycling)");
        return 2;
    }
}
