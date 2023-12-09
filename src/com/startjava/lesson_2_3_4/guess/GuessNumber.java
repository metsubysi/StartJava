package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public boolean play() {
        int targetNum = (int) (Math.random() * 100) + 1;
        do {
            if ((isGuessed(player1, targetNum)) && (player1.getAttemptsCount() != 10)) {
                finish(player1);
                System.out.println();
                finish(player2);
                return true;
            }
            if (isGuessed(player2, targetNum)) {
                finish(player1);
                System.out.println();
                finish(player2);
                return true;
            }
        } while (true);
    }

    private boolean isGuessed(Player player, int targetNum) {
        boolean isSetNum = false;
        do {
            Scanner scanner = new Scanner(System.in);
            int guessNumValue = guessNum(scanner, player);
            if ((guessNumValue < 1) || (guessNumValue > 100)) {
                System.out.println("Введённое значение не удовлетворяет условию.");
            } else {
                player.setNum(guessNumValue);
                isSetNum = true;
            }
        } while (!isSetNum);
        if (player.getNum() == targetNum) {
            System.out.println("Игрок " + player.getName() + " угадал " +
                    player.getNum() + " с " + (player.getAttemptsCount() + 1) + " попытки");
            player.incrementAttemptsCount();
            return true;
        }

        if (player.getAttemptsCount() == 9) {
            System.out.println("У игрока " + player.getName() + " закончились попытки");
            player.incrementAttemptsCount();
            return true;
        }
        String result = (player.getNum() < targetNum) ? " меньше" : " больше";
        System.out.println("Число " + player.getNum() + result + " того, что загадал компьютер");
        player.incrementAttemptsCount();
        return false;
    }

    private int guessNum(Scanner scanner, Player player) {
        try {
            System.out.println(player.getName() + " введите целое число от 0 до 100: ");
            return scanner.nextInt();
        } catch (Exception e) { System.out.println("ff"); }
        return 0;
    }

    private void finish(Player player) {
        System.out.print("Числа которые вводил игрок " + player.getName() + ": ");
        printNums(player);
        player.clear();
        player.setAttemptsCount(0);
    }

    private void printNums(Player player) {
        int a = player.getAttemptsCount();
        int[] nums = Arrays.copyOfRange(player.getNums(), 0, a);
        for(int i = 0; i < a; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}