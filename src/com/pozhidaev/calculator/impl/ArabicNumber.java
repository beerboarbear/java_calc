package com.pozhidaev.calculator.impl;

import com.pozhidaev.calculator.core.Converter;
import com.pozhidaev.calculator.core.DigitBase;
import com.pozhidaev.calculator.core.OperationContract;

public class ArabicNumber extends DigitBase<ArabicNumber> implements OperationContract<ArabicNumber> {

    public ArabicNumber(int number) { super(number); }
    @Override
    public ArabicNumber Add(ArabicNumber operand) { return new ArabicNumber(this.number + operand.number); }
    @Override
    public ArabicNumber Substract(ArabicNumber operand) { return new ArabicNumber(this.number - operand.number); }
    @Override
    public ArabicNumber Divide(ArabicNumber operand) { return new ArabicNumber(this.number / operand.number); }
    @Override
    public ArabicNumber Multiply(ArabicNumber operand) { return new ArabicNumber(this.number * operand.number); }

}
