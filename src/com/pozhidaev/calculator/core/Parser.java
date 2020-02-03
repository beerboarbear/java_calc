package com.pozhidaev.calculator.core;

import com.pozhidaev.calculator.models.CalculatableModel;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Parser {
    private static final Pattern arabicTemplate = Pattern.compile("^\\s*([1-9]|10)\\s*(\\+|\\*|\\-|\\/)\\s+([1-9]|10)\\s*$");
    private static final Pattern romanTemplate = Pattern.compile("^\\s(V?I{0,3}|I[VX]|X?)\\s*(\\+|\\*|\\-|\\/)\\s+(V?I{0,3}|I[VX]|X?)\\s*$");

    public static CalculatableModel TryParseUserInput(Scanner scn) throws IOException {
        return Stream.concat(scn.findAll(arabicTemplate),
            scn.findAll(romanTemplate)).filter(x -> x.groupCount() == 3)
                    .map((c) -> new CalculatableModel(
                            parseOperand(c.group(1)),
                            parseOperand(c.group(3)),
                            parseOperator(c.group(2))))
                    .findFirst().orElseThrow(IOException::new);
    }
    private static DigitBase parseOperand(String operand) {
        return DigitBase.apply(operand);
    }

    private static BinaryOperator parseOperator(String operator) {
        switch (operator) {
            case "*":
                return (a, b) -> a.Multiply(b);
            case "/":
                return (a, b) -> a.Divide(b);
            case "-":
                return (a, b) -> a.Substract(b);
            case "+":
                return (a, b) -> a.Add(b);
            default: return null;
        }
    }

}
