package com.vibhu.ocp;

// The code in the calculate method will change with every incoming new operation support request.
// So, we need to extract this code and put it in an abstraction layer.
// One solution is to delegate each operation into their respective class.
public interface GoodCalculatorOperation {
    void perform();
}