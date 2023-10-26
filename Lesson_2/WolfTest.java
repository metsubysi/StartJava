public class WolfTest {
    
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.gender = "М";
        wolf.name = "Утка";
        wolf.weight = 48.0f;
        wolf.age = 7;
        wolf.color = "Белый";
        System.out.println(wolf.gender);
        System.out.println(wolf.name);
        System.out.println(wolf.weight);
        System.out.println(wolf.age);
        System.out.println(wolf.color);
        wolf.move();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}