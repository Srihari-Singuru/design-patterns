package com.srihari.design_patterns.a_behavioural.g_observer_pattern.c_push_style;

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
