package com.oops.inheritance;

public class TwoWheeler extends Vehicle{
	
	TwoWheeler() {
		
		setNumberOfTires(2);
		noOfTires = 4;
	}
	
	public void balance() {
		System.out.println("I am balancing on two tires");
	}

}
