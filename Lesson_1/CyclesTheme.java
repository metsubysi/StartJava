class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int i = -10, evenNumber = 0, oddNumber = 0;
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
        int num_1 = 10, num_2 = 5, num_3 = -1, maxNum = 0, minNum = 0;
        if (num_1 > num_2) {
            if (num_1 > num_3) {
                maxNum = num_1;
            } else {
                maxNum = num_3;
            }
        } else {
            if (num_2 > num_3) {
                    maxNum = num_2;
                } else {maxNum = num_3;}
            }
        if (num_1 < num_2) {
            if (num_1 < num_3) {
                minNum = num_1;
            } else {
                minNum = num_3;
            }
        } else {
            if (num_2 < num_3) {
                    minNum = num_2;
                } else {minNum = num_3;}
            }
        for (i = maxNum; i >= minNum; i--) {
            if ((i == num_1) || (i == num_2) || (i == num_3)) {
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
        int firstNum = 1, lastNum = 30, numLines = 0, counterLines = 0, numberOfIntegers = 0, counterSimple;
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
        int numberLesson_5 = 3242592, counter_5 = 0, secondNumber;
        secondNumber = numberLesson_5;
        System.out.printf("B " + numberLesson_5);
        while (numberLesson_5 > 0) {
            if ((numberLesson_5 % 10) == 2) {
                counter_5++;
            }
            numberLesson_5 = numberLesson_5 / 10;
        }
        if ((counter_5 % 2) == 0) {
            System.out.println(" (четное) количество двоек - " + counter_5 + "\n");
        } else {
            System.out.println(" (не четное) количество двоек - " + counter_5 + "\n");
        }

        System.out.println("6. Отображение геометрических фигур");
        int iTask_61 = 0, iTask_62 = 0;
        for(iTask_61 = 1; iTask_61 < 6; iTask_61++) {
            for (iTask_62 = 11; iTask_62 > 1; iTask_62--) {
                System.out.printf("*");
            }
            System.out.println();
        }
        while (iTask_61 > 1) {
            while (iTask_62 < iTask_61) {
                iTask_62++;
                System.out.printf("#");
            }
            iTask_61--;
            iTask_62 = 1;
            System.out.println();
        }
        iTask_61 = 0;
        do {
            iTask_61++;
            iTask_62 = Math.abs(iTask_61-3);
            do {
                System.out.printf("$");
                iTask_62++;
            } while (iTask_62 < 3);
            System.out.println();
        } while (iTask_61 < 5);
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
        if (firstNum == secondNumber) {System.out.printf("число " + firstNum + " является палиндромом\n\n");}
         else {System.out.printf("число " + firstNum + " не является палиндромом\n\n");}

        System.out.println("9. Проверка, является ли число счастливым");
        int abcdef = 123303, abc = 0, def = 0, s1 = 0, s2 = 0;
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
        if (s1 == s2) {System.out.printf("Число ABCDEF является счастливым\n");}
         else {System.out.printf("Число ABCDEF не является счастливым\n");}
        System.out.printf("Сумма цифр " + abc + " = " + s1 + ", а сумма " + def + " = " + s2 + "\n\n");

        System.out.println("10. Отображение таблицы умножения Пифагора");
        int j = 0;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                if ((i + j) == 0) {
                    System.out.printf(" ");
                } else { 
                    if (i == 1) {System.out.printf("--");
                    } else {
                        if (j == 0) 
                            {System.out.printf(i+"");
                        } else {if (j == 1) {
                                    System.out.printf("|");
                                } else {if (i == 0) {System.out.printf("%2s",j+"");}
                                        else {System.out.printf("%2s",j*i+"");}
                            }
                            }
                    }

                }
            }
            System.out.printf("\n");
        }
    }
}