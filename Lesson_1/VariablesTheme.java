class VariablesTheme {
    public static void main(String[] args) {
        System.out.printf("1. Вывод характеристик компьютера \n");
        double cpu = 2.8;
        float videoCpu = 850.0f;
        long hdd = 512;
        int ram = 8;
        short videoRam = 2;
        byte cores = 4;
        boolean isIntel = true;
        char nameMaker = 'I';
        
        System.out.println("CPU - " + cpu + " Ghz" + " (Частота процессора)");
        System.out.println("cores - " + cores + " pcs" + " (количество ядер процессора)");
        System.out.println("Is CPU Intel - " + isIntel + " (является ли данный процессор фирмы Intel)");
        System.out.println("Manufacturer - " + nameMaker + " (первая буква названия производителя)");
        System.out.println("RAM - " + ram + " Gb" + " (объём оперативной памяти)");
        System.out.println("HDD - " + hdd + " Gb" + " (объём жёсткого диска)");
        System.out.println("Video CPU - " + videoCpu + " Mhz" + " (Частота процессора видео карты)");
        System.out.println("Video RAM - " + videoRam + " Gb" + " (объём оперативной памяти видео карты) \n");

        System.out.println("2. Расчет стоимости товара со скидкой");
        float penPrice = 100.00f;
        float bookPrice = 200.00f;
        float finalPrice = penPrice + bookPrice;
        float discount = finalPrice * 0.11f;
        float discountPrice = finalPrice - discount;
        
        System.out.println("Общая стоимость товаров без скидки - " + finalPrice + " Руб.");
        System.out.println("Сумма скидки - " + discount + " Руб.");
        System.out.println("Общая стоимость товаров со скидкой - " + discountPrice + " Руб.\n");

        System.out.println("3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a");                                                  
        System.out.println("   J   a a  v   v  a a");                                                 
        System.out.println("J  J  aaaaa  V V  aaaaa");                                                
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte byteNum = Byte.MAX_VALUE;
        short shortNum = Short.MAX_VALUE;
        int intNum = Integer.MAX_VALUE;
        long longNum = Long.MAX_VALUE;
        
        System.out.println("первоначальное значение типа byte = " + byteNum);
        System.out.println("значение после инкремента типа byte на единицу = " + ++byteNum);
        System.out.println("значение после декремента типа byte на единицу = " + --byteNum);
        System.out.println("первоначальное значение типа short = " + shortNum);
        System.out.println("значение после инкремента типа short на единицу = " + ++shortNum);
        System.out.println("значение после декремента типа short на единицу = " + --shortNum);
        System.out.println("первоначальное значение типа int = " + intNum);
        System.out.println("значение после инкремента типа int на единицу = " + ++intNum);
        System.out.println("значение после декремента типа int на единицу = " + --intNum);
        System.out.println("первоначальное значение типа long = " + longNum);
        System.out.println("значение после инкремента типа long на единицу = " + ++longNum);
        System.out.println("значение после декремента типа long на единицу = " + --longNum + "\n");

        System.out.println("5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        int c = a;
        
        System.out.println("C помощью третьей переменной");
        System.out.println("a = " + a + "; b = " + b);
        a = b; 
        b = c;
        System.out.println("a = " + a + "; b = " + b);
        System.out.println("C помощью арифметических операций");
        System.out.println("a = " + a + "; b = " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("a = " + a + "; b = " + b);
        System.out.println("с помощью побитовой операции");
        System.out.println("a = " + a + "; b = " + b);
        a ^= b; 
        b = a ^ b; 
        a ^= b;
        System.out.println("a = " + a + "; b = " + b + " \n");

        System.out.printf("6. Вывод символов и их кодов\n");
        char dollar = '$';
        char asterisk = '*';
        char at = '@';
        char pipe = '|';
        char tilde = '~';
        
        System.out.println((int) dollar + ": " + dollar);
        System.out.println((int) asterisk + ": " + asterisk);
        System.out.println((int) at + ": " + at);
        System.out.println((int) pipe + ": " + pipe);
        System.out.println((int) tilde + ": " + tilde + "\n");

        System.out.println("7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char left = '(';
        char right = ')';
        char underscore = '_';
        
        System.out.println("    " + slash + backslash);                                                                                                                                       
        System.out.println("   " + slash + "  " + backslash);                                                                                                                                      
        System.out.println("  " + slash + underscore + left + " " + right + backslash);                                                                                                                                     
        System.out.println(" " + slash + "      " + backslash);                                                                                                                                    
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash
                              + backslash + underscore + underscore + backslash + "\n");

        System.out.println("8. Вывод количества сотен, десятков и единиц числа");
        int number = 123; 
        int hundreds = number / 100; 
        int tens = number % 100 / 10; 
        int ones = number % 10; 
        int sumDigits = hundreds + tens + ones; 
        int productDigits = ones * tens * hundreds;
        
        System.out.println("Число " + number + " содержит:");
        System.out.println("сотен - " + hundreds);
        System.out.println("десятков - " + tens);
        System.out.println("единиц - " + ones);
        System.out.println("Сумма его цифр = " + sumDigits);
        System.out.println("Произведение = " + productDigits + "\n");

        System.out.println("9. Вывод времени");
        int allSeconds = 86399;
        int hours = allSeconds / 3600;
        int minutes = allSeconds % 3600 / 60;
        int seconds = allSeconds % 60;
        
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
} 