package com.startjava.lesson_2_3_4.calculator;

class Calculator {
    public static double calculate(String mathExpression) {
        String[] elements = mathExpression.split(" ");
        if (elements.length != 3) {
            throw new IllegalArgumentException("Bведены не удовлетворяющие условиям данные," +
                    "введите выражение типа: a + b, где + любой знак мат. операциz");
        }
        int a = Integer.parseInt(elements[0]);
        int b = Integer.parseInt(elements[2]);
        char operator = elements[1].charAt(0);
        return switch (operator) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            case '%' -> a % b;
            case '^' -> Math.pow(a, b);
            default -> throw new IllegalArgumentException("Ошибка: знак " +
                    operator + " не поддерживается");
        };
    }
}