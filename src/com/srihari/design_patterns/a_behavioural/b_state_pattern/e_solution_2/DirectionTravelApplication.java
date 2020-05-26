package com.srihari.design_patterns.a_behavioural.b_state_pattern.e_solution_2;

public class DirectionTravelApplication {
    public static void main(String[] args) {
        // can pass any object implements ITravelMode
        var directionService = new DirectionService(new Walking());

        directionService.getEta();
        directionService.getDirection();
    }
}
