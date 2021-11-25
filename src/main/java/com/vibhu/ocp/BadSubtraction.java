package com.vibhu.ocp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BadSubtraction implements BadCalculatorOperationInterface {
    private double left;
    private double right;
    private double result = 0.0;

    public BadSubtraction(double left, double right) {
        this.left = left;
        this.right = right;
    }

    // getters and setters
}
