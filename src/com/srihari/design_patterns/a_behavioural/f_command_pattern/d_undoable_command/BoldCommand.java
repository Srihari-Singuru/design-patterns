package com.srihari.design_patterns.a_behavioural.f_command_pattern.d_undoable_command;

import com.srihari.design_patterns.a_behavioural.f_command_pattern.d_undoable_command.framework.CommandHistory;
import com.srihari.design_patterns.a_behavioural.f_command_pattern.d_undoable_command.framework.UndoableCommand;

public class BoldCommand implements UndoableCommand {
    private String prevContent;

    private final HtmlDocument document;
    private final CommandHistory history;

    public BoldCommand(HtmlDocument document, CommandHistory history) {
        this.document = document;
        this.history = history;
    }

    @Override
    public void unexecute() {
        document.setContent(prevContent);
    }

    @Override
    public void execute() {
        prevContent = document.getContent();    // get the current contents and store it in prevContent field
        document.makeBold();                    // perform the actual operation
        history.push(this);     // store the current command in history
    }
}
