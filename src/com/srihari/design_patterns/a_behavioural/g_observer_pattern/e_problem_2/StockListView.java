package com.srihari.design_patterns.a_behavioural.g_observer_pattern.e_problem_2;

import java.util.ArrayList;
import java.util.List;

public class StockListView {
    List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock){
        stocks.add(stock);
    }

    public void show(){
        stocks.forEach(System.out::println);
    }
}
