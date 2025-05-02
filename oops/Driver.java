package com.oops;

public class Driver {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.color();
		c1.addFuel(6);
		c1.start();
		c1.drive();
		System.out.println(c1.getCurrentFuelLevel());

	}

}
