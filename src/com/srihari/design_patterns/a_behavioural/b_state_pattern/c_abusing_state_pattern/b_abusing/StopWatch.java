package com.srihari.design_patterns.a_behavioural.b_state_pattern.c_abusing_state_pattern.b_abusing;

public class StopWatch {
    private IState currentState = new StoppedState(this);

    public void click(){
        currentState.click();
    }

    public IState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(IState currentState) {
        this.currentState = currentState;
    }
}
