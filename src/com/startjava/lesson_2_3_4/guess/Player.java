package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    
    private String name;
    private int[] nums = new int[10];
    private int attemptsCount;
    public int wins = 0;
    public boolean isSetNum = false;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNum(int num) {
            nums[attemptsCount] = num;
    }

    public int getNum() {
        return nums[attemptsCount];
    }

    public void setAttemptsCount(int attemptsCount) {
        this.attemptsCount = attemptsCount;
    }

    public int getWins() {
        return wins;
    }

    public void incrementAttemptsCount() {
        attemptsCount++;
    }

    public int getAttemptsCount() {
        return attemptsCount;
    }

    public int[] getNums() {
        return nums;
    }

    public void clear() {
        Arrays.fill(nums, 0, attemptsCount, 0);
    }
}