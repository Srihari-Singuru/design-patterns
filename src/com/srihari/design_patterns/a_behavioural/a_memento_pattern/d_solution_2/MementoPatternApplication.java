package com.srihari.design_patterns.a_behavioural.a_memento_pattern.d_solution_2;

public class MementoPatternApplication {
    public static void main(String[] args) {
        var document = new Document();
        var history = new DocumentHistory();

        document.setContent("content-1");

        history.push(document.createMemento());
        document.setFontSize(3);

        history.push(document.createMemento());
        document.setFontName("font-2");

        System.out.println(document);

        document.restore(history.pop());        // undo

        System.out.println(document);
    }
}
