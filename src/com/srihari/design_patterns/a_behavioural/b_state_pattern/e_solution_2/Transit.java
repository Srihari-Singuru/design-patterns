package com.srihari.design_patterns.a_behavioural.b_state_pattern.e_solution_2;

public class Transit implements ITravelMode {
    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (transit)");
        return 3;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (transit)");
        return 3;
    }
}
