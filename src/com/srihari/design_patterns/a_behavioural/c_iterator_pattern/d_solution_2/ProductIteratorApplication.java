package com.srihari.design_patterns.a_behavioural.c_iterator_pattern.d_solution_2;

public class ProductIteratorApplication {
    public static void main(String[] args) {
        var product = new ProductCollection();
        product.add(new Product(1, "name-1"));
        product.add(new Product(2, "name-2"));
        product.add(new Product(3, "name-3"));

        IProductIterator<Product> iterator =  product.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
