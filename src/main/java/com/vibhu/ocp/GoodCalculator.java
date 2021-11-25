package com.vibhu.ocp;

import java.security.InvalidParameterException;

// That way the class is closed for modification but open for an extension.
// More functionalities are added without changing this class through Polymorphic OCP.
public class GoodCalculator {

    public void calculate(GoodCalculatorOperation operation) {
        if (operation == null) {
            throw new InvalidParameterException("Cannot perform operation");
        }
        operation.perform();
    }
}