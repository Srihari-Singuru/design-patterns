package com.srihari.design_patterns.a_behavioural.d_strategy_pattern.d_solution_2;

public class AESEncryption implements IEncryption {
    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting message using AES");
    }
}
