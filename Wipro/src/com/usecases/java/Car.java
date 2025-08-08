package com.usecases.java;

public class Car {
	private boolean engineStatus;
	private int speed;
	private double fuelLevel;

	public void setEngineStatus(boolean status) {
		engineStatus = status;
	}

	public boolean isEngineOn() {
		return engineStatus;
	}

	public void setSpeed(int spd) {
		if (spd >= 0 && spd <= 300) {
			speed = spd;
		} else {
			System.out.println("Invalid speed! Must be between 0 and 300");
		}
	}

	public int getSpeed() {
		return speed;
	}

	public void setFuelLevel(double level) {
		if (level >= 0 && level <= 100) {
			fuelLevel = level;
		} else {
			System.out.println("Fuel level must be between 0 and 100");
		}
	}

	public double getFuelLevel() {
		return fuelLevel;
	}

	public void displayCarStatus() {
		System.out.println("\n--- Car Status ---");
		System.out.println("Engine: " + (engineStatus ? "ON" : "OFF"));
		System.out.println("Speed: " + speed);
		System.out.println("Fuel Level: ");
	}
}
