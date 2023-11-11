package com.startjava.lesson_1.base;

public class VariableNamesTheme {
    public static void main(String[] args) {
        System.out.println("\n   1. Разные переменные");
        //цифра
        int digit = 5; 
        //сумма чисел
        int sumNums = 11;
        //произведение цифр
        int multiplication = 30; 
        //максимальное число
        int maxNum = 6; 
        //количество десятков
        int tensCount = 3; 
        //вес собаки
        float dogWeight = 5.6f; 
        //исходное число
        int startNum = 6;
        //процент по вкладу
        short percent = 47; 
        //(переменная хранит символ) &
        String ampersand = "&"; 
        //код ошибки
        int errorCode = 0; 
        //тип сообщения
        String messageType = "Тип - A"; 
        //число нулей
        short zeroCount = 2; 
        //уникальное число
        int uniqueNum = 11; 
        //случайное число
        double randomNum = Math.random(); 
        //математическое выражение
        String mathExpression = "x*x+3*x-67"; 
        //выбор чего-либо
        int choice = 0; 
        //количество очков (в игре)
        int score = 99; 
        //максимальная длина строки
        int maxLengthLine = 56; 
        //пункт меню
        String menuItem = "menu item"; 
        //стоимость кофе на вынос
        float priceCoffeTogo = 1.49f; 
        //дата начала (чего-либо)
        String startDate = "03.10.2022"; 
        //окончание диапазона
        int endRange = 11; 
        //полное имя работника месяца
        String fullNameMonthWorker = "Игнатов Лукьян Ростиславович"; 
        //заголовок электронной книги
        String ebookTitle = "'book name'"; 
        //размер
        short size = 41; 
        //вместимость (чего-либо)
        float capacity = 1.5f; 
        //счетчик
        int counter = 0; 
        //путь до файла
        String filePath = "C://ProgramFiles//rex.java";
         //количество чисел в каждой строке
        int numInRow = 1; 

        System.out.println("цифра = " + digit);
        System.out.println("сумма чисел = " + sumNums);
        System.out.println("произведение цифр = " + multiplication);
        System.out.println("максимальное число = " + maxNum);
        System.out.println("количество десятков = " + tensCount);
        System.out.println("вес собаки = " + dogWeight + " кг.");
        System.out.println("исходное число = " + startNum);
        System.out.println("процент по вкладу = " + percent);
        System.out.println("(переменная хранит символ) &: " + ampersand);
        System.out.println("код ошибки: " + errorCode);
        System.out.println("тип сообщения: " + messageType);
        System.out.println("число нулей = " + zeroCount);
        System.out.println("уникальное число = " + uniqueNum);
        System.out.println("случайное число = " + randomNum);
        System.out.println("математическое выражение: " + mathExpression);
        System.out.println("выбор чего-либо = " + choice);
        System.out.println("количество очков (в игре) = " + score);
        System.out.println("максимальная длина строки = " + maxLengthLine);
        System.out.println("пункт меню: " + menuItem);
        System.out.println("стоимость кофе на вынос = " + priceCoffeTogo);
        System.out.println("дата начала: " + startDate);
        System.out.println("окончание диапазона: " + endRange);
        System.out.println("полное имя работника месяца: " + fullNameMonthWorker);
        System.out.println("заголовок электронной книги: " + ebookTitle);
        System.out.println("размер = " + size);
        System.out.println("вместимость (чего-либо) = " + capacity + " L");
        System.out.println("счетчик = " + counter);
        System.out.println("путь до файла: " + filePath);
        System.out.println("количество чисел в каждой строке = " + numInRow + "\n");

        System.out.println("    2. boolean-переменные");
        //сотни равны?
        boolean isEqualHundreads = false; 
        //компьютер включен?
        boolean isComputerOn = true; 
        //есть равные цифры?
        boolean isEqualNum = false; 
        //(что-либо) создано?
        boolean isCreate = true; 
        //(что-либо) пусто?
        boolean isEmpty = false; 
        //(что-либо) активный?
        boolean isActive = true; 
        //новый?
        boolean isNew = false; 
        //электронная почта действительная?
        boolean isEmailValid = true; 
        //имеются уникальные строки?
        boolean isUniqueLines = true; 

        System.out.println("сотни равны?: " + isEqualHundreads);
        System.out.println("компьютер включен?: " + isComputerOn);
        System.out.println("есть равные цифры?: " + isEqualNum);
        System.out.println("(что-либо) создано?: "+ isCreate);
        System.out.println("(что-либо) пусто?: "+ isEmpty);
        System.out.println("(что-либо) активный?: "+ isActive);
        System.out.println("новый?: "+ isNew);
        System.out.println("электронная почта действительная?: "+ isEmailValid);
        System.out.println("имеются уникальные строки?: "+ isUniqueLines +"\n");

        System.out.println("    3. Аббревиатуры");
        //старый universally unique identifier
        String oldUuid = "UUID"; 
        //производитель оперативной памяти
        String ddrMaker = "Kingston"; 
        //емкость жесткого диска
        String hddSize = "GB"; 
        //протокол передачи гипертекста
        String http = "http"; 
        //сокращенный uniform resource locator
        String shortUrl = "URL"; 
        //новый идентификатор клиента
        String newId = "new client ID"; 
        //кодировка american standard code for information interchange
        String ascii = "ASCII"; 
        
        System.out.println("старый universally unique identifier: "+ oldUuid);
        System.out.println("производитель оперативной памяти: "+ ddrMaker);
        System.out.println("емкость жесткого диска: "+ hddSize);
        System.out.println("протокол передачи гипертекста: "+ http);
        System.out.println("сокращенный uniform resource locator: "+ shortUrl);
        System.out.println("новый идентификатор клиента: "+ newId);
        System.out.println("кодировка american standard code for information interchange: "+ ascii);
    }
}