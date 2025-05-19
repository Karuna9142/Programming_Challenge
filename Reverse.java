package com.collections.challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse {

	public static void main(String[] args) {
		
		List<Integer> l1 = Arrays.asList(5,6,7,1,2,0,8,9,3);
        System.out.println("Original list - "+l1);
		reverse(l1);
        System.out.println("Reversed list - "+l1);
		
	}
	public static void reverse(List<Integer> list)
	{
		//Collections.reverse(list);
		
		for(int i = 0;  i<list.size() / 2; i++) {
			Swap.swapping(list, i, list.size()-1-i);
		}
	}

}
