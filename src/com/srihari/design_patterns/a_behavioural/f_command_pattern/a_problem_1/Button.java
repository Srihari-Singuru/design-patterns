package com.srihari.design_patterns.a_behavioural.f_command_pattern.a_problem_1;

/**
 * Command pattern solves the below problem
 */
public class Button {
    private String label;

    // assume this as a framework
    public void click(){
        // ...      // We do not really know what needs to be implemented here
                    // if this click is on 'Submit' button, then we need to submit some data
                    // if this click is on 'Delete' button, then we need to delete some data
                    // etc etc
                    // ath the time of designing this class, we are not sure of this methods functionality
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
