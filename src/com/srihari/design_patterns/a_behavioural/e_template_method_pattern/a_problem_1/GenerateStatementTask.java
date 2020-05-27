package com.srihari.design_patterns.a_behavioural.e_template_method_pattern.a_problem_1;

/**
 * what if a new developer forgets to record audit for any new task ?
 *
 * this structure will be mandatory for all the new tasks (adding AuditTrail field etc) - drawback
 * Also, no enforcement of this approach, hence new developer may forget to include auditTrail so audit may not be recorded
 */
public class GenerateStatementTask {
    private final AuditTrail auditTrail;

    public GenerateStatementTask(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute(){
        auditTrail.record();

        System.out.println("Statement generated");
    }
}
