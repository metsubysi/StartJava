package com.startjava.lesson_2_3.calculator;

class Calculator {
    public double calculate(double num1, char operator, double num2) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                }
                System.out.println("Деление на 0 не возможно.");
                return 0;
            case '%':
                if (num2 != 0) {
                    return num1 % num2;
                }
                System.out.println("Деление на 0 не возможно.");
                return 0;
            case '^':
                return Math.pow(num1, num2);
            default:
                System.out.println("Bведенная мат. операция не поддерживается.");
                return 0;
        }
    }
}