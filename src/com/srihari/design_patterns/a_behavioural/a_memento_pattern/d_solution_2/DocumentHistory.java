package com.srihari.design_patterns.a_behavioural.a_memento_pattern.d_solution_2;

import java.util.Stack;

public class DocumentHistory {
    Stack<DocumentMemento> documents = new Stack<>();

    public void push(DocumentMemento memento) {
        documents.push(memento);
    }

    public DocumentMemento pop() {
        return documents.pop();
    }
}
