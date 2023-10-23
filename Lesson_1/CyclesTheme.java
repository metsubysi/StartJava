class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int start = -10;
        int end = 21;
        int evenSum = 0;
        int oddSum = 0;
        do {
            if ((start % 2) == 0) {
                evenSum++;
            } else {
                oddSum++;
            }
            start++;
        } while (start <= end);
        System.out.println("В отрезке [-10, 21] сумма четных чисел = " + evenSum + ", а нечетных = " + oddSum);

        System.out.println("\n2. Вывод чисел в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int maxNum = 0;
        int minNum = 0;
        if (num1 > num2) {
            maxNum = num1;
            minNum = num2;
        } else {
            maxNum = num2;
            minNum = num1;
        }
        if (maxNum < num3) {
            maxNum = num3;
        }
        if (minNum > num3) {
            minNum = num3;
        }
        System.out.println("Вывод чисел в интервале [" + minNum + "; " + maxNum + "] в порядке убывания");
        for (int i = maxNum; i >= minNum; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int sumDigits = 0;
        int ones = 0;
        while (num > 0) {
            ones = num % 10;
            sumDigits = sumDigits + ones;
            System.out.print(ones);
            num = num / 10;
        }
        System.out.println("\nCyмма цифр = " + sumDigits);

        System.out.println("\n4. Вывод чисел в несколько строк");        
        int numLines = 0;
        start = 1;
        end = 30;
        int countNum = end + 1 - start;
        if ((countNum % 10) > 0 ) {
            numLines = (countNum / 10) + 1;
        } else {
            numLines = countNum / 10;
        }
        for (int i = 1; i <= numLines; i++) {
            for (int j = 1; j <= 10; j++) {
                if ((start % 2) != 0) {
                    if (start > end) {
                        System.out.printf("%3d", 0);
                    } else {
                        System.out.printf("%3d", start);
                    }
                }
                start++;
            }
            System.out.println("\n");
        }

        System.out.println("5. Проверка количества двоек числа на четность/нечетность");
        num = 3242592;
        int counter = 0;
        int secondNum = num;
        System.out.printf("B " + num);
        while (num > 0) {
            if ((num % 10) == 2) {
                counter++;
            }
            num = num / 10;
        }
        if ((counter % 2) == 0) {
            System.out.println(" четное количество двоек - " + counter + "\n");
        } else {
            System.out.println(" не четное количество двоек - " + counter + "\n");
        }

        System.out.println("6. Отображение геометрических фигур");
        int x = 0;
        int y = 0;
        for(x = 1; x < 6; x++) {
            for (y = 11; y > 1; y--) {
                System.out.printf("*");
            }
            System.out.println();
        }
        while (x > 1) {
            while (y < x) {
                y++;
                System.out.printf("#");
            }
            x--;
            y = 1;
            System.out.println();
        }
        x = 0;
        do {
            x++;
            y = Math.abs(x - 3);
            do {
                System.out.printf("$");
                y++;
            } while (y < 3);
            System.out.println();
        } while (x < 5);
        System.out.println();

        System.out.println("7. Отображение ASCII-символов");
        System.out.printf("%5s %30s %28s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        char asciiChar = '!';
        for (int i = 15; i < 48; i++){
            if ((i % 2) > 0) {
                System.out.printf("%5d %30c %30s%n", i, (char)i, Character.getName((char)i));
            }
        }
        for (int i = 97; i < 123; i++) {
            if ((i % 2) == 0) {
                System.out.printf("%5d %30c %30s%n", i, (char)i, Character.getName((char)i));
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        num1 = 1221;
        num2 = num1;
        num3 = 0;
        while (num2 > 0) {
            num3 = num3 * 10 + num2 % 10;
            num2 = num2 / 10;
        }
        if (num1 == num3) {System.out.println("число " + num1 + " является палиндромом");}
         else {System.out.println("число " + num1 + " не является палиндромом");}

        System.out.println("\n9. Проверка, является ли число счастливым");
        int abcdef = 123303; 
        int abc = 0; 
        int def = 0;
        int s1 = 0;
        int s2 = 0;
        abc = abcdef / 1000; def = abcdef % 1000;
        while (abcdef > 0) {
            if (abcdef > 999) {
                s2 = s2 + abcdef % 10;
                abcdef = abcdef / 10;
            } else {
                s1 = s1 + abcdef % 10;
                abcdef = abcdef / 10;
            }
        }
        if (s1 == s2) {
            System.out.println("Число ABCDEF является счастливым");
        } else {
            System.out.println("Число ABCDEF не является счастливым");
        }
        System.out.println("Сумма цифр " + abc + " = " + s1 + ", а сумма " + def + " = " + s2);

        System.out.println("\n10. Отображение таблицы умножения Пифагора");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if ((i + j) == 0) {
                    System.out.print(" ");
                } else if (i == 1) {
                    System.out.print("--");
                } else if (j == 0) {
                    System.out.print(i + "");
                } else if (j == 1) {
                    System.out.print("|");
                } else if (i == 0) {
                    System.out.printf("%2s", j + "");
                } else {
                    System.out.printf("%2s", j*i + "");
                }
            }
            System.out.print("\n");
        }
    }
}