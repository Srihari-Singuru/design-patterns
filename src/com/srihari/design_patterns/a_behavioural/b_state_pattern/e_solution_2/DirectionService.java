package com.srihari.design_patterns.a_behavioural.b_state_pattern.e_solution_2;

public class DirectionService {
    private final ITravelMode travelMode;

    public DirectionService(ITravelMode travelMode) {
        this.travelMode = travelMode;
    }

    public Object getEta(){
        return travelMode.getEta();
    }

    public Object getDirection(){
        return travelMode.getDirection();
    }

    public ITravelMode getTravelMode() {
        return travelMode;
    }
}
