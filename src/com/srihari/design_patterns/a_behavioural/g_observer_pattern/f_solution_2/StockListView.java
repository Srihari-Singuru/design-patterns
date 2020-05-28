package com.srihari.design_patterns.a_behavioural.g_observer_pattern.f_solution_2;

import java.util.ArrayList;
import java.util.List;

public class StockListView implements Observer {
    List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock){
        stocks.add(stock);
        stock.addObserver(this);
    }

    public void show(){
        stocks.forEach(System.out::println);
    }

    @Override
    public void priceChanged() {
        System.out.println("StockListView: Price changed, refreshing ...");
        show();
    }
}
