package com.collections.enumex.challenges;

public class EnumTest {

	public static void main(String[] args) {
		
		System.out.println("Printng all the day of week");
		System.out.println(Day.MONDAY);
		System.out.println(Day.TUESDAY);
		System.out.println(Day.WEDNESDAY);
		System.out.println(Day.THRUSDAY);
		System.out.println(Day.FRIDAY);
		System.out.println(Day.SATURDAY);
		System.out.println(Day.SUNDAY);

		for(Day d1 : Day.values()) {
			System.out.println(d1);
		}
	}

}
