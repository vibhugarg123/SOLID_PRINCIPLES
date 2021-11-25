package com.vibhu.ocp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GoodAddition implements GoodCalculatorOperation {
    private double left;
    private double right;
    private double result;

    // constructor, getters and setters

    @Override
    public void perform() {
        result = left + right;
    }
}
