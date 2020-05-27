package com.srihari.design_patterns.a_behavioural.d_strategy_pattern.b_solution_1;

public class JpegCompressor implements ICompressor {
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing using JPEG");
    }
}
