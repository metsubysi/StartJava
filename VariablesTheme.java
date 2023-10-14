class VariablesTheme {
    public static void main(String[] args) {
        System.out.printf("1. Вывод характеристик компьютера \n");
        double cpu = 2.8;
        float video_cpu = 850.0f;
        long hdd = 512;
        int ram = 8;
        short video_ram = 2;
        byte cores = 4;
        boolean is_intel = true;
        char name_maker = 'I';
        System.out.printf("CPU - "+cpu+" Ghz"+" (Частота процессора) \n");
        System.out.printf("cores - "+cores+" pcs" + " (количество ядер процессора) \n");
        System.out.printf("Is CPU Intel - "+is_intel+" (является ли данный процессор фирмы Intel) \n");
        System.out.printf("Manufacturer - "+name_maker+" (первая буква названия производителя) \n");
        System.out.printf("RAM - "+ram+" Gb"+" (объём оперативной памяти) \n");
        System.out.printf("HDD - "+hdd+" Gb"+" (объём жёсткого диска) \n");
        System.out.printf("Video CPU - "+video_cpu+" Mhz"+" (Частота процессора видео карты) \n");
        System.out.printf("Video RAM - "+video_ram+" Gb"+" (объём оперативной памяти видео карты) \n \n");

        System.out.printf("2. Расчет стоимости товара со скидкой \n");
        float pen_price = 100.00f, book_price = 200.00f, final_price,discount, discount_price;
        final_price = pen_price + book_price;
        discount = final_price*0.11f;
        discount_price = final_price - discount;
        System.out.printf("Общая стоимость товаров без скидки - "+final_price+" Руб."+"\n");
        System.out.printf("Сумма скидки - "+discount+" Руб."+"\n");
        System.out.printf("Общая стоимость товаров со скидкой - "+discount_price+" Руб."+"\n \n");

        System.out.printf("3. Вывод слова JAVA\n");
        System.out.println("   J    a  v     v  a");                                                  
        System.out.println("   J   a a  v   v  a a");                                                 
        System.out.println("J  J  aaaaa  V V  aaaaa");                                                
        System.out.println(" JJ  a     a  V  a     a");
        System.out.printf("\n");

        System.out.printf("4. Вывод min и max значений целых числовых типов\n");
        byte byte_num = Byte.MAX_VALUE;
        short short_num = Short.MAX_VALUE;
        int int_num = Integer.MAX_VALUE;
        long long_num = Long.MAX_VALUE;
        System.out.printf("первоначальное значение типа byte = "+byte_num+"\n");
        byte_num++;
        System.out.printf("значение после инкремента типа byte на единицу = "+byte_num+"\n");
        byte_num--;
        System.out.printf("значение после декремента типа byte на единицу = "+byte_num+"\n");
        System.out.printf("первоначальное значение типа short = "+short_num+"\n");
        short_num++;
        System.out.printf("значение после инкремента типа short на единицу = "+short_num+"\n");
        short_num--;
        System.out.printf("значение после декремента типа short на единицу = "+short_num+"\n");
        System.out.printf("первоначальное значение типа int = "+int_num+"\n");
        int_num++;
        System.out.printf("значение после инкремента типа int на единицу = "+int_num+"\n");
        int_num--;
        System.out.printf("значение после декремента типа int на единицу = "+int_num+"\n");
        System.out.printf("первоначальное значение типа long = "+long_num+"\n");
        long_num++;
        System.out.printf("значение после инкремента типа long на единицу = "+long_num+"\n");
        long_num--;
        System.out.printf("значение после декремента типа long на единицу = "+long_num+"\n\n");

        System.out.printf("5. Перестановка значений переменных \n");
        int a=2,b=5,c;
        System.out.printf("C помощью третьей переменной \n");
        System.out.printf("a = "+a+"; b = "+b+" \n");
        c = a; a = b; b = c;
        System.out.printf("a = "+a+"; b = "+b+" \n");
        System.out.printf("C помощью арифметических операций\n");
        System.out.printf("a = "+a+"; b = "+b+" \n");
        a = a + b; b = a - b; a = a - b;
        System.out.printf("a = "+a+"; b = "+b+" \n");
        System.out.printf("с помощью побитовой операции \n");
        System.out.printf("a = "+a+"; b = "+b+" \n");
        a = a ^ b; b = a ^ b; a = a ^ b;
        System.out.printf("a = "+a+"; b = "+b+" \n\n");

        System.out.printf("6. Вывод символов и их кодов\n");
        char symbol_36 = '$',
            symbol_42 = '*',
            symbol_64 = '@',
            symbol_124 = '|',
            symbol_126 = '~';
        int num_36, num_42, num_64, num_124, num_126;
        num_36 = (int) symbol_36; num_42 = (int) symbol_42; num_64 = (int) symbol_64;
        num_124 = (int) symbol_124; num_126 = (int) symbol_126;
        System.out.printf(num_36 + ": " + symbol_36 + "\n");
        System.out.printf(num_42 + ": " + symbol_42 + "\n");
        System.out.printf(num_64 + ": " + symbol_64 + "\n");
        System.out.printf(num_124 + ": " + symbol_124 + "\n");
        System.out.printf(num_126 + ": " + symbol_126 + "\n\n");

        System.out.printf("7. Вывод в консоль ASCII-арт Дюка \n");
        char sym_1 = '/',
            sym_2 = '\\',
            sym_3 = '(',
            sym_4 = ')',
            sym_5 = '_';
        System.out.printf("    "+sym_1+""+sym_2+"\n");                                                                                                                                       
        System.out.printf("   "+sym_1+"  "+sym_2+"\n");                                                                                                                                      
        System.out.printf("  "+sym_1+""+sym_5+""+sym_3+" "+sym_4+""+sym_2+"\n");                                                                                                                                     
        System.out.printf(" "+sym_1+"      "+sym_2+"\n");                                                                                                                                    
        System.out.printf(""+sym_1+""+sym_5+""+sym_5+""+sym_5+""+sym_5+""+sym_1+""+sym_2+""+sym_5+""+sym_5+""+sym_2+"\n\n");

        System.out.printf("8. Вывод количества сотен, десятков и единиц числа\n");
        int n = 123, n1, n2, n3, summa_of_digit, proizv_og_digit;
        n1 = n / 100;
        n2 = n % 100 / 10;
        n3 = n % 10;
        summa_of_digit = n1 + n2 + n3; proizv_og_digit = n1 * n2 * n3;
        System.out.printf("Число "+n+" содержит: \n");
        System.out.printf("сотен - "+n1+"\n");
        System.out.printf("десятков - "+n2+"\n");
        System.out.printf("единиц - "+n3+"\n");
        System.out.printf("Сумма его цифр = "+summa_of_digit+"\n");
        System.out.printf("Произведение = "+proizv_og_digit+"\n\n");

        System.out.printf("9. Вывод времени\n");
        int all_seconds = 86399, hours, minutes, seconds;
        hours = all_seconds / 3600;
        minutes = all_seconds % 3600 / 60;
        seconds = all_seconds % 60;
        System.out.printf(hours+":"+minutes+":"+seconds);
    }
} 