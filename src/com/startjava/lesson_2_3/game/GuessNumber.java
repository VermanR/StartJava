package com.startjava.lesson_2_3.game;

import java.lang.Math;
import java.util.Scanner;

public class GuessNumber {
	private Player player1;
	private Player player2;

	Scanner sc = new Scanner(System.in);

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void guess() {
		int computerNumber = (int) (Math.random() * 101);
		int number;
		do {
			System.out.print(player1.getName() + ", enter a number: ");
			player1.setNumber(sc.nextInt());
			number = player1.getNumber();
			if (number == computerNumber) {
				System.out.println(player1.getName() + ", you guessed!");
			} else  if (number < computerNumber) {
				System.out.println(player1.getName() + ", you entered a number less than what the computer did");
			} else if (number > computerNumber) {
				System.out.println(player1.getName() + ", you entered a number greater than what the computer did");
			}

			System.out.print(player2.getName() + ", enter a number: ");
			player2.setNumber(sc.nextInt());
			number = player2.getNumber();
			if (number == computerNumber) {
				System.out.println(player2.getName() + ", you guessed!");
			} else  if (number < computerNumber) {
				System.out.println(player2.getName() + ", you entered a number less than what the computer did");
			} else if (number > computerNumber) {
				System.out.println(player2.getName() + ", you entered a number greater than what the computer did");
			}
		} while (number != computerNumber);
	}	
}