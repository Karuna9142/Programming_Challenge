package com.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {

	public static void main(String[] args) {
		
		Deque<String> dq = new ArrayDeque<String>();
		dq.add("kkm");
		dq.add("Glenn");
		dq.add("Negan");
		dq.addLast("Maggie");
		dq.addFirst("Rick");
		dq.add("Daryl");
		
		System.out.println("Elements in Deque:"+dq);

		System.out.println("Removed element: "+dq.removeLast());
		/*
		* element() method - returns the head of the
		* Deque. Head is the first element of Deque
		*/

		System.out.println("Head: "+dq.element());
		
		/*
		* pollLast() method - this method removes and returns the
		* tail of the Deque(last element). Returns null if the Deque is empty.
		* We can also use poll() or pollFirst() to remove the first element of
		* Deque.
		*/

		System.out.println("Poll(): "+dq.pollLast());
		
		/*
		* peek() method - it works same as element() method,
		* however it returns null if the Deque is empty. We can also use
		* peekFirst() and peekLast() to retrieve first and last element
		*/

		System.out.println("peek():- "+dq.peek());
		System.out.println("Elements in Deque:- "+dq);
	}

}
