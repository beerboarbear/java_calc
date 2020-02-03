package com.pozhidaev.calculator.core;

public interface OperationContract<T extends DigitBase> {
    T Add(T operand);
    T Substract(T operand);
    T Divide(T operand);
    T Multiply(T operand);

}
