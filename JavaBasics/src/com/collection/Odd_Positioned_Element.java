package com.collection;

import java.util.*;

public class Odd_Positioned_Element {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();

		arr.add(2);
		arr.add(4);
		arr.add(7);
		arr.add(5);
		arr.add(3);
		arr.add(9);

		ListIterator<Integer> list = arr.listIterator();
		while (list.hasNext()) {
			list.next();
			System.out.println(list.next());
		}

	}

}
