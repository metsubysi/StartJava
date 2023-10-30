import java.util.Scanner;
public class GuessNumber {
    Player player1;
    Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        int targetNum = (int) (Math.random() * 100);
        targetNum = 4;
        int playerNum = 1;
        boolean result = true;
        do {
            if (playerNum == 1) {
                result = checkNum(player1, targetNum);
                playerNum = 2;
            } else {
                result = checkNum(player2, targetNum);
                playerNum = 1;
            }
        } while (result);
    }

    private boolean checkNum(Player player, int targetNum) {
        Scanner scanner = new Scanner(System.in);
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