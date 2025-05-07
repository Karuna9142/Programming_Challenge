package com.mathex;

public class AbsEx {

	public static void main(String[] args) {
		
		//abs() method
		System.out.println("Absolute value - "+Math.abs(-99));
		System.out.println("Ceil value - "+Math.ceil(35.46));
		System.out.println("floor value - "+Math.floor(5.97));
		System.out.println("Round value - "+Math.round(6.89));
		//System.out.println( "Random value - "+Math.random());

		for(int i = 0; i<10; i++) {
			long random  = Math.round(Math.random()* 100);
			System.out.println(random);
		}
		
		
	}

}
