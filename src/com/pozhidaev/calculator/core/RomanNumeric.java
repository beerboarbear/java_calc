package com.pozhidaev.calculator.core;

public enum RomanNumeric {
    I(1),
    IV(4),
    V(5),
    IX(9),
    X(10),
    XL(40),
    L(50),
    XC(90),
    C(100);

    int arabicRepresentation;
    RomanNumeric(int number) {
        this.arabicRepresentation = number;
    }

}
