package com.srihari.design_patterns.a_behavioural.e_template_method_pattern.b_solution_1;

public class BankingApplication {
    public static void main(String[] args) {
        var transfer = new TransferMoneyTask();
        transfer.execute();
        //transfer.doExecute();     // we cannot invoke this if main class is outside of the 'Task class' package - which is what we wanted
                                    // so, the called will have access to only 'transfer.execute()' method, but not to doExecute

        var bankStatement = new GenerateStatementTask();
        bankStatement.execute();
    }
}
