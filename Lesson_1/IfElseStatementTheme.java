class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        boolean genderIsMale = true;
        int age = 17;
        float height = 1.9f;
        char firstLetter;
        if (!genderIsMale) {
            System.out.println("Женский пол");
        }
            else {
                System.out.println("Myжскoй пол");
            }            
        if (age > 18) {
            System.out.println("Cовершеннолетний");
        }
            else {
                System.out.println("Hесовершеннолетний");
            }
        if (height < 1.8) {
            System.out.println("Hизкий");
        }
            else {
                System.out.println("Высокий");
            }
        firstLetter = "Serhii".charAt(0);
        if (firstLetter == 'M') {
            System.out.println("Первая буква имени M");
        } else if (firstLetter == 'I') {
                System.out.println("Первая буква имени I");
            } else {
                System.out.printf("Первая буква имени: " + firstLetter+ "\n \n");
            }

        System.out.println("2. Поиск большего числа");
        int a = 1111, b = 111;
        if (a > b) {
            System.out.println("a > b \n");
        } else {
            if (a < b) {
                System.out.println("a < b \n");
            } else {
                System.out.println("a = b \n");
        }}

        System.out.println("3. Проверка числа");
        int checkNumber = -11;
        if (checkNumber == 0) {
            System.out.println("Число является: 0 \n");
            } else {
                if (checkNumber < 0) {
                    System.out.printf("Число "+checkNumber+" является отрицательным");
                    } else {
                        System.out.printf("Число "+checkNumber+" является положительным");
                    }
                if ((checkNumber % 2) == 0) {
                    System.out.printf(" и чётным \n");
                    } else {
                        System.out.printf(" и не чётным \n\n");
                    }}

        System.out.println("4. Поиск одинаковых цифр в числах");
        int num_1 = 234, num_2 = 234, countNum = 0;
        String thesameDigit = "", numberPlace = "";
        if ((num_1 / 100) == (num_2 / 100)) {
            thesameDigit = thesameDigit + (num_1 / 100) + " ";
            numberPlace = numberPlace + "100-й ";
            countNum ++;
        }
        if (((num_1 % 100)/10) == ((num_2 % 100)/10)) {
            thesameDigit = thesameDigit + ((num_2 % 100)/10) + " ";
            numberPlace = numberPlace + "10-й ";
            countNum ++;
        }
        if ((num_1 % 10) == (num_2 % 10)) {
            thesameDigit = thesameDigit + (num_2 % 10) + " ";
            numberPlace = numberPlace + "1-й ";
            countNum ++;
        }
        if (countNum > 0) {
            System.out.printf("В числах "+ num_1 + " и " + num_2 + "\n");
            System.out.printf("Одинаковые циыры: " + thesameDigit+"\n");
            System.out.printf("Разряды: " + numberPlace+"\n\n");
        } else {
            System.out.printf(" Нет совпадений \n\n");
        }

        System.out.println("5. Определение символа по его коду");
        char symbol = '\u0057';
        if ((symbol < '\u005B') && ((symbol > '\u0040'))) {
            System.out.printf("Смвол " + symbol + " является большой буквой \n\n");
        } else {
            if ((symbol > '\u002F') && ((symbol < '\u003A'))) {
                System.out.printf("Символ " + symbol + " является цифрой\n\n");
            } else {
                if ((symbol > '\u0060') && ((symbol < '\u007B'))) {
                    System.out.printf("Символ " + symbol + " является маленькой буквой\n\n");
                } else {
                    System.out.printf("Символ " + symbol + " не является не буквой не цифрой \n\n");
                }
            }
        }

        System.out.println("6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 310000, credited = 0;
        if (deposit < 100000) {
            credited = (deposit / 100) * 5;
        } else {
            if (deposit < 300000) {
                credited = (deposit / 100) * 7;
            } else {
                credited = (deposit / 100) * 10;
            }
        }
        System.out.printf("суммa вклада: " + deposit + "\n");
        System.out.printf("суммa начисленния: " + credited + "\n");
        System.out.printf("итоговaя суммa: " + (credited+deposit) + "\n\n");

        System.out.println("7. Определение оценки по предметам");
        int historyPers = 59, programPers = 92, historyPoint = 0, programPoint = 0;
        if (historyPers <= 60) {historyPoint = 2;}
        if (historyPers > 60) {historyPoint = 3;}
        if (historyPers > 73) {historyPoint = 4;}
        if (historyPers > 91) {historyPoint = 5;}
        if (programPers <= 60) {programPoint = 2;}
        if (programPers > 60) {programPoint = 3;}
        if (programPers > 73) {programPoint = 4;}
        if (programPers > 91) {programPoint = 5;}
        System.out.printf("История: " + historyPoint + "\n");
        System.out.printf("Программирование: " + programPoint + "\n");
        System.out.printf("Cредний балл оценок по предметам: " + (programPoint + historyPoint)/2f + "\n");
        System.out.printf("средний %% по предметам: " + (programPers + historyPers)/2 + "\n\n");

        System.out.println("8. Расчет годовой прибыли");
        int monthlyProfit = 13000, monthlyRent = 4000, monthlyCostPrice = 9000, yearlyProfit;
        yearlyProfit = (monthlyProfit * 12) - ((monthlyRent + monthlyCostPrice) * 12);
        if (yearlyProfit > 0) {
            System.out.printf("Прибыль за год: +" + yearlyProfit);
        } else {
            System.out.printf("Прибыль за год: " + yearlyProfit);
        }


    }
}