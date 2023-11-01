import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя игрока - 1: ");
        Player player1 = new Player(scanner.next());
        System.out.print("Введите имя игрока - 2: ");
        Player player2 = new Player(scanner.next());
        GuessNumber guessNumber = new GuessNumber(player1, player2);
        String answer;
        do {
            guessNumber.play();
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.next();
            } while (!answer.equalsIgnoreCase("no") && !answer.equalsIgnoreCase("yes"));
        } while (answer.equalsIgnoreCase("yes"));
    }
}