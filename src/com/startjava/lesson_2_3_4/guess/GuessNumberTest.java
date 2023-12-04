package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя игрока - 1: ");
        Player player1 = new Player(scanner.next());
        System.out.print("Введите имя игрока - 2: ");
        Player player2 = new Player(scanner.next());
        GuessNumber game = new GuessNumber(player1, player2);
        String answer;
        do {
            System.out.println("Игра началась! У каждого игрока по 10 попыток.");
            game.play();
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.next().toLowerCase();
            } while (!answer.equals("no") && !answer.equals("yes"));
        } while (answer.equals("yes"));
    }
}