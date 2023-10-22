class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int startX = -10;
        int endX = 21;
        int evenNumber = 0;
        int oddNumber = 0;
        do {
            if ((startX % 2) == 0) {
                evenNumber++;
            } else {
                oddNumber++;
            }
            startX++;
        } while (startX <= endX);
        System.out.println("В отрезке [-10, 21] сумма четных чисел = " + evenNumber + ", а нечетных = " + oddNumber);

        System.out.println("\n2. Вывод чисел в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int maxNum = 0;
        if (num1 >= num2 && num1 >= num3) {
            maxNum = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            maxNum = num2;
        } else {
            maxNum = num3;
        }
        int minNum = 0;
        if (num1 <= num2 && num1 <= num3) {
            minNum = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            minNum = num2;
        } else {
            minNum = num3;
        }
        for (int i = maxNum; i >= minNum; i--) {
            if ((i == num1) || (i == num2) || (i == num3)) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int numberLesson3 = 1234;
        int sumDigits = 0;
        while (numberLesson3 > 0) {
            sumDigits = sumDigits + (numberLesson3 % 10);
            System.out.print((numberLesson3 % 10) + "");
            numberLesson3 = numberLesson3 / 10;
        }
        System.out.println("\nCyмма цифр = " + sumDigits);

        System.out.println("\n4. Вывод чисел в несколько строк");
        int firstNum = 1;
        int lastNum = 30;
        int numLines = 0;
        int countNum = lastNum + 1 - firstNum;
        if ((countNum % 10) > 0 ) {
            numLines = (countNum / 10) + 1;
        } else {
            numLines = countNum / 10;
        }
        for (int i = 1; i <= numLines; i++) {
            for (int j = 1; j <= 10; j++) {
                if (!((firstNum % 2) == 0)) {
                    if (firstNum > lastNum) {
                        System.out.printf("%" + 5 + "d", 0);
                    } else {
                        System.out.printf("%" + 5 + "d", firstNum);
                    }
                }
                firstNum++;
            }
            System.out.println("\n");
        }

        System.out.println("5. Проверка количества двоек числа на четность/нечетность");
        int numLesson5 = 3242592;
        int counter5 = 0;
        int secondNum = numLesson5;
        System.out.printf("B " + numLesson5);
        while (numLesson5 > 0) {
            if ((numLesson5 % 10) == 2) {
                counter5++;
            }
            numLesson5 = numLesson5 / 10;
        }
        if ((counter5 % 2) == 0) {
            System.out.println(" четное количество двоек - " + counter5 + "\n");
        } else {
            System.out.println(" не четное количество двоек - " + counter5 + "\n");
        }

        System.out.println("6. Отображение геометрических фигур");
        int iTask61 = 0;
        int iTask62 = 0;
        for(iTask61 = 1; iTask61 < 6; iTask61++) {
            for (iTask62 = 11; iTask62 > 1; iTask62--) {
                System.out.printf("*");
            }
            System.out.println();
        }
        while (iTask61 > 1) {
            while (iTask62 < iTask61) {
                iTask62++;
                System.out.printf("#");
            }
            iTask61--;
            iTask62 = 1;
            System.out.println();
        }
        iTask61 = 0;
        do {
            iTask61++;
            iTask62 = Math.abs(iTask61 - 3);
            do {
                System.out.printf("$");
                iTask62++;
            } while (iTask62 < 3);
            System.out.println();
        } while (iTask61 < 5);
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
        int firstNumber = 1221;
        int midleNumber = firstNumber;
        int secondNumber = 0;
        while (midleNumber > 0) {
            secondNumber = secondNumber * 10 + midleNumber % 10;
            midleNumber = midleNumber / 10;
        }
        if (firstNumber == secondNumber) {System.out.println("число " + firstNumber + " является палиндромом");}
         else {System.out.println("число " + firstNumber + " не является палиндромом");}

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