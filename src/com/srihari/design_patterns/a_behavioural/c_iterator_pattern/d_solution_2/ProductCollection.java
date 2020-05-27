package com.srihari.design_patterns.a_behavioural.c_iterator_pattern.d_solution_2;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
    private final List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public ProductIterator createIterator(){
        return new ProductIterator(this);
    }

    static class ProductIterator implements IProductIterator<Product> {
        private final ProductCollection productCollection;
        private int index;

        public ProductIterator(ProductCollection productCollection) {
            this.productCollection = productCollection;
        }

        @Override
        public Product current() {
            return productCollection.products.get(index);
        }

        @Override
        public boolean hasNext() {
            return index < productCollection.products.size();
        }

        @Override
        public void next() {
            index++;
        }
    }
}
