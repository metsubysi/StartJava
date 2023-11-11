package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String answer = "yes";
        do {
            System.out.print("Введите первое число: ");
            double num1 = scanner.nextDouble();
            System.out.print("Введите знак математической операции: ");
            char operator = scanner.next().charAt(0);
            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();
            double result = calculator.calculate(num1, operator, num2);
            System.out.println("Результат: " + result);
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.next().toLowerCase();;
            } while (!answer.equals("no") && !answer.equals("yes"));
        } while (answer.equals("yes"));
    }
}