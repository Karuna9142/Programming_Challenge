package com.string;

public class StringFormat {

	public static void main(String[] args) {
		
		String name = "Priya";
		int marks = 45;
		System.out.println("Your name is: - " +name+ " and marks are - "+marks);

		System.out.printf("Hello, %-10S  your marks are  %d", name, marks);
	}

}
