package com.usecases.java;

abstract class Vehicle {

	public abstract void startEngine();

	public void fuelStatus() {
		System.out.println("Fuel level is sufficient.");
	}
}

class Cars extends Vehicle {
	public void startEngine() {
		System.out.println("Car engine started with push button.");
	}
}

class Bike extends Vehicle {
	public void startEngine() {
		System.out.println("Bike engine started with kick.");
	}
}