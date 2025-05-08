package com.oops.abstraction.challeges;

public class TestShape {

	public static void main(String[] args) {
		
		Circle c1 = new Circle(4.5);
		c1.calculateArea();
		
		Square s1 = new Square(4.2);
		s1.calculateArea();
		
		System.out.printf("Area of Circle is %f ", c1.calculateArea() );
		System.out.printf("\nArea of Square is %f  ", s1.calculateArea());
	}

}
