package com.srihari.design_patterns.a_behavioural.a_memento_pattern.a_problem_1;

/**
 * we use this pattern to implement the undo mechanism
 */
public class MementoPatternApplication {
    public static void main(String[] args) {
        var editor = new CodeEditor();

        editor.setContent("sample-1");
        editor.setContent("sample-2");
        editor.setContent("sample-3");

        //editor.undo();      // Implement this undo feature
    }
}
