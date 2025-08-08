package com.usecases.java;

public class CarMain {
	public static void main(String[] args) {
		Car myCar = new Car();

		myCar.setEngineStatus(true);
		myCar.setSpeed(80);
		myCar.setFuelLevel(55.5);

		myCar.displayCarStatus();

	}

}
