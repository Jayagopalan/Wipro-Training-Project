package com.usecases.java;

public class VehicleMain {
	    public static void main(String[] args) {
	        Vehicle myCar = new Cars();
	        Vehicle myBike = new Bike();

	        myCar.startEngine();  
	        myCar.fuelStatus();   

	        myBike.startEngine();  
	        myBike.fuelStatus();   
	    }
}
