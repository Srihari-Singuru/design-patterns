package com.srihari.design_patterns.a_behavioural.g_observer_pattern.d_pull_style;

public class ObserverApplication {
    public static void main(String[] args) {
        var dataStore = new DataStore();
        var spreadSheet = new SpreadSheet(dataStore);
        var chart = new Chart(dataStore);

        dataStore.addObserver(spreadSheet);
        dataStore.addObserver(chart);

        dataStore.setValue(20); // after setting, all the observers will be notified
    }
}
