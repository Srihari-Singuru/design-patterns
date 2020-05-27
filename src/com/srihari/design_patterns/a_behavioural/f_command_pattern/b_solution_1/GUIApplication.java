package com.srihari.design_patterns.a_behavioural.f_command_pattern.b_solution_1;

import com.srihari.design_patterns.a_behavioural.f_command_pattern.b_solution_1.framework.Button;

public class GUIApplication {
    public static void main(String[] args) {
        var customerService = new CustomerService();
        var command = new AddCustomerCommand(customerService);
        var button = new Button(command);

        button.click();
    }
}
