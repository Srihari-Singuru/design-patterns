package com.srihari.design_patterns.a_behavioural.g_observer_pattern.a_problem_1;

/**
 * changes in this class need to be notified to SpreadSheet and Chart classes
 */
public class DataStore {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;             // when 'value' gets changed, SpreadSheet and Chart should be notified
                                        // at the time of writing this code, we don't know how many SpreadSheets or Charts are using this field
                                        // user may add new SpreadSheets or new Charts that are dependant on this DataSource
    }
}
