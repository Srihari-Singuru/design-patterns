package com.srihari.design_patterns.a_behavioural.f_command_pattern.d_undoable_command;

public class HtmlDocument {
    private String content;

    public void makeBold(){
        content = "<b>" +content+ "</b>";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
