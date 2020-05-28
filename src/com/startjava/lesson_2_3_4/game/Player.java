package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int countAttempt;
    private int[] arrNumbers = new int[10];

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


    public int numberArray() {
        return arrNumbers[countAttempt - 1];
    }


    public void putGuessNumber(int guessNumber) {  //name will change
        arrNumbers[countAttempt - 1] = guessNumber;
    }

    public void clearGuessNumbers() {              //name will change
        Arrays.fill(arrNumbers, 0, countAttempt, 0);
        countAttempt = 0;
    }

    public int[] getArrNumbers() {
        return Arrays.copyOf(arrNumbers, countAttempt);
    }
}
