package com.srihari.design_patterns.a_behavioural.e_template_method_pattern.b_solution_1;

/**
 * we can only concentrate on specific task execution
 * and Task abstract class will take care of audit trail and other common functionalities
 */
public class TransferMoneyTask extends Task {
    @Override
    public void doExecute() {
        System.out.println("Money transferred");
    }
}
