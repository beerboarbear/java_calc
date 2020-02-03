package com.pozhidaev.calculator.core;

import java.util.Arrays;

public class Converter {
    public static String convertToRoman(int arabic) {
        return Arrays.stream(RomanNumeric.values()).filter(v -> arabic >= v.arabicRepresentation)
                    .map(n -> n.toString() + convertToRoman(arabic - n.arabicRepresentation))
                    .findFirst().orElseThrow(ArithmeticException::new);
    }
    public static int convertToArabic(String roman) {
        return roman.length() == 0 ? 0 : Arrays.stream(RomanNumeric.values())
                .filter(d -> roman.startsWith(d.toString()))
                .map(c -> c.arabicRepresentation + convertToArabic(roman.substring(c.toString().length())))
                .findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
