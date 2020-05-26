package com.srihari.design_patterns.a_behavioural.b_state_pattern.c_abusing_state_pattern.b_abusing;

public class StoppedState implements IState {
    private final StopWatch stopWatch;

    public StoppedState(StopWatch stopWatch) {
        this.stopWatch = stopWatch;
    }

    @Override
    public void click() {
        stopWatch.setCurrentState(new RunningState(stopWatch));
        System.out.println("Running");
    }
}
