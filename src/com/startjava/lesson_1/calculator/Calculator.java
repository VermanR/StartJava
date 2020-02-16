package com.startjava.lesson_1.calculator;

public class Calculator {
	public static void main(String[] args) {
		char operation = '^';
		int a = 15;
		int b = 6;

		if (operation == '+') {
			System.out.println(a + b);
		} else if (operation == '-') {
			System.out.println(a - b);
		} else if (operation == '*') {
			System.out.println(a * b);
		} else if (operation == '/') {
			System.out.println(a / b);
		} else if (operation == '^') {
			int i = 1;
			int c = 1;
			while (i <= b) {
				c *= a;
				i++;
			}
			System.out.println(c);
		} else if (operation == '%') {
			System.out.println(a % b);
		}
	}
} 