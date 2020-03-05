package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		String answer;

		do {
			Calculator calc = new Calculator();
			Scanner scanner = new Scanner(System.in);

			System.out.print("Enter the math expression: ");

			String[] mathExpression = scanner.nextLine().split(" ");

			calc.calculate(mathExpression);

			do {
				System.out.println("Want to continue? [Yes / No]:");
				answer = scanner.nextLine();
			} while (!answer.equals("Yes") && !answer.equals("No"));
		} while(answer.equals("Yes"));
	}
}


