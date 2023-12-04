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
                try {
                    double result = Calculator.calculate(mathExpression);
                    print(result, mathExpression);
                } catch (ArithmeticException e) {
                    System.out.println("Деление но ноль не возможно");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.next().toLowerCase();
            scanner.nextLine();
        } while (!answer.equals("no"));
    }

    static void print(double result, String mathExpression) {
        String resultFormat = (result != Double.MIN_VALUE) ? mathExpression +
                        " = " + new DecimalFormat("#.###").format(result) : "";
        System.out.println(resultFormat);
    }
}