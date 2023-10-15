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
        System.out.println("CPU - "+cpu+" Ghz"+" (Частота процессора)");
        System.out.println("cores - "+cores+" pcs" + " (количество ядер процессора)");
        System.out.println("Is CPU Intel - "+isIntel+" (является ли данный процессор фирмы Intel)");
        System.out.println("Manufacturer - "+nameMaker+" (первая буква названия производителя)");
        System.out.println("RAM - "+ram+" Gb"+" (объём оперативной памяти)");
        System.out.println("HDD - "+hdd+" Gb"+" (объём жёсткого диска)");
        System.out.println("Video CPU - "+videoCpu+" Mhz"+" (Частота процессора видео карты)");
        System.out.println("Video RAM - "+videoRam+" Gb"+" (объём оперативной памяти видео карты) \n");

        System.out.println("2. Расчет стоимости товара со скидкой");
        float penPrice = 100.00f, bookPrice = 200.00f, finalPrice,discount, discountPrice;
        finalPrice = penPrice + bookPrice;
        discount = finalPrice*0.11f;
        discountPrice = finalPrice - discount;
        System.out.println("Общая стоимость товаров без скидки - " + finalPrice+" Руб.");
        System.out.println("Сумма скидки - " + discount + " Руб.");
        System.out.println("Общая стоимость товаров со скидкой - " + discountPrice + " Руб." + "\n");

        System.out.println("3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a");                                                  
        System.out.println("   J   a a  v   v  a a");                                                 
        System.out.println("J  J  aaaaa  V V  aaaaa");                                                
        System.out.println(" JJ  a     a  V  a     a");
        System.out.println("");

        System.out.println("4. Вывод min и max значений целых числовых типов");
        byte byteNum = Byte.MAX_VALUE;
        short shortNum = Short.MAX_VALUE;
        int intNum = Integer.MAX_VALUE;
        long longNum = Long.MAX_VALUE;
        System.out.println("первоначальное значение типа byte = " + byteNum);
        byteNum++;
        System.out.println("значение после инкремента типа byte на единицу = " + byteNum);
        byteNum--;
        System.out.println("значение после декремента типа byte на единицу = " + byteNum);
        System.out.println("первоначальное значение типа short = " + shortNum);
        shortNum++;
        System.out.println("значение после инкремента типа short на единицу = " + shortNum);
        shortNum--;
        System.out.println("значение после декремента типа short на единицу = " + shortNum);
        System.out.println("первоначальное значение типа int = " + intNum);
        intNum++;
        System.out.println("значение после инкремента типа int на единицу = " + intNum);
        intNum--;
        System.out.println("значение после декремента типа int на единицу = " + intNum);
        System.out.println("первоначальное значение типа long = " + longNum);
        longNum++;
        System.out.println("значение после инкремента типа long на единицу = " + longNum);
        longNum--;
        System.out.println("значение после декремента типа long на единицу = " + longNum + "\n");

        System.out.println("5. Перестановка значений переменных");
        int a = 2,b = 5,c;
        System.out.println("C помощью третьей переменной");
        System.out.println("a = " + a + "; b = " + b);
        c = a; a = b; b = c;
        System.out.println("a = " + a + "; b = " + b);
        System.out.println("C помощью арифметических операций");
        System.out.println("a = " + a + "; b = " + b);
        a = a + b; b = a - b; a = a - b;
        System.out.println("a = " + a + "; b = " + b);
        System.out.println("с помощью побитовой операции");
        System.out.println("a = " + a + "; b = " + b);
        a = a ^ b; b = a ^ b; a = a ^ b;
        System.out.println("a = " + a + "; b = "+b+" \n");

        System.out.printf("6. Вывод символов и их кодов\n");
        char symbol_36 = '$',
            symbol_42 = '*',
            symbol_64 = '@',
            symbol_124 = '|',
            symbol_126 = '~';
        int num_36, num_42, num_64, num_124, num_126;
        num_36 = (int) symbol_36; num_42 = (int) symbol_42; num_64 = (int) symbol_64;
        num_124 = (int) symbol_124; num_126 = (int) symbol_126;
        System.out.println(num_36 + ": " + symbol_36);
        System.out.println(num_42 + ": " + symbol_42);
        System.out.println(num_64 + ": " + symbol_64);
        System.out.println(num_124 + ": " + symbol_124);
        System.out.println(num_126 + ": " + symbol_126 + "\n");

        System.out.println("7. Вывод в консоль ASCII-арт Дюка");
        char sym_1 = '/',
            sym_2 = '\\',
            sym_3 = '(',
            sym_4 = ')',
            sym_5 = '_';
        System.out.println("    "+sym_1+""+sym_2);                                                                                                                                       
        System.out.println("   "+sym_1+"  "+sym_2);                                                                                                                                      
        System.out.println("  "+sym_1+""+sym_5+""+sym_3+" "+sym_4+""+sym_2);                                                                                                                                     
        System.out.println(" "+sym_1+"      "+sym_2);                                                                                                                                    
        System.out.println(""+sym_1+""+sym_5+""+sym_5+""+sym_5+""+sym_5+""+sym_1+""+sym_2+""+sym_5+""+sym_5+""+sym_2+"\n");

        System.out.println("8. Вывод количества сотен, десятков и единиц числа");
        int n = 123, n1, n2, n3, summaOfDigits, multiplicationOfDigits;
        n1 = n / 100;
        n2 = n % 100 / 10;
        n3 = n % 10;
        summaOfDigits = n1 + n2 + n3; multiplicationOfDigits = n1 * n2 * n3;
        System.out.println("Число "+n+" содержит:");
        System.out.println("сотен - "+n1);
        System.out.println("десятков - "+n2);
        System.out.println("единиц - "+n3);
        System.out.println("Сумма его цифр = "+summaOfDigits);
        System.out.println("Произведение = "+multiplicationOfDigits+"\n");

        System.out.println("9. Вывод времени");
        int all_seconds = 86399, hours, minutes, seconds;
        hours = all_seconds / 3600;
        minutes = all_seconds % 3600 / 60;
        seconds = all_seconds % 60;
        System.out.println(hours+":"+minutes+":"+seconds);
    }
} 