package com.srihari.design_patterns.a_behavioural.d_strategy_pattern.d_solution_2;

public class ChatClient {
    public void send(String message, IEncryption encryption) {
        encryption.encrypt(message);
        System.out.println("Sending the encrypted message...");
    }
}
