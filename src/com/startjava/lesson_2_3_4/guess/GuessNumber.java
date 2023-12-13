package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

import java.util.Scanner;

public class GuessNumber {
    private Player[] player;
    private int gameNumber = 0;

    public GuessNumber(Player[] player) {
        this.player = player;
    }

    public boolean play() {
        int targetNum = (int) (Math.random() * 100) + 1;
        do {
            for (int i = 0; i < player.length; i++) {
                if (isGuessed(player[i], targetNum)) {
                    if ((player[i].getAttemptsCount() != 10)) {
                        player[i].wins++;
                        for (int j = 0; j < player.length; j++) {
                            finish(player[j]);
                            System.out.println();
                            gameNumber++;
                            if (gameNumber == 3) {
                                gameNumber = 0;
                                printWins(player);
                            }
                        }
                        return true;
                    } else if (i == 2) {
                        for (int j = 0; j < player.length; j++) {
                            finish(player[j]);
                            System.out.println();
                        }
                        return true;
                    }
                }
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
        } catch (Exception e) {}
        return 0;
    }

    private void finish(Player player) {
        System.out.print("Числа которые вводил игрок " + player.getName() + ": ");
        printNums(player);
        player.clear();
        player.setAttemptsCount(0);
    }

    private void printWins(Player[] player) {
        int max = player[0].getWins();
        int j = 0;
        for (int i = 1; i < player.length; i++) {
            if (player[i].wins > max) {
                max = player[i].wins;
                j = i;
            }
        }
        System.out.println("по результатам трёх раундов победил игрок " + player[j].getName());
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