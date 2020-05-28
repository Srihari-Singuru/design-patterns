package com.srihari.design_patterns.a_behavioural.g_observer_pattern.f_solution_2;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        observers.forEach(Observer::priceChanged);
    }
}
