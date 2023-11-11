package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerSlattern = new Jaeger();
        jaegerSlattern.setModelName("Slattern");
        jaegerSlattern.setMark("Mark-3");
        jaegerSlattern.setOrigin("Anteverse");
        jaegerSlattern.setHeight(63.09f);
        jaegerSlattern.setWeight(2690.0f);
        jaegerSlattern.setStrenght(6);
        jaegerSlattern.setArmor(7);
        
        Jaeger jaegerChernoAlpha = new Jaeger("Cherno Alpha", "Mark-1", "Russia", 85.34f, 2412.0f, 10, 10);
        System.out.print(jaegerChernoAlpha.getModelName() + " vs " + jaegerSlattern.getModelName());
        System.out.printf("\n%-15s %-11s", jaegerChernoAlpha.getMark(), jaegerSlattern.getMark());
        System.out.printf("\n%-15s %-11s", jaegerChernoAlpha.getOrigin(), jaegerSlattern.getOrigin());
        System.out.printf("\n%-15s %-11s", jaegerChernoAlpha.getHeight(), jaegerSlattern.getHeight());
        System.out.printf("\n%-15s %-11s", jaegerChernoAlpha.getWeight(), jaegerSlattern.getWeight());
        System.out.printf("\n%-15s %-11s", jaegerChernoAlpha.getStrenght(), jaegerSlattern.getStrenght());
        System.out.printf("\n%-15s %-11s", jaegerChernoAlpha.getArmor(), jaegerSlattern.getArmor());
    }
}