package com.srihari.design_patterns.a_behavioural.c_iterator_pattern.d_solution_2;

public interface IProductIterator<T> {
    T current();
    boolean hasNext();
    void next();
}
