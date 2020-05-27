package com.srihari.design_patterns.a_behavioural.d_strategy_pattern.d_solution_2;

public class DESEncryption implements IEncryption {
    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting message using DES");
    }
}
