package com.srihari.design_patterns.a_behavioural.c_iterator_pattern.a_problem_1;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {
    private final List<String> urls = new ArrayList<>();

    public void push(String url){
        urls.add(url);
    }

    public String pop(){
        var lastIndex = urls.size() - 1;
        var lastUrl = urls.get(lastIndex);

        urls.remove(lastUrl);
        return lastUrl;
    }

    public List<String> getUrls() {
        return urls;
    }
}
