package com.srihari.design_patterns.a_behavioural.a_memento_pattern.b_solution_1;

import java.util.Stack;

public class CodeEditorHistory {
    private final Stack<CodeEditorState> states = new Stack<>();

    public void push(CodeEditorState editorState) {
        states.push(editorState);
    }

    public CodeEditorState pop() {
        return states.pop();
    }
}
