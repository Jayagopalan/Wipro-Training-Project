package com.usecases.java;

public class ConstructorOverloading {
	ConstructorOverloading() {
		System.out.println("Hello");
	}

	ConstructorOverloading(String name) {
		System.out.println("Hello " + name);
	}

	public static void main(String[] args) {
		new ConstructorOverloading();
		new ConstructorOverloading("World");
	}

}
