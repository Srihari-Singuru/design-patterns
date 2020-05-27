package com.srihari.design_patterns.a_behavioural.f_command_pattern.b_solution_1;

import com.srihari.design_patterns.a_behavioural.f_command_pattern.b_solution_1.framework.ICommand;

public class AddCustomerCommand implements ICommand {
    private final CustomerService service;

    public AddCustomerCommand(CustomerService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.addCustomer();
    }
}
