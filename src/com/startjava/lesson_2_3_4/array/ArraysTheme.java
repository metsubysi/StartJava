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
        printAlphabetWithStairs();
        System.out.println("\n 5. Заполнение массива уникальными числами");
        fillArrayUniqueNumbers();
    }

    static void reverseArrayValues() {
        int[] numbers = {2, 4, 6, 1, 3, 5, 7};
        System.out.print("До реверса: ");
        printInt(numbers);
        int length = numbers.length;
        for (int i = 0; i < length; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[length--];
            numbers[length] = temp;
        }
        System.out.print("После реверса: ");
        printInt(numbers);
    }

    static void multiplyArrayElements() {
        int[] multipliers = new int[10];
        int length = multipliers.length;
        for(int i = 0; i < length; i++) {
            multipliers[i] = i;
        }
        int product = 1;
        for(int i = 1; i < length - 1; i++) {
            String sign = i == length - 2 ? " = " : " * ";
            System.out.print(multipliers[i] + sign);
            product *= multipliers[i];
        }
        System.out.println(product);
    }

    static void removeArrayElements() {
        double[] realNumbers = new double[15];
        Random random = new Random();
        int length = realNumbers.length;
        for(int i = 1; i < length; i++) {
            realNumbers[i] = random.nextDouble();
        }
        printDouble(realNumbers);
        double middleNumber = realNumbers[length / 2];
        int countZeros = 0;
        for(int i = 1; i < length; i++) {
            if (realNumbers[i] > middleNumber) {
                realNumbers[i] = 0;
                countZeros++;
            }
        }
        printDouble(realNumbers);
        System.out.println("количество обнуленных ячеек: " + countZeros);
    }

    static void printAlphabetWithStairs() {
        char[] alphabet = new char[26];
        int length = alphabet.length;
        for (int i = 0; i < length; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        for (int i = length - 1; i >= 0; i--) {
            for (int j = length - 1; j >= i; j--) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }
    }

    static void fillArrayUniqueNumbers() {
        int[] uniqueNumbers = new int[30];
        int length = uniqueNumbers.length;
        int randomNumber;
        for (int i = 0; i < length; i++) {
            int count = 0;
            do {
                count = 0;
                randomNumber = (int) (Math.random() * 40 + 60);
                for (int j = 0; j < i; j++) {
                    if (randomNumber == uniqueNumbers[j]) {
                        count++;
                    }
                }
            } while (count > 0);
            uniqueNumbers[i] = randomNumber;
        }
        bubbleSort(uniqueNumbers);
        for(int i = 0; i < length; i++) {
            System.out.print(uniqueNumbers[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }

    static void printInt(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            String sign = (i == 0) ? "" : ", ";
            System.out.print(sign + array[i]);
        }
        System.out.println("]");
    }
    
    static void printDouble(double[] array) {
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
