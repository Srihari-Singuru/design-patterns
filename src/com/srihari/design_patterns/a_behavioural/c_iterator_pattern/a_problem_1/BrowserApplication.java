package com.srihari.design_patterns.a_behavioural.c_iterator_pattern.a_problem_1;

public class BrowserApplication {
    public static void main(String[] args) {
        var history = new BrowserHistory();

        history.push("url-1");
        history.push("url-2");
        history.push("url-3");

        // Now we want to iterate over the urls
        // ofcourse we can use history.getUrls() to iterate
        for (int i = 0; i < history.getUrls().size(); i++) {
            var url = history.getUrls().get(i);     // what happens if underlying datastructure changes from List to Array
                                                    // then, this loop will not work, hence we need a iterator pattern
            System.out.println(url);
        }
    }
}
