class Calculator {
    public static void main(String[] args) {
        int a = 2, b = 8, result = 1, i = 0;
        char sign = '^';
        if (sign == '+') {
            result = a+b;
        } else {
            if (sign == '-') {
                result = a-b;
                } else if (sign == '*') {
                    result = a * b;
                } else if (sign == '/') {
                    result = a / b;
                } else if (sign == '%') {
                    result = a % b;
                } else if (sign == '^') {
                    for (i = 0; i < b; i++) {
                        result = result * a;
                    }
                }
            }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}