package com.sampleprograms.java;

public class StaticExample {

	static class Calculator {
		static int add(int a, int b) {
			return a + b;
		}

		void print(int a, int b) {
			System.out.println(a - b);
		}
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.print(10, 10);

		int result = Calculator.add(10, 10);
		System.out.println(result);
	}
}
