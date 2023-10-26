class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int start = -10;
        int end = 21;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if ((start % 2) == 0) {
                sumEven += start;
            } else {
                sumOdd += start;
            }
            start++;
        } while (start <= end);
        System.out.println("В отрезке [-10, 21] сумма четных чисел = " + sumEven + ", а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int maxNum = num2;
        int minNum = num1;
        if (num1 > num2) {
            maxNum = num1;
            minNum = num2;
        }
        if (maxNum < num3) {
            maxNum = num3;
        }
        if (minNum > num3) {
            minNum = num3;
        }
        System.out.println("Вывод чисел в интервале (" + minNum + "; " + maxNum + ") в порядке убывания");
        for (int i = maxNum - 1; i > minNum; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int sumDigits = 0;
        while (num > 0) {
            int digit = num % 10;
            sumDigits += digit;
            System.out.print(digit);
            num = num / 10;
        }
        System.out.println("\nCyмма цифр = " + sumDigits);

        System.out.println("\n4. Вывод чисел в несколько строк");        
        int numLines = 0;
        start = 1;
        end = 30;
        int countNum = end + 1 - start;
        if ((countNum % 10) > 0) {
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
        int countTwos = 0;
        System.out.print("B " + num);
        while (num > 0) {
            if ((num % 10) == 2) {
                countTwos++;
            }
            num /= 10;
        }
        if ((countTwos % 2) == 0) {
            System.out.println(" четное количество двоек - " + countTwos + "\n");
        } else {
            System.out.println(" не четное количество двоек - " + countTwos + "\n");
        }

        System.out.println("6. Отображение геометрических фигур");
        int row = 5;
        int column = 10;

        for(int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        column = 0;
        while (row > 0) {
            while (column < row) {
                column++;
                System.out.print("#");
            }
            row--;
            column = 0;
            System.out.println();
        }

        row = 0;
        do {
            row++;
            column = Math.abs(row - 3);
            do {
                System.out.print("$");
                column++;
            } while (column < 3);
            System.out.println();
        } while (row < 5);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.printf("%5s %-15s %-32s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        for (int i = 15; i < 48; i++) {
            if ((i % 2) > 0) {
                System.out.printf("%-11s %-6c %-20s%n", "  " + i, (char) i, Character.getName((char) i));
            }
        }
        for (int i = 97; i < 123; i++) {
            if ((i % 2) == 0) {
                System.out.printf("%-11s %-6c %-20s%n", "  " + i, (char) i, Character.getName((char) i));
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        num = 1221;
        int copyNum = num;
        int reverseNum = 0;
        while (copyNum > 0) {
            reverseNum = reverseNum * 10 + copyNum % 10;
            copyNum /= 10;
        }
        if (num == reverseNum) {
            System.out.println("число " + num + " является палиндромом");
        } else {
            System.out.println("число " + num + " не является палиндромом");
        }

        System.out.println("\n9. Проверка, является ли число счастливым");
        int abcdef = 123304; 
        int abc = abcdef / 1000; 
        int def = abcdef % 1000;
        int sumDef = 0;
        int sumAbc = 0;
        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                sumDef += abcdef % 10;
            } else {
                sumAbc += abcdef % 10;
            }
            abcdef /= 10;
        }
        if (sumDef == sumAbc) {
            System.out.println("Число ABCDEF является счастливым");
        } else {
            System.out.println("Число ABCDEF не является счастливым");
        }
        System.out.println("Сумма цифр " + abc + " = " + sumAbc + ", а сумма " + def + " = " + sumDef);

        System.out.println("\n10. Отображение таблицы умножения Пифагора");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if ((i + j) == 0) {
                    System.out.print(" ");
                } else if (i == 1) {
                    if (j < 8) {
                        System.out.print("---");
                    } else  {
                        System.out.print("-");
                    }
                } else if (j == 0) {
                    System.out.print(i + "");
                } else if (j == 1) {
                    System.out.print("|");
                } else if (i == 0) {
                    System.out.printf("%3d", j);
                } else {
                    System.out.printf("%3d", j * i);
                }
            }
            System.out.print("\n");
        }
    }
}