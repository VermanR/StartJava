package com.startjava.lesson_2_3.calculator;

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

	public void calculate() {
		switch (operation) {
			case '+':
				System.out.println(a + b);
				break;
			case '-':
				System.out.println(a - b);
				break;
			case '*':
				System.out.println(a * b);
				break;
			case '/':
				System.out.println(a / b);
				break;
			case '^':
				int i = 1;
				int c = 1;
				while (i <= b) {
					c *= a;
					i++;
				}
				System.out.println(c);
				break;
			case '%':
				System.out.println(a % b);
				break;
		}
	}
}
