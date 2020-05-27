package com.srihari.design_patterns.a_behavioural.d_strategy_pattern.b_solution_1;

public class BlackWhiteFilter implements IFilter {
    @Override
    public void filter(String fileName) {
        System.out.println("Applying B&W filter");
    }
}
