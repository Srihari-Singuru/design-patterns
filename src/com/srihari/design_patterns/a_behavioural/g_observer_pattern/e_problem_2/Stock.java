package com.srihari.design_patterns.a_behavioural.g_observer_pattern.e_problem_2;

public class Stock {
    private final String symbol;
    private final float price;

    public Stock(String symbol, float price) {
        this.symbol = symbol;
        this.price = price;
    }

    public String getSymbol() {
        return symbol;
    }

    public float getPrice() {
        return price;
    }
}
