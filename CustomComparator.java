package com.collections.challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CustomComparator {

	public static void main(String[] args) {
		
		System.out.println("Before Sorting");
		List<String> list = Arrays.asList("dog", "cat", "rat","ape", "pig");
        
		System.out.println(list);
		System.out.println("After Sorting");
		sortIndDescending(list);
		System.out.println(list);
		
	}
	
	public static void sortIndDescending(List<String> stringlist)
	{
		Collections.sort(stringlist);
		
	}
}
