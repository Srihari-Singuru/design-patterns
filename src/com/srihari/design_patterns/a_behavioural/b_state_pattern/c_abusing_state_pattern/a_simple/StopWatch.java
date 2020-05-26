package com.srihari.design_patterns.a_behavioural.b_state_pattern.c_abusing_state_pattern.a_simple;

/**
 * StopWatch will have only two states Running and Stopped
 * So, we do not really need state pattern here
 */
public class StopWatch {
    private boolean isRunning;

    public void click(){
        if(isRunning){
            isRunning = false;
            System.out.println("Stopped");
        } else{
            isRunning = true;
            System.out.println("Running");
        }
    }
}
