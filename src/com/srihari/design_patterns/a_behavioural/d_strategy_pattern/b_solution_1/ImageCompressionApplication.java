package com.srihari.design_patterns.a_behavioural.d_strategy_pattern.b_solution_1;

public class ImageCompressionApplication {
    public static void main(String[] args) {
        var imageStorage = new ImageStorage();

        imageStorage.store(
                "file.jpeg",
                new JpegCompressor(),
                new HighContrastFilter()
        );
        imageStorage.store(             // same image can be compressed with PNG format also
                "file.jpeg",
                new PngCompressor(),
                new HighContrastFilter()
        );
    }
}
