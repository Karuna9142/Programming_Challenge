package com.oops.abstraction.challenge2;

public class Eagle extends Bird{

	public Eagle(String breed) {
		super(breed);
	}

	@Override
	public void fly() {
		System.out.println("Birds can fly high");
	}

}
