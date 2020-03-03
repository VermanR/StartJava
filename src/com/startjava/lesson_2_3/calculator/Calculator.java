package com.startjava.lesson_2_3.calculator;

import static java.lang.Math.*;

public class Calculator {
	private int a;
	private char operation;
	private int b;

	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public char getOperation() {
		return operation;
	}
	public void setOperation(char operation) {
		this.operation = operation;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public void calculate(String[] mathExpression) {
		int numberOne = Integer.parseInt(mathExpression[0]);
		String g = mathExpression[1];
		char symbol = g.charAt(0);
		int numberTwo = Integer.parseInt(mathExpression[2]);

		setA(numberOne);

		setOperation(symbol);

		setB(numberTwo);

		switch (operation) {
			case '+':
				System.out.println(Math.addExact(a, b));
				break;
			case '-':
				System.out.println(Math.subtractExact(a, b));
				break;
			case '*':
				System.out.println(Math.multiplyExact(a, b));
				break;
			case '/':
				System.out.println(Math.floorDiv(a, b));
				break;
			case '^':
				System.out.println(Math.pow(a, b));
				break;
			case '%':
				System.out.println(Math.IEEEremainder(a, b));
				break;
		}
	}
}
