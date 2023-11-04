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
            if (isGuessed(player1, targetNum, scanner)) {
                return true;
            }
            if (isGuessed(player2, targetNum, scanner)) {
                return true;
            }
        } while (true);
    }

    private boolean isGuessed(Player player, int targetNum, Scanner scanner) {
        player.setNum(guessNum(scanner, player));
        if (player.getNum() < targetNum) {
            System.out.println("Число " + player.getNum() + " меньше того, что загадал компьютер");
        } else if (player.getNum() > targetNum) {
            System.out.println("Число " + player.getNum() + " больше того, что загадал компьютер");
        } 
        if ((player.getNum() < targetNum) || (player.getNum() > targetNum)) {
            return false;
        }
        System.out.println(player.getName() + " победитель!!!");
        return true;
    }

    private int guessNum(Scanner scanner, Player player) {
        System.out.println(player.getName() + " введите целое число от 0 до 100: ");
        return scanner.nextInt();
    }
}