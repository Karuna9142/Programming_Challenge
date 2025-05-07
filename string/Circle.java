package com.string;

import java.util.Scanner;

public class Circle {
	
	double radius;
	
	Circle(double radius) {
		this.radius = radius;
	}

	double getCircumference() {
		return  2 * Math.PI * radius;
	}
	
	double getAreaOfCircle() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	
	@Override
	public String toString() {
		return "Radius is - " +radius+ "\nCircumference - " +getCircumference()+ "\nArea of Circle - " +getAreaOfCircle();
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius:- ");
		double radius = sc.nextDouble();
		
		Circle c1 = new Circle(radius);
		System.out.println(c1);

	}

}
