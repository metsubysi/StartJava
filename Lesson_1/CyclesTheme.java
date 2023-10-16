class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int i = -10, 
            evenNumber = 0, 
            oddNumber = 0;
        do {
            if ((i % 2) == 0) {
                evenNumber++;
            } else {
                oddNumber++;
            }
            i++;
        } while(i < 22);
        System.out.println("В отрезке [-10, 21] сумма четных чисел = " + evenNumber + ", а нечетных = " + oddNumber + "\n");

        System.out.println("2. Вывод чисел в порядке убывания");
        int num1 = 10, 
            num2 = 5, 
            num3 = -1, 
            maxNum = 0, 
            minNum = 0;
        if (num1 > num2) {
            if (num1 > num3) {
                maxNum = num1;
            } else {
                maxNum = num3;
            }
        } else {
            if (num2 > num3) {
                    maxNum = num2;
                } else {maxNum = num3;}
            }
        if (num1 < num2) {
            if (num1 < num3) {
                minNum = num1;
            } else {
                minNum = num3;
            }
        } else {
            if (num2 < num3) {
                    minNum = num2;
                } else {minNum = num3;}
            }
        for (i = maxNum; i >= minNum; i--) {
            if ((i == num1) || (i == num2) || (i == num3)) {
                System.out.printf(i + " ");
            }
        }
        System.out.printf("\n\n");

        System.out.println("3. Вывод чисел в порядке убывания");
        int numberLesson_3 = 1234, sumOfDigits = 0;
        while (numberLesson_3 > 0) {
            sumOfDigits = sumOfDigits + (numberLesson_3 % 10);
            System.out.printf((numberLesson_3 % 10) + "");
            numberLesson_3 = numberLesson_3 / 10;
        }
        System.out.println("\nCyмма цифр = " + sumOfDigits + "\n");

        System.out.println("4. Вывод чисел в несколько строк");
        int firstNum = 1, 
            lastNum = 30, 
            numLines = 0, 
            counterLines = 0, 
            numberOfIntegers = 0, 
            counterSimple;
        numberOfIntegers = lastNum + 1-firstNum;
        if ((numberOfIntegers % 10)  > 0 ) {
            numLines = (numberOfIntegers / 10) + 1;
        } else {
            numLines = numberOfIntegers / 10;
        }
        for (counterLines = 1; counterLines <= numLines; counterLines++) {
            for (counterSimple = 1; counterSimple <= 10; counterSimple++) {
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
        int numberLesson5 = 3242592, 
            counter5 = 0, 
            secondNumber;
        secondNumber = numberLesson5;
        System.out.printf("B " + numberLesson5);
        while (numberLesson5 > 0) {
            if ((numberLesson5 % 10) == 2) {
                counter5++;
            }
            numberLesson5 = numberLesson5 / 10;
        }
        if ((counter5 % 2) == 0) {
            System.out.println(" четное количество двоек - " + counter5 + "\n");
        } else {
            System.out.println(" не четное количество двоек - " + counter5 + "\n");
        }

        System.out.println("6. Отображение геометрических фигур");
        int iTask61 = 0, 
            iTask62 = 0;
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
        for (i = 15; i < 48; i++){
            if ((i % 2) > 0) {
                System.out.printf("%5d %30c %30s%n", i, (char)i, Character.getName((char)i));
            }
        }
        for (i = 97; i < 123; i++) {
            if ((i % 2) == 0) {
                System.out.printf("%5d %30c %30s%n", i, (char)i, Character.getName((char)i));
            }
        }
        System.out.println();

        System.out.println("8. Проверка, является ли число палиндромом");
        int midleNum = 0;
        firstNum = 1221;
        midleNum = firstNum;
        secondNumber = 0;
        while (midleNum > 0) {
            secondNumber = secondNumber * 10 + midleNum % 10;
            midleNum = midleNum / 10;
        }
        if (firstNum == secondNumber) {System.out.println("число " + firstNum + " является палиндромом\n");}
         else {System.out.println("число " + firstNum + " не является палиндромом\n");}

        System.out.println("9. Проверка, является ли число счастливым");
        int abcdef = 123303, 
            abc = 0, 
            def = 0, 
            s1 = 0, 
            s2 = 0;
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
        if (s1 == s2) {System.out.println("Число ABCDEF является счастливым");}
         else {System.out.println("Число ABCDEF не является счастливым");}
        System.out.println("Сумма цифр " + abc + " = " + s1 + ", а сумма " + def + " = " + s2 + "\n");

        System.out.println("10. Отображение таблицы умножения Пифагора");
        int j = 0;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                if ((i + j) == 0) {
                    System.out.print(" ");
                } else { 
                    if (i == 1) {System.out.print("--");
                    } else {
                        if (j == 0) 
                            {System.out.print(i + "");
                        } else {if (j == 1) {
                                    System.out.print("|");
                                } else {if (i == 0) {System.out.printf("%2s", j + "");}
                                        else {System.out.printf("%2s", j*i + "");}
                            }
                            }
                    }

                }
            }
            System.out.print("\n");
        }
    }
}