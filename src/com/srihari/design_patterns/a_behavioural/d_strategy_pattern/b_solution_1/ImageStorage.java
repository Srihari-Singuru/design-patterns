package com.srihari.design_patterns.a_behavioural.d_strategy_pattern.b_solution_1;

/**
 * In State pattern, we will have a state and, interface will have methods for different behaviours
 * In Strategy pattern, we do not have state. Different behaviours will have different strategies in interface
 */
public class ImageStorage {
    /* private final ICompressor compressor;
    private final IFilter filter;

    public ImageStorage(ICompressor compressor, IFilter filter) {
        this.compressor = compressor;
        this.filter = filter;
    } */    // we can add here, or we can add the arguments to beow method
            // since we are applying these for an image file, lets pass these at the time of passing image itself

    public void store(String fileName, ICompressor compressor, IFilter filter){
        // applying compression
        compressor.compress(fileName);

        // applying filter
        filter.filter(fileName);
    }
}
