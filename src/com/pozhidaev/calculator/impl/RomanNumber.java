package com.pozhidaev.calculator.impl;

import com.pozhidaev.calculator.core.Converter;
import com.pozhidaev.calculator.core.DigitBase;
import com.pozhidaev.calculator.core.OperationContract;

public class RomanNumber extends DigitBase<RomanNumber> implements OperationContract<RomanNumber> {
    public RomanNumber(int number) {
        super(number);
    }
    @Override
    public RomanNumber Add(RomanNumber operand) { return new RomanNumber(this.number + operand.number); }
    @Override
    public RomanNumber Substract(RomanNumber operand) {
        return new RomanNumber(this.number - operand.number);
    }
    @Override
    public RomanNumber Divide(RomanNumber operand) {
        return new RomanNumber(this.number / operand.number);
    }
    @Override
    public RomanNumber Multiply(RomanNumber operand) {
        return new RomanNumber(this.number * operand.number);
    }
    @Override
    public String toString() {
        return Converter.convertToRoman(this.number);
    }
}
