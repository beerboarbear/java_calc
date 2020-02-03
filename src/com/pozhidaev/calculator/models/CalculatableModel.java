package com.pozhidaev.calculator.models;

import com.pozhidaev.calculator.core.BinaryOperator;
import com.pozhidaev.calculator.core.DigitBase;

public class CalculatableModel {
    DigitBase operand0;
    DigitBase operand1;
    BinaryOperator operator;
    public CalculatableModel(DigitBase operand0, DigitBase operand1, BinaryOperator operator) {
        this.operand0 = operand0;
        this.operand1 = operand1;
        this.operator = operator;
    }
    public DigitBase getOperand0() {return operand0;}
    public DigitBase getOperand1() {return operand1;}
    public BinaryOperator getOperator() {return operator;}
}
