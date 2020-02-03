package com.pozhidaev.calculator.core;

import com.pozhidaev.calculator.models.CalculatableModel;

public class Calculator {
    public static DigitBase calculate(CalculatableModel model) {
        return model.getOperator().operate(model.getOperand0(), model.getOperand1());
    }
}
