package com.startjava.lesson_2_3_4.array;

import java.util.Random;
import java.text.DecimalFormat;

class ArraysTheme {
    public static void main(String[] args) {
        System.out.println(" 1. Реверс значений массива");
        reverseArrayValues();
        System.out.println("\n 2. Произведение элементов массива");
        multiplyArrayElements();
        System.out.println("\n 3. Удаление элементов массива");
        removeArrayElements();
        System.out.println("\n 4. Вывод алфавита лесенкой");
        printAlphabetStepwise();
        System.out.println("\n 5. Заполнение массива уникальными числами");
        addUniqueNumsToArray();
    }

    static void reverseArrayValues() {
        int[] integerArray = {2, 4, 6, 1, 3, 5, 7};
        System.out.print("До реверса: ");
        printIntArray(integerArray);
        int lengthArray = integerArray.length;
        int temp;
        for (int i = 0; i < lengthArray / 2; i++) {
            temp = integerArray[i];
            integerArray[i] = integerArray[lengthArray - i - 1];
            integerArray[lengthArray - i - 1] = temp;
        }
        System.out.print("После реверса: ");
        printIntArray(integerArray);
    }

    static void multiplyArrayElements() {
        int[] numbersInRangeArray = new int[10];
        int lengthArray = numbersInRangeArray.length;
        for(int i = 0; i < lengthArray; i++) {
            numbersInRangeArray[i] = i;
        }
        int product = 1;
        for(int i = 1; i < lengthArray - 1; i++) {
            String sign = i == lengthArray - 2 ? " = " : " * ";
            System.out.print(numbersInRangeArray[i] + sign);
            product *= numbersInRangeArray[i];
        }
        System.out.println(product);
    }

    static void removeArrayElements() {
        double[] realArray = new double[15];
        Random random = new Random();
        int lengthArray = realArray.length;
        for(int i = 1; i < lengthArray; i++) {
            realArray[i] = random.nextDouble();
        }
        printDoubleArray(realArray);
        int middleNumber = lengthArray / 2;
        int countZeros = 0;
        for(int i = 1; i < lengthArray; i++) {
            if (realArray[i] > realArray[middleNumber]) {
                realArray[i] = 0;
                countZeros++;
            }
        }
        printDoubleArray(realArray);
        System.out.println("количество обнуленных ячеек: " + countZeros);
    }

    static void printAlphabetStepwise() {
        char[] capitalLatinLetterArray = new char[26];
        int lengthArray = capitalLatinLetterArray.length;
        for (int i = 0; i < lengthArray; i++) {
            capitalLatinLetterArray[i] = (char) ('A' + i);
        }
        for (int i = lengthArray - 1; i >= 0; i--) {
            for (int j = lengthArray - 1; j >= i; j--) {
                System.out.print(capitalLatinLetterArray[j]);
            }
            System.out.println();
        }
    }

    static void addUniqueNumsToArray() {
        int[] uniqueIntegerArray = new int[30];
        int lengthArray = uniqueIntegerArray.length;
        int randomNumber;
        for (int i = 0; i < lengthArray; i++) {
            int count = 0;
            do {
                count = 0;
                randomNumber = (int)(Math.random() * 40 + 60);
                for (int j = 0; j < i; j++) {
                    if (randomNumber == uniqueIntegerArray[j]) {
                        count++;
                    }
                }
            } while (count > 0);
            uniqueIntegerArray[i] = randomNumber;
        }
        bubbleSort(uniqueIntegerArray);
        for(int i = 0; i < lengthArray; i++) {
            System.out.print(uniqueIntegerArray[i]);
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
