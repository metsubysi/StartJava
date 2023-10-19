class MyFirstGame {
    public static void main(String[] args) {
        int attemptNum = 50;
        int random = (int) (Math.random() * 100);
        System.out.printf(random + "\n");
        while (attemptNum != random) {
            if (attemptNum < random) {
            System.out.println("Число " + attemptNum + " больше того, что загадал компьютер");
            attemptNum++;
            }
            if (attemptNum > random) {
            System.out.println("Число " + attemptNum + " меньше того, что загадал компьютер");
            attemptNum--;
            }
        }
        System.out.println("Вы победили!");
    }
}