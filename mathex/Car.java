package com.mathex;

public class Car {
	
	int noOfwheels;
	int noOfDoors;
	int maxSpeed;
	String name;
	String modelNumber;
	String company;
	
	

	public Car(int noOfwheels, int noOfDoors, int maxSpeed, String name, String modelNumber, String company) {
		super();
		this.noOfwheels = noOfwheels;
		this.noOfDoors = noOfDoors;
		this.maxSpeed = maxSpeed;
		this.name = name;
		this.modelNumber = modelNumber;
		this.company = company;
	}

	@Override
	public String toString() {
		return "Car [noOfwheels=" + noOfwheels + ", noOfDoors=" + noOfDoors + ", maxSpeed=" + maxSpeed + ", name="
				+ name + ", modelNumber=" + modelNumber + ", company=" + company + "]";
	}




	public static void main(String[] args) {
		
		Car c1 = new Car(4,4,180,"Swift","JH0849","Hero");
		System.out.println(c1);

	}

}
