package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int countAttempt;
    private int[] enteredNums = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCountAttempt(int countAttempt) {
        this.countAttempt = countAttempt;
    }

    public int getCountAttempt() {
        return countAttempt;
    }

    public int getCurrentNum() {
        return enteredNums[countAttempt - 1];
    }

    public void setEnteredNum(int guessNumber) {  //name will change
        enteredNums[countAttempt - 1] = guessNumber;
    }

    public void clear() {
        Arrays.fill(enteredNums, 0, countAttempt, 0);
        countAttempt = 0;
    }

    public int[] getEnteredNums() {
        return Arrays.copyOf(enteredNums, countAttempt);
    }
}
