package com.pozhidaev.calculator;

import com.pozhidaev.calculator.core.Calculator;
import com.pozhidaev.calculator.core.Parser;
import com.pozhidaev.calculator.models.CalculatableModel;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        //читаем консоль
        System.out.println("Введите операцию");
        CalculatableModel model = null;
        Scanner scn = new Scanner(System.in);

        try {
            while (true) {
                model = Parser.TryParseUserInput(scn);
                var result = Calculator.calculate(model);
                System.out.println(result);
            }
        }
        finally {
            scn.close();
        }

    }
}
