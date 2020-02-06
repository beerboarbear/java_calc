package com.pozhidaev.calculator.core;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Converter {
    public static final RomanNumeric[] romanNumerics = RomanNumeric.values();

    public static String convertToRoman(int arabic) {
        if (arabic <= 0)
            return null;
        StringBuilder result = new StringBuilder();
        Arrays.sort(romanNumerics, (a, b) -> b.arabicRepresentation - a.arabicRepresentation);
        for(var key : romanNumerics) {
            while (arabic >= key.arabicRepresentation) {
                 arabic -= key.arabicRepresentation;
                result.append(key.name());
            }
        }
        return result.toString();
    }
    public static int convertToArabic(String roman) {

        return roman.length() == 0 ? 0 : Stream.of(romanNumerics)
                .filter(d -> roman.startsWith(d.name()))
                .map(c -> c.arabicRepresentation + convertToArabic(roman.substring(c.name().length())))
                .findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
