package com.startjava.lesson_2_3_4.guess;

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
        Scanner scanner = new Scanner(System.in);
        do {
            if ((isGuessed(player1, targetNum, scanner)) && (player1.getAttemptsCount() != 9)) {
                finish(player1);
                System.out.println();
                finish(player2);
                return true;
            }
            if (isGuessed(player2, targetNum, scanner)) {
                finish(player1);
                System.out.println();
                finish(player2);
                return true;
            }
        } while (true);
    }

    private boolean isGuessed(Player player, int targetNum, Scanner scanner) {
        player.setNum(guessNum(scanner, player));
        if (player.getNum() == targetNum) {
            System.out.println("Игрок " + player.getName() + " угадал " +
                    player.getNum() + " с " + (player.getAttemptsCount() + 1) + " попытки");
            player.attemptsCount++;
            return true; 
        }

        if (player.getAttemptsCount() == 9) {
            System.out.println("У игрока" + player.getNum() + " закончились попытки");
            player.attemptsCount++;
            return true;
        }
        if (player.getNum() < targetNum) {
            System.out.println("Число " + player.getNum() + " меньше того, что загадал компьютер");
        } else {
            System.out.println("Число " + player.getNum() + " больше того, что загадал компьютер");
        }
        player.attemptsCount++;
        return false;
    }

    private int guessNum(Scanner scanner, Player player) {
        System.out.println(player.getName() + " введите целое число от 0 до 100: ");
        return scanner.nextInt();
    }

    private void finish(Player player) {
        System.out.print("Числа которые вводил игрок " + player.getName() + ": ");
        player.printNums();
        player.arrayNull();
        player.setAttemptsCount(0);
    }


}