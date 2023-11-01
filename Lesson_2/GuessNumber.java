import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        int targetNum = (int) (Math.random() * 100) + 1;
        int playerNum = 1;
        boolean result = true;
        Scanner scanner = new Scanner(System.in);
        do {
            if (isGuessed(player1, targetNum, scanner)) {
                if (!isGuessed(player2, targetNum, scanner)) {
                    result = false;
                }
            } else {
                result = false;
            }
        } while (result);
    }

    private boolean isGuessed(Player player, int targetNum, Scanner scanner) {
        System.out.println(player.getName() + " введите целое число от 0 до 100: ");
        player.setNum(scanner.nextInt());
        if (player.getNum() < targetNum) {
            System.out.println("Число " + player.getNum() + " меньше того, что загадал компьютер");
            return true;
        } else if (player.getNum() > targetNum) {
            System.out.println("Число " + player.getNum() + " больше того, что загадал компьютер");
            return true;
        } else {
            System.out.println(player.getName() + " победитель!!!");
            return false;
        }
    }
}