class MyFirstGame {
    public static void main(String[] args) {
        int playerNum = 50;
        int targetNum = (int) (Math.random() * 100);
        System.out.printf(targetNum + "\n");
        while (playerNum != targetNum) {
            if (playerNum < targetNum) {
                System.out.println("Число " + playerNum + " меньше того, что загадал компьютер");
                playerNum++;
            } else {
                System.out.println("Число " + playerNum + " больше того, что загадал компьютер");
                playerNum--;
            }
        }
        System.out.println("Вы победили!");
    }
}