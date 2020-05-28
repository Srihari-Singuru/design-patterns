package com.srihari.design_patterns.a_behavioural.g_observer_pattern.f_solution_2;

public class ObserverApplication {
    public static void main(String[] args) {
        var statusBar = new StatusBar();
        var stockListView = new StockListView();

        var stock1 = new Stock("S1", 110f);
        var stock2 = new Stock("S2", 120f);
        var stock3 = new Stock("S3", 130f);

        // In Status bar, we only want to display important stocks
        statusBar.addStock(stock1);
        statusBar.addStock(stock2);

        // In Stock list view, we want to display all the stocks
        stockListView.addStock(stock1);
        stockListView.addStock(stock2);
        stockListView.addStock(stock3);

        stock1.setPrice(111f);  // both 'StatusBar' and 'StockListView' will be notified
        stock3.setPrice(132f);  // only 'StockListView' will be notified
    }
}
