package com.oops.abstraction.challeges;

public class Circle extends Shape{

	private final double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI * Math.pow(radius, 2);
	}
}
