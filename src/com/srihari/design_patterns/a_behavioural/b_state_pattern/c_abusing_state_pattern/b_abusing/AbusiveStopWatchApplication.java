package com.srihari.design_patterns.a_behavioural.b_state_pattern.c_abusing_state_pattern.b_abusing;

/**
 * Extremely complicated
 * we could have had simple if else condition in StopWatch class
 *
 * when there are huge decision making points and heavily spread across multiple methods, then we may need state pattern
 */
public class AbusiveStopWatchApplication {
    public static void main(String[] args) {
        var stopWatch = new StopWatch();

        stopWatch.click();
        stopWatch.click();
    }
}
