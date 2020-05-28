package com.srihari.design_patterns.a_behavioural.g_observer_pattern.d_pull_style;

import java.util.ArrayList;
import java.util.List;

// It is Observable
public class Subject {
    List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void deleteObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(int value){
        observers.forEach(observer -> observer.update(value));
    }
}
