package com.startjava.lesson_1.base;

class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        boolean isGenderMale = true;
        int age = 17;
        float height = 1.9f;
        char firstLetter = "Serhii".charAt(0);
        if (!isGenderMale) {
            System.out.println("Женский пол");
        } else {
            System.out.println("Myжскoй пол");
        }            
        if (age > 18) {
            System.out.println("Cовершеннолетний");
        } else {
            System.out.println("Hесовершеннолетний");
        }
        if (height < 1.8) {
            System.out.println("Hизкий");
        } else {
            System.out.println("Высокий");
        }
        if (firstLetter == 'M') {
            System.out.println("Первая буква имени M");
        } else if (firstLetter == 'I') {
            System.out.println("Первая буква имени I");
        } else {
            System.out.println("Первая буква имени: " + firstLetter);
        }

        System.out.println("\n2. Поиск большего числа");
        int a = 1111;
        int b = 111;
        if (a > b) {
            System.out.println(a + " > " + b);
        } else if (a < b) {
            System.out.println(a + " < " + b);
        } else {
            System.out.println(a + " = " + b);
        }

        System.out.println(" \n3. Проверка числа");
        int checkNumber = 11;
        if (checkNumber == 0) {
            System.out.println("Число является: 0 \n");
        } else {
            if (checkNumber < 0) {
                System.out.print("Число " + checkNumber + " является отрицательным");
            } else {
                System.out.print("Число " + checkNumber + " является положительным");
            }
            if ((checkNumber % 2) == 0) {
                System.out.println(" и чётным");
            } else {
                System.out.println(" и не чётным");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int num1 = 234;
        int num2 = 234;
        int hundredsNum1 = num1 / 100;
        int hundredsNum2 = num2 / 100;
        int tensNum1 = num1 % 100 / 10;
        int tensNum2 = num2 % 100 / 10;
        int onesNum1 = num1 % 10;
        int onesNum2 = num2 % 10;
        String sameDigits = "";
        String digitPosition = "";
        System.out.print("В числах "+ num1 + " и " + num2 + " одинаковые цифры в разрядах: ");
        if (hundredsNum1 == hundredsNum2 || tensNum1 == tensNum2 || onesNum1 == onesNum2) {
            if (hundredsNum1 == hundredsNum2) {
                System.out.print("100 = " + hundredsNum1);
            }
            if (tensNum1 == tensNum2) {
                System.out.print(" 10 = " + tensNum1);
            }
            if (onesNum1 == onesNum2) {
                System.out.print(" 1 = " + onesNum1);
            }
        } else {
            System.out.print(" Нет совпадений");
        }

        System.out.println("\n\n5. Определение символа по его коду");
        char symbol = '\u007A';
        if ((symbol <= 'A') && (symbol > 'Z')) {
            System.out.println("Символ " + symbol + " является большой буквой");
        } else if ((symbol >= '0') && (symbol <= '9')) {
            System.out.println("Символ " + symbol + " является цифрой");
        } else if ((symbol >= 'a') && (symbol <= 'z')) {
            System.out.println("Символ " + symbol + " является маленькой буквой");
        } else {
            System.out.println("Символ " + symbol + " не является не буквой не цифрой");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 310000;
        int credited = 10;
        if (deposit < 100000) {
            credited = 5;
        } else if (deposit < 300000) {
            credited = 7;
        }
        int accrual = credited * (deposit / 100);
        System.out.println("суммa вклада: " + deposit);
        System.out.println("суммa начисления: " + accrual);
        System.out.println("итоговaя суммa: " + (credited+deposit));

        System.out.println("\n7. Определение оценки по предметам");
        int historyPercent = 59;
        int historyGrade = 5;
        if (historyPercent <= 60) {
            historyGrade = 2;
        } else if (historyPercent < 74) {
            historyGrade = 3;
        } else if (historyPercent < 92) {
            historyGrade = 4;
        }
        int csPercent = 92;
        int csGrade = 5;
        if (csPercent <= 60) {
            csGrade = 2;
        } else if (csPercent < 74) {
            csGrade = 3;
        } else if (csPercent < 92) {
            csGrade = 4;
        }
        System.out.println("История: " + historyGrade);
        System.out.println("Программирование: " + csGrade);
        System.out.println("Cредний балл оценок по предметам: " + (csGrade + historyGrade) / 2f);
        System.out.println("средний %% по предметам: " + (csPercent + historyPercent) / 2);

        System.out.println("\n8. Расчет годовой прибыли");
        int monthlyProfit = 13000;
        int monthlyRent = 4000;
        int monthlyCostPrice = 9000;
        int yearlyProfit = 12 * (monthlyProfit - (monthlyRent + monthlyCostPrice));
        if (yearlyProfit > 0) {
            System.out.print("Прибыль за год: +" + yearlyProfit);
        } else {
            System.out.print("Прибыль за год: " + yearlyProfit);
        }
    }
}