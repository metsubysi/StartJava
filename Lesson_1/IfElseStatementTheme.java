class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        boolean genderIsMale = true;
        int age = 17;
        float height = 1.9f;
        char firstLetter;
        if (!genderIsMale) {
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
        firstLetter = "Serhii".charAt(0);
        if (firstLetter == 'M') {
            System.out.println("Первая буква имени M");
        } else {
            if (firstLetter == 'I') {
                System.out.println("Первая буква имени I");
            } else {
                System.out.println("Первая буква имени: " + firstLetter);
            }
        }

        System.out.println("\n2. Поиск большего числа");
        int a = 1111;
        int b = 111;
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        System.out.println(" \n3. Проверка числа");
        int checkNumber = -11;
        if (checkNumber == 0) {
            System.out.println("Число является: 0 \n");
            } else if (checkNumber < 0) {
                System.out.print("Число " + checkNumber + " является отрицательным ");
            } else {
                System.out.print("Число " + checkNumber + " является положительным ");
            }
            if ((checkNumber % 2) == 0) {
                System.out.println("и чётным");
            } else {
                System.out.println("и не чётным");
            }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int num1 = 234;
        int num2 = 234;
        int countNum = 0;
        String sameDigits = "";
        String numberPlace = "";
        if ((num1 / 100) == (num2 / 100)) {
            sameDigits = sameDigits + (num1 / 100) + " ";
            numberPlace = numberPlace + "100-й ";
            countNum++;
        }
        if (((num1 % 100) / 10) == ((num2 % 100) / 10)) {
            sameDigits = sameDigits + ((num2 % 100)/10) + " ";
            numberPlace = numberPlace + "10-й ";
            countNum++;
        }
        if ((num1 % 10) == (num2 % 10)) {
            sameDigits = sameDigits + (num2 % 10) + " ";
            numberPlace = numberPlace + "1-й ";
            countNum++;
        }
        if (countNum > 0) {
            System.out.println("В числах "+ num1 + " и " + num2);
            System.out.println("Одинаковые цифры: " + sameDigits);
            System.out.println("Разряды: " + numberPlace);
        } else {
            System.out.println(" Нет совпадений");
        }

        System.out.println("\n5. Определение символа по его коду");
        char symbol = '\u007A';
        if ((symbol < '[') && ((symbol > '@'))) {
            System.out.println("Смвол " + symbol + " является большой буквой\n");
        } else if ((symbol > '/') && ((symbol < ':'))) {
            System.out.println("Символ " + symbol + " является цифрой\n");
        } else if ((symbol > '`') && ((symbol < '{'))) {
            System.out.println("Символ " + symbol + " является маленькой буквой\n");
        } else {
            System.out.println("Символ " + symbol + " не является не буквой не цифрой\n");
        }

        System.out.println("6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 310000;
        int credited = 0;
        if (deposit < 100000) {
            credited = (deposit / 100) * 5;
        } else if (deposit < 300000) {
            credited = (deposit / 100) * 7;
        } else {
            credited = (deposit / 100) * 10;
        }
        System.out.println("суммa вклада: " + deposit);
        System.out.println("суммa начисленния: " + credited);
        System.out.println("итоговaя суммa: " + (credited+deposit));

        System.out.println("\n7. Определение оценки по предметам");
        int historyPercents = 59;
        int csPercents = 92;
        int historyGrade;
        int csGrade;
        if (historyPercents <= 60) {
            historyGrade = 2;
        } else if (historyPercents < 74) {
            historyGrade = 3;
        } else if (historyPercents < 92) {
            historyGrade = 4;
        } else {
            historyGrade = 5;
        }
        if (csPercents <= 60) {
            csGrade = 2;
        } else if (csPercents < 74) {
            csGrade = 3;
        } else if (csPercents < 92) {
            csGrade = 4;
        } else {
            csGrade = 5;
        }
        System.out.println("История: " + historyGrade);
        System.out.println("Программирование: " + csGrade);
        System.out.println("Cредний балл оценок по предметам: " + (csGrade + historyGrade) / 2f);
        System.out.println("средний %% по предметам: " + (csPercents + historyPercents) / 2);

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