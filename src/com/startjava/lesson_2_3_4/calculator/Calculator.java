package com.startjava.lesson_2_3_4.calculator;

class Calculator {
    public double calculate(String str) {
        String[] elements = str.split(" ");
            int a = Integer.parseInt(elements[0]);
            int b = Integer.parseInt(elements[2]);
            char operator = elements[1].charAt(0);
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b != 0) {
                    return (double) a / b;
                }
                System.out.println("Деление на 0 не возможно.");
                return Double.MIN_VALUE;
            case '%':
                if (b != 0) {
                    return a % b;
                }
                System.out.println("Деление на 0 не возможно.");
                return Double.MIN_VALUE;
            case '^':
                return Math.pow(a, b);
            default:
                System.out.println("Ошибка: знак " + operator + " не поддерживается");
                return Double.MIN_VALUE;
        }
    }
}