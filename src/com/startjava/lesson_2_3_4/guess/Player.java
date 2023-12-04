package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    
    private String name;
    private int[] nums = new int[10];
    public int attemptsCount = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNum(int num) {
        this.nums[attemptsCount] = num;
    }

    public int getNum() {
        return nums[attemptsCount];
    }

    public void setAttemptsCount(int attemptsCount) {
        this.attemptsCount = attemptsCount;
    }

    public int getAttemptsCount() {
        return attemptsCount;
    }

    public void printNums() {
        int[] nums = Arrays.copyOfRange(this.nums, 0, attemptsCount);
        for(int i = 0; i < attemptsCount; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public void arrayNull() {
        Arrays.fill(nums, 0, attemptsCount, 0);
    }
}