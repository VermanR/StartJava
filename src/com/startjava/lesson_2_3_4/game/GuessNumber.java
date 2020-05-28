package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;
import java.util.Arrays;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int computerNumber;

    Scanner sc = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void guess() {
        computerNumber = (int) (Math.random() * 101);
        System.out.println("You have 10 attempts");

        for (int i = 1; i <= 10; i++) {
            player1.setCountAttempt(i);
            if (!makeMove(player1)) {
                break;
            }
            player2.setCountAttempt(i);
            if (!makeMove(player2)) {
                break;
            }
        }
        System.out.println(Arrays.toString(player1.getArrNumbers()));
        System.out.println(Arrays.toString(player2.getArrNumbers()));

        player1.clearGuessNumbers();
        player2.clearGuessNumbers();
    }

    private boolean makeMove(Player player) {
        inputNumber(player);
        if (!compareNumbers(player)) {
            if (player.getCountAttempt() == 10) {
                System.out.println("Player " + player.getName() + " has run out of attempts");
            }
            return true;
        } else return false;
    }

    private void inputNumber(Player player) {
        System.out.print(player.getName() + ", enter a number ");
        player.putGuessNumber(sc.nextInt());
        sc.nextLine();
    }

    private boolean compareNumbers(Player player) {
        if (player.numberArray() > computerNumber) {
            System.out.println("You entered a number greater than what the computer did");
        } else if (player.numberArray() < computerNumber) {
            System.out.println("You entered a number less than what the computer did");
        } else {
            System.out.println("Player " + player.getName() + ", guessed the number with " + player.getCountAttempt() + " attempts");
            return true;
        }
        return false;
    }
}