package com.srihari.design_patterns.a_behavioural.g_observer_pattern.c_push_style;

public class SpreadSheet implements Observer {
    @Override
    public void update(int value) {
        System.out.println("SpreadSheet notified: "+value);
    }
}
