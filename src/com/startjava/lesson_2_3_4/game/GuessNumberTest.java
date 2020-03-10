package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the name of the first player: ");
		Player player1 = new Player(sc.nextLine());

		System.out.print("Enter the name of the second player: ");
		Player player2 = new Player(sc.nextLine());

		GuessNumber game = new GuessNumber(player1, player2);
		
		String answer;
		do {
			game.guess();
			do {
				System.out.println("Want to continue? [Yes / No]:");
				answer = sc.nextLine();
			} while (!answer.equals("Yes") && !answer.equals("No"));
		} while(answer.equals("Yes"));
	}
}