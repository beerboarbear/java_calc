package com.pozhidaev.calculator.core;

import com.pozhidaev.calculator.impl.ArabicNumber;
import com.pozhidaev.calculator.impl.RomanNumber;

public abstract class DigitBase<T extends DigitBase> implements OperationContract<T> {
    protected int number;

    public DigitBase(int number) {
        this.number = number;
    }
    public static DigitBase apply(String val) {
        try {
            return new ArabicNumber(Integer.parseInt(val));
        }
        catch (Exception ex) {
            return new RomanNumber(Converter.convertToArabic(val));
        }
    }

    @Override
    public String toString() {
        return Integer.toString(this.number);
    }
}
