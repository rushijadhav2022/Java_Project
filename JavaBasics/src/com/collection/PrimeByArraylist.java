package com.collection;

import java.util.ArrayList;

public class PrimeByArraylist {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();

		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		arr.add(8);
		arr.add(9);

		System.out.println(arr);

		System.out.println("========Prime Numbers====================");

		for (int i = 0; i < arr.size(); i++) {
			boolean isPrime = true;
			for (int j = 2; j < arr.get(i); j++) {
				if (arr.get(i) % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime == true) {
				System.out.println(arr.get(i));
			}

		}

	}
}
