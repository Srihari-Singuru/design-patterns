package com.srihari.design_patterns.a_behavioural.c_iterator_pattern.b_solution_1;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {
    private final List<String> urls = new ArrayList<>();    // we don't want callers to know what is the underlying data structure
                                                            // hence removing the getter for this

    public void push(String url){
        urls.add(url);
    }

    public String pop(){
        var lastIndex = urls.size() - 1;
        var lastUrl = urls.get(lastIndex);

        urls.remove(lastUrl);
        return lastUrl;
    }

    // need a new method to return the iterator
    public IBrowserIterator<String> createIterator(){
        return new ListBrowserIterator(this);
    }

    // browserHistory.urls will be vidible here, hence creating as an inner class
    static class ListBrowserIterator implements IBrowserIterator<String> {
        private final BrowserHistory browserHistory;
        private int index;

        public ListBrowserIterator(BrowserHistory browserHistory) {
            this.browserHistory = browserHistory;
        }

        @Override
        public String current() {
            return browserHistory.urls.get(index);
        }

        @Override
        public boolean hasNext() {
            return index < browserHistory.urls.size();
        }

        @Override
        public void next() {
            index++;
        }
    }
}
