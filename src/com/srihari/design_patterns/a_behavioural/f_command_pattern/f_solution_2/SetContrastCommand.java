package com.srihari.design_patterns.a_behavioural.f_command_pattern.f_solution_2;

import com.srihari.design_patterns.a_behavioural.f_command_pattern.f_solution_2.framework.History;

public class SetContrastCommand extends AbstractUndoableCommand {
    private final float prevContrast;
    private final float contrast;

    public SetContrastCommand(float contrast, VideoEditor videoEditor, History history) {
        super(videoEditor, history);

        prevContrast = videoEditor.getContrast();
        this.contrast = contrast;
    }

    @Override
    protected void doExecute() {
        videoEditor.setContrast(contrast);
    }

    @Override
    public void unexecute() {
        videoEditor.setContrast(prevContrast);
    }
}
