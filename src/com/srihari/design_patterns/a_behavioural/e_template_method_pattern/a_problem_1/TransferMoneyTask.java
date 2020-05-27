package com.srihari.design_patterns.a_behavioural.e_template_method_pattern.a_problem_1;

/**
 * what if a new developer forgets to record audit for any new task ?
 */
public class TransferMoneyTask {
    private final AuditTrail auditTrail;

    public TransferMoneyTask(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute(){
        auditTrail.record();

        System.out.println("Money transferred");
    }
}
