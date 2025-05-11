package com.oops.polymorphism;

public class TestTransportation {

	public static void main(String[] args) {
	
		Car c1= new Car();
		//Vehicle v1 = new Vehicle();
		Plane p1 = new Plane();
		
		castTest(c1);
		castTest(p1);
		

	}
	private static void castTest(Vehicle v1)
	{
		v1.start();
		
	}

}
