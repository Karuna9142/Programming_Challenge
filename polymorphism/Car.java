package com.oops.polymorphism;

public class Car extends Vehicle{

	Car()
	{
        super();
    }
    Car(int noOfTires)
    {
        super(noOfTires);
    }
	public int noOfDoors() {
		return 5;
	}
}
