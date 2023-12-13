package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {
    public static void main(String[] args) {
        Player[] players = new Player[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < players.length; i++) {
            System.out.print("Введите имя " + (i+1) + "-го игрока: ");
            players[i] = new Player(scanner.next());
        }
        shuffle(players);
        GuessNumber game = new GuessNumber(players);
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                System.out.println("Игра началась! У каждого игрока по 10 попыток.");
                game.play();
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.next().toLowerCase();
        } while (!answer.equals("no"));
    }

    private static void shuffle(Player[] players) {
        Random random = new Random();
        for(int i = players.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            Player temp = players[i];
            players[i] = players[index];
            players[index] = temp;
        }
    }
}