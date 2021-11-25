package com.vibhu.ocp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BadAddition implements BadCalculatorOperationInterface {

    private double left;
    private double right;
    private double result = 0.0;

    public BadAddition(double left, double right) {
        this.left = left;
        this.right = right;
    }

    // getters and setters
}


