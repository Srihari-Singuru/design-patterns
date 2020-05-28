package com.srihari.design_patterns.a_behavioural.g_observer_pattern.c_push_style;

public class ObserverApplication {
    public static void main(String[] args) {
        var dataStore = new DataStore();
        var spreadSheet = new SpreadSheet();
        var chart = new Chart();

        dataStore.addObserver(spreadSheet);
        dataStore.addObserver(chart);

        dataStore.setValue(20); // after setting, all the observers will be notified
    }
}
