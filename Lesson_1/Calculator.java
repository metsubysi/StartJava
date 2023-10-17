class Calculator {
    public static void main(String[] args) {
        int a = 2;
        int b = 8;
        int result = 1;
        int i = 0;
        char sign = '^';
        if (sign == '+') {
            result = a + b;
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