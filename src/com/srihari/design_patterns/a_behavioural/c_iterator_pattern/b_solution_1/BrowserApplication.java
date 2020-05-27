package com.srihari.design_patterns.a_behavioural.c_iterator_pattern.b_solution_1;

public class BrowserApplication {
    public static void main(String[] args) {
        var history = new BrowserHistory();

        history.push("url-1");
        history.push("url-2");
        history.push("url-3");

        // here we do not know anything about interbal data structures of BrowseHistory object
        IBrowserIterator<String> iterator = history.createIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
