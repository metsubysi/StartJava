package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;
import java.text.DecimalFormat;

class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        do {
            System.out.print("Введите выражение: ");
            String mathExpression = scanner.nextLine();
            print(mathExpression);
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.next().toLowerCase();
            scanner.nextLine();
        } while (answer.equals("yes"));
    }

    static void print(String str) {
        Calculator calculator = new Calculator();
        double result = calculator.calculate(str);
        if (result != Double.MIN_VALUE) {
            DecimalFormat df = new DecimalFormat("#.###");
            String resultFormat = df.format(result);
            System.out.println(str + " = " + resultFormat);
        }
    }
}