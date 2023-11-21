package com.startjava.lesson_2_3.animal;

public class WolfTest {
    
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setGender("М");
        wolf.setName("Утка");
        wolf.setWeight(41.2f);
        wolf.setAge(2);
        wolf.setColor("Белый");
        System.out.println(wolf.getGender());
        System.out.println(wolf.getName());
        System.out.println(wolf.getWeight());
        System.out.println(wolf.getAge());
        System.out.println(wolf.getColor());
        wolf.move();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}