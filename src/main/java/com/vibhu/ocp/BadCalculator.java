package com.vibhu.ocp;

import java.security.InvalidParameterException;

//.... keep adding more if multiplication/divide is coming.
// When a new requirement of adding multiplication or divide functionality comes in,
// we've no way besides changing the calculate method of the Calculator class.

public class BadCalculator {

    public void calculate(BadCalculatorOperationInterface operation) {
        if (operation == null) {
            throw new InvalidParameterException("Can not perform operation");
        }

        if (operation instanceof BadAddition) {
            BadAddition addition = (BadAddition) operation;
            addition.setResult(addition.getLeft() + addition.getRight());
        } else if (operation instanceof BadSubtraction) {
            BadSubtraction subtraction = (BadSubtraction) operation;
            subtraction.setResult(subtraction.getLeft() - subtraction.getRight());
        }
    }
}
