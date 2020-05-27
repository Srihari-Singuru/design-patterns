package com.srihari.design_patterns.a_behavioural.f_command_pattern.d_undoable_command;

import com.srihari.design_patterns.a_behavioural.f_command_pattern.d_undoable_command.framework.CommandHistory;
import com.srihari.design_patterns.a_behavioural.f_command_pattern.d_undoable_command.framework.UndoCommand;

/**
 * This is same like Memento pattern
 * but, memento stores the whole snapshot of the object in history
 * Undoable Command pattern doesn't store the entire snapshot
 */
public class HtmlEditorApplication {
    public static void main(String[] args) {
        var history = new CommandHistory();
        var document = new HtmlDocument();
        document.setContent("Hello Srihari");

        var boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());
    }
}
