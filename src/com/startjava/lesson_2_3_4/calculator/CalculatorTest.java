package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String answer = "yes";
        do {
            System.out.print("Введите выражение: ");
            String mathExpression = scanner.nextLine();
            String[] mathExpressionArray = mathExpression.split(" ");
            int num1 = Integer.parseInt(mathExpressionArray[0]);
            int num2 = Integer.parseInt(mathExpressionArray[2]);
            char operator = mathExpressionArray[1].charAt(0);
            double result = calculator.calculate(num1, operator, num2);
            if (result != Double.MIN_VALUE) {
                System.out.println(mathExpression + " = " + result);
            }
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.next().toLowerCase();;
            } while (!answer.equals("no") && !answer.equals("yes"));
        } while (answer.equals("yes"));
    }
}