package com.oops.polymorphism;

public class MethodOverloadingEx {
	
	public int sum(int a, int b) {
		return a + b;
	}
	public String sum(String a, String b) {
		return a + b;
	}
	public int sum(int a, int b, int c, int d) {
		return a + b + c + d;
	}
	public static void main(String[] args) {
		MethodOverloadingEx m1 = new MethodOverloadingEx();
		System.out.println(m1.sum(5, 6));
		
		System.out.println(m1.sum(05, 6, 8, 9));

		System.out.println(m1.sum(2, 3));
	}

}
