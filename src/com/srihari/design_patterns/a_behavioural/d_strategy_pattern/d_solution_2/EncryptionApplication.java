package com.srihari.design_patterns.a_behavioural.d_strategy_pattern.d_solution_2;

public class EncryptionApplication {
    public static void main(String[] args) {
        var chatClient = new ChatClient();

        chatClient.send("demo message", new AESEncryption());
        chatClient.send("demo message", new DESEncryption());
    }
}
