package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		String answer;
		do {
			Calculator calc = new Calculator();
			Scanner scanner = new Scanner(System.in);

			System.out.print("Enter the math expression: ");

			calc.calculate();
			userArray();

			do {

				System.out.println("Want to continue? [Yes / No]:");
				answer = scanner.nextLine();
			} while (!answer.equals("Yes") && !answer.equals("No"));
		} while(answer.equals("Yes"));
	}

	public static String[] userArray() {
		Scanner scanner = new Scanner(System.in);
		String[] mathExpression = scanner.nextLine().split(" ");
		return mathExpression;
	}
}


