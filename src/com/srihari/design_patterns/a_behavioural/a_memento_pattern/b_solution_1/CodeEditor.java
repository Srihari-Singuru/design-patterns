package com.srihari.design_patterns.a_behavioural.a_memento_pattern.b_solution_1;

public class CodeEditor {
    private String content;

    public CodeEditorState createState(){
        return new CodeEditorState(content);
    }

    public void restore(CodeEditorState editorState){
        content = editorState.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
