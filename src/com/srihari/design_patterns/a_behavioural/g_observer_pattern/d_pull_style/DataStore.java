package com.srihari.design_patterns.a_behavioural.g_observer_pattern.d_pull_style;

public class DataStore extends Subject {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers(value);
    }
}
