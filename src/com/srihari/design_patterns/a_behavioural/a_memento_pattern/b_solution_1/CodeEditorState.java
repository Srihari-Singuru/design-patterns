package com.srihari.design_patterns.a_behavioural.a_memento_pattern.b_solution_1;

public class CodeEditorState {
    private final String content;

    public CodeEditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
