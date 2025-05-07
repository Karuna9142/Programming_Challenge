package com.string;

public class Student {
	
	String name;
	int age;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Strudent [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		
		Student s1 = new Student("Karuna", 22);
		System.out.println(s1);

	}

}
