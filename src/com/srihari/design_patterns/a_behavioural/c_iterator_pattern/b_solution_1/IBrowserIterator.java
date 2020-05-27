package com.srihari.design_patterns.a_behavioural.c_iterator_pattern.b_solution_1;

public interface IBrowserIterator<T> {
    T current();
    boolean hasNext();
    void next();
}
