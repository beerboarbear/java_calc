package com.pozhidaev.calculator.core;

public interface BinaryOperator<T extends DigitBase> {
    T operate(T a, T b);
}
