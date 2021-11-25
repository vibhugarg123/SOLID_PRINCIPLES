package com.vibhu.ocp;

import lombok.Getter;
import lombok.Setter;

// Likewise, an updated Subtraction class would have similar logic.
// And similarly to Addition and Subtraction, as a new change request, we could implement the division logic:
@Getter
@Setter
public class GoodDivision implements GoodCalculatorOperation {
    private double left;
    private double right;
    private double result;

    // constructor, getters and setters
    @Override
    public void perform() {
        if (right != 0) {
            result = left / right;
        }
    }
}
