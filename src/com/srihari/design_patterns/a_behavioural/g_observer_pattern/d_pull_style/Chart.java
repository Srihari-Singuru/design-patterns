package com.srihari.design_patterns.a_behavioural.g_observer_pattern.d_pull_style;

public class Chart implements Observer {
    private final DataStore dataStore;

    public Chart(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    @Override
    public void update(int value) {
        System.out.println("Chart updated: "+dataStore.getValue());
    }
}
