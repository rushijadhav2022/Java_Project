package com.collections_comparable_comparator;

import java.util.*;

public class ArrayList_SortDemo {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(9);
		arr.add(56);
		arr.add(45);
		arr.add(75);
		arr.add(34);
		System.out.println(arr);

		Collections.sort(arr);
		System.out.println(arr);

	}

}
