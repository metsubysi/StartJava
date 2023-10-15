class MyFirstGame {
    public static void main(String[] args) {
        int num = 50, 
            i = 1, 
            random = (int) (Math.random() * 100);
        System.out.printf(random + "\n");
        while (num != random) {
           if (num < random) {
            num++;
            System.out.println("Число " + num + " больше того, что загадал компьютер");
           }
           if (num > random) {
            num--;
            System.out.println("Число " + num + " меньше того, что загадал компьютер");
           }
        }
        System.out.println("Вы победили!");
    }
}