package com.srihari.design_patterns.a_behavioural.e_template_method_pattern.b_solution_1;

/**
 * This is a template class
 * it defines the common functionality for all the execute methods
 * and for specific task executions, it simply declared a abstract method and its implementations will take care
 */
public abstract class Task {
    private final AuditTrail auditTrail;

    /* public Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    } */    // We can have this constructor, but since we are not dealing with interfaces here, hence it doesnt matter
            // whether we use argumented constructor or default constructor


    public Task() {
        auditTrail = new AuditTrail();
    }

    public void execute(){
        auditTrail.record();;
        doExecute();
    }

    protected abstract void doExecute();    // we must use protected here
                                            // otherwise, the caller may directly call 'doExecute' instead of 'execute'
}
