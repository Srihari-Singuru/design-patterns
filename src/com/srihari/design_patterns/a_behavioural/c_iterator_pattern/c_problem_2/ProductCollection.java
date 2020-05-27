package com.srihari.design_patterns.a_behavioural.c_iterator_pattern.c_problem_2;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
    private final List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }
}
