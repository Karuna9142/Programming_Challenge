package com.collections;

public class MyClass {
	
	static void printMany(String ...elements) {
		for(String element : elements) {
			System.out.println(element);
		}
	}

	public static void main(String[] args) {
		
		printMany("one", "two", "three");
		printMany("one", "two");
		printMany();

	}

}
