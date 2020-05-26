package com.srihari.design_patterns.a_behavioural.a_memento_pattern.d_solution_2;

public class DocumentMemento {
    private final String content;
    private final String fontName;
    private final int fontSize;

    public DocumentMemento(String content, String fontName, int fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    public String getContent() {
        return content;
    }

    public String getFontName() {
        return fontName;
    }

    public int getFontSize() {
        return fontSize;
    }
}
