package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		String answer;
		do {
			Calculator calc = new Calculator();
			Scanner scanner = new Scanner(System.in);

			System.out.print("Enter the math expression: ");
			String userInput = scanner.nextLine();
			String[] arrChar = userInput.split(" ");

			int numberOne = Integer.parseInt(arrChar[0]);
			String g = arrChar[1];
			char symbol = g.charAt(0);
			int numberTwo = Integer.parseInt(arrChar[2]);

			calc.setA(numberOne);
			calc.setOperation(symbol);
			calc.setB(numberTwo);
			calc.calculate();

			do {
				System.out.println("Want to continue? [Yes / No]:");
				answer = scanner.nextLine();
			} while (!answer.equals("Yes") && !answer.equals("No"));
		} while(answer.equals("Yes"));
	}
}


