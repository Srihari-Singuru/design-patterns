package com.srihari.design_patterns.a_behavioural.f_command_pattern.c_composite_commands;

public class PhotoShopApplication {
    public static void main(String[] args) {
        var compositeService = new CompositeCommand();

        compositeService.add(new ResizeCommand());
        compositeService.add(new BlackAndWhiteCommand());

        compositeService.execute();
    }
}
