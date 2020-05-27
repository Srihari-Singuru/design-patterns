package com.srihari.design_patterns.a_behavioural.d_strategy_pattern.a_problem_1;

/**
 * This class is performing compression, filtering and storing - violating single responsibility
 * hard to maintain if new compressionTypes and filterTypes gets added
 */
public class ImageStorage {
    private final CompressorType compressorType;
    private final FilterType filterType;

    public ImageStorage(CompressorType compressorType, FilterType filterType) {
        this.compressorType = compressorType;
        this.filterType = filterType;
    }

    public void store(String fileName){
        // applying compression
        if(compressorType == CompressorType.JPEG){
            System.out.println("Compressing using JPEG");
        } else if(compressorType == CompressorType.PNG){
            System.out.println("Compressing using PNG");
        }

        // applying filter
        if(filterType == FilterType.BLACK_WHITE){
            System.out.println("Applying B&W filter");
        } else if(filterType == FilterType.HIGH_CONTRAST){
            System.out.println("Applying High Contrast filter");
        }
    }
}
