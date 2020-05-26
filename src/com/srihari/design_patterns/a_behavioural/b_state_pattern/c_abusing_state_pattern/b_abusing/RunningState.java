package com.srihari.design_patterns.a_behavioural.b_state_pattern.c_abusing_state_pattern.b_abusing;

public class RunningState implements IState {
    private final StopWatch stopWatch;

    public RunningState(StopWatch stopWatch) {
        this.stopWatch = stopWatch;
    }

    @Override
    public void click() {
        stopWatch.setCurrentState(new StoppedState(stopWatch));
        System.out.println("Stopped");
    }
}
