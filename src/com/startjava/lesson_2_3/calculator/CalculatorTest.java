package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		String answer;
		do {
			Calculator calc = new Calculator();
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter the first number: ");
			calc.setA(scanner.nextInt());

			System.out.print("Enter the sign of the math operation: ");
			calc.setOperation(scanner.next().charAt(0));

			System.out.print("Enter the second number: ");
			calc.setB(scanner.nextInt());
			
			calc.calculate();
			answer = scanner.nextLine();
			do {
				System.out.println("Want to continue? [Yes / No]:");
				answer = scanner.nextLine();
			} while (!answer.equals("Yes") && !answer.equals("No"));
		} while(answer.equals("Yes"));
	}
}


