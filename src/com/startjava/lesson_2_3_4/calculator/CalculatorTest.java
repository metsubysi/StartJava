package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;
import java.text.DecimalFormat;

class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                System.out.print("Введите выражение: ");
                String mathExpression = scanner.nextLine();
                Calculator calculator = new Calculator();
                double result = calculator.calculate(mathExpression);
                print(result, mathExpression);
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.next().toLowerCase();
            if ("no".equals(answer)) {
                break;
            }
            scanner.nextLine();
        } while (!answer.equals("no"));
    }

    static void print(double result, String str) {
        if (result != Double.MIN_VALUE) {
            DecimalFormat df = new DecimalFormat("#.###");
            String resultFormat = df.format(result);
            System.out.println(str + " = " + resultFormat);
        }
    }
}