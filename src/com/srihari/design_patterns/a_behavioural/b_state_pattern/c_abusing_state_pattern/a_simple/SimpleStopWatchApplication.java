package com.srihari.design_patterns.a_behavioural.b_state_pattern.c_abusing_state_pattern.a_simple;

public class SimpleStopWatchApplication {
    public static void main(String[] args) {
        var stopWatch = new StopWatch();

        stopWatch.click();
        stopWatch.click();
    }
}
