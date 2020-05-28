package com.srihari.design_patterns.a_behavioural.f_command_pattern.f_solution_2;

import com.srihari.design_patterns.a_behavioural.f_command_pattern.f_solution_2.framework.History;

public class SetTextCommand extends AbstractUndoableCommand {
    private final String text;

    public SetTextCommand(String text, VideoEditor videoEditor, History history) {
        super(videoEditor, history);
        this.text = text;
    }

    @Override
    public void unexecute() {
        videoEditor.removeText();
    }

    @Override
    protected void doExecute() {
        videoEditor.setText(text);
    }
}
