package com.srihari.design_patterns.a_behavioural.g_observer_pattern.f_solution_2;

public class Stock extends Subject {
    private final String symbol;
    private float price;

    public Stock(String symbol, float price) {
        this.symbol = symbol;
        this.price = price;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setPrice(float price){
        this.price = price;
        notifyObservers();
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "symbol='" + symbol + '\'' +
                ", price=" + price +
                '}';
    }
}
