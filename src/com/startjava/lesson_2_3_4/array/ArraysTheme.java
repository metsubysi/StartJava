package com.startjava.lesson_2_3_4.array;

import java.util.Random;
import java.text.DecimalFormat;

class ArraysTheme {
    public static void main(String[] args) {
        System.out.println(" 1. Реверс значений массива");
        reverseArrayValues();
        System.out.println("\n 2. Произведение элементов массива");
        calculateArrayProduct();
        System.out.println("\n 3. Удаление элементов массива");
        removeArrayElement();
        System.out.println("\n 4. Вывод алфавита лесенкой");
        printAlphabetStepwise();
        System.out.println("\n 5. Заполнение массива уникальными числами");
        fillArrayWithUniqueNumbers();
    }

    static void reverseArrayValues() {
        int[] array = {2, 4, 6, 1, 3, 5, 7};
        int[] arrayRevers = new int[7];
        int i = 6;
        for (int a : array) {
            arrayRevers[i] = a;
            i--;
        }
        System.out.print("До реверса: ");
        printIntArray(array);
        System.out.print("После реверса: ");
        printIntArray(arrayRevers);
    }

    static void calculateArrayProduct() {
        int[] array = new int[10];
        for(int i = 0; i < 10; i++) {
            array[i] = i;
        }
        int product = 1;
        for(int i = 1; i < 9; i++) {
            if (i == 8) {
                System.out.print(array[i] + " = ");
            } else {
                System.out.print(array[i] + " * ");
            }
            product *= array[i];
        }
        System.out.println(product);
    }

    static void removeArrayElement() {
        double[] array = new double[15];
        Random random = new Random();
        for(int i = 1; i < 15; i++) {
            array[i] = random.nextDouble();
        }
        printDoubleArray(array);
        int middleNumber = array.length / 2;
        int countResettableElements = 0;
        for(int i = 1; i < 15; i++) {
            if (array[i] > array[middleNumber]) {
                array[i] = 0;
                countResettableElements++;
            }
        }
        printDoubleArray(array);
        System.out.println("количество обнуленных ячеек: " + countResettableElements);
    }

    static void printAlphabetStepwise() {
        char[] array = new char[26];
        for (int i = 0; i < 26; i++) {
            array[i] = (char) ('A' + i);
        }
        for (int i = 25; i >= 0; i--) {
            for (int j = 25; j >= i; j--) {
                System.out.print(array[j]);
            }
            System.out.println();
        }
    }

    static void fillArrayWithUniqueNumbers() {
        int[] array = new int[30];
        for (int i = 0; i < 30; i++) {
            int count = 0;
            do {
                count = 0;
                array[i] = (int)(Math.random() * 40 + 60);
                for (int j = 0; j < i; j++) {
                    if (array[i] == array[j]) {
                        count++;
                    }
                }
            } while (count > 0);
        }
        bubbleSort(array);
        for(int i = 0; i < 30; i++) {
            System.out.print(array[i]);
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }

    static void printIntArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print(array[i]);
            } else {
                System.out.print(", " + array[i]);
            }
        }
        System.out.println("]");
    }
    
    static void printDoubleArray(double[] array) {
        DecimalFormat decimalFormat = new DecimalFormat("#0.000");
        String formattedElement;
        for (int i = 0; i < array.length; i++) {
            formattedElement = decimalFormat.format(array[i]);
            if (i == 0) {
                System.out.print(formattedElement);
            } else if (i == 8){
                System.out.print("\n" + formattedElement);
            } else {
                System.out.print(", " + formattedElement);
            }
        }
        System.out.println();
    }

    static void bubbleSort(int[] array) {
        int length = array.length; int h;
        for(int i = 0; i < length - 1; i++) {
            for(int j = 0; j < length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
