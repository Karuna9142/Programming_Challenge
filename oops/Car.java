package com.oops;

public class Car {
	int noOfWheels;
	String color;
	float maxSpeed;
	float currentFuelInLitres;
	int noOfSeats;
	
	public void addFuel(float fuel) {
		//System.out.println("Adding fuel to that car");
		currentFuelInLitres += fuel;
	}
	public void start() {
		if(currentFuelInLitres == 0) {
			System.out.println("You car is out of fuel");
		}
		else if(currentFuelInLitres <= 5) {
			System.out.println("Your car is in reserved mode, plese refuel");
			System.out.println("car is driving");
			currentFuelInLitres--;
		} else {
			System.out.println("car is started, bruhhhhhhh");	
		}

		
	}
	public void drive() {
			System.out.println("car is driving");
			currentFuelInLitres--;
		
	}
	
	public void  color() {
		System.out.println("Color of the Car is blue ");
	}

	public float getCurrentFuelLevel() {
		return currentFuelInLitres;
	}
}
