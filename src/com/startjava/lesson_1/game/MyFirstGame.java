package com.startjava.lesson_1.game;

public class MyFirstGame {
	public static void main(String[] args) {
		int unknownNumber = 55;
		int myNumber = 50;

		for (int i = 0; i <= 100;) {
			if (myNumber == unknownNumber) {
				System.out.println("You guessed!");
				break;
			} else  if (myNumber < unknownNumber) {
				System.out.println("The number you entered is less than what the computer made");
				myNumber++;
				i++;
			} else if (myNumber > unknownNumber) {
				System.out.println("The number you entered is greater than what the computer made");
				myNumber--;
				i++;
			}
		}
	}
}