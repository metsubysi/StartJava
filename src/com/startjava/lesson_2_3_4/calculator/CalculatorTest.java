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
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.next().toLowerCase();
            scanner.nextLine();
        } while (!answer.equals("no"));
    }

    private void print(double result, String mathExpression) {
        System.out.println(mathExpression + " = " + new DecimalFormat("#.###").format(result));
    }
}