package com.collection;

import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<>();
		ll.add("JAVA");
		ll.add("C++");
		ll.add("PYTHON");
		ll.add("JAVA");
		System.out.println(ll);

		ll.addFirst("C-SHARP");
		System.out.println(ll); // addFirst() will add element initially to the list..
		ll.removeLast();
		System.out.println(ll); // It will remove last element of the linkedlist..
		System.out.println(ll.pollFirst());
		System.out.println(ll);
		System.out.println(ll.pollLast());
		System.out.println(ll);
System.out.println("**********************************************************************************");
		ArrayList<String> a = new ArrayList<>(ll); // conversion of linkedlist to arraylist..

		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}

	}

}
