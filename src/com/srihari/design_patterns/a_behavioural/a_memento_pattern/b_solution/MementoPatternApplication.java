package com.srihari.design_patterns.a_behavioural.a_memento_pattern.b_solution;

/**
 * we use this pattern to implement the undo mechanism
 */
public class MementoPatternApplication {
    public static void main(String[] args) {
        var editor = new CodeEditor();
        var history = new CodeEditorHistory();

        editor.setContent("sample-1");      // new content

        history.push(editor.createState()); // push earlier content to history
        editor.setContent("sample-2");      // new content

        history.push(editor.createState());
        editor.setContent("sample-3");

        editor.restore(history.pop());  // undo
        editor.restore(history.pop());  // undo

        history.push(editor.createState());
        editor.setContent("sample-4");

        editor.restore(history.pop());  // undo

        System.out.println(editor.getContent());    // sample-1
    }
}
