package com.startjava.lesson_1.final_;

class Calculator {
    public static void main(String[] args) {
        int a = 25;
        int b = 8;
        int result = 1;
        char sign = '-';
        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a-b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            result = a / b;
        } else if (sign == '%') {
            result = a % b;
        } else if (sign == '^') {
            for (int i = 0; i < b; i++) {
                result *= a;
            }
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}