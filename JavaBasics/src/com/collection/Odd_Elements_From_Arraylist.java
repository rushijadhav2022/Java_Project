package com.collection;

import java.util.*;

public class Odd_Elements_From_Arraylist {

	public void oddElements() {

		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(2);
		arr.add(7);
		arr.add(6);
		arr.add(5);
		arr.add(4);
		arr.add(12);

		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) % 2 == 1) {
				System.out.println(arr.get(i));
			}
		}

		System.out.println("============= Avg of Even Element===================");

		int sum = 0;
		int count = 0;

		for (int j = 0; j < arr.size(); j++) {
			if (arr.get(j) % 2 == 0) {
				sum = sum + arr.get(j);
				count++;
			}
		}

		int avg = sum / count;

		System.out.println("Avg of Even Element is = " + avg);

		System.out.println("=========Even Positioned Element============");

		for (int k = 0; k < arr.size(); k = k + 2) {

			System.out.println(arr.get(k));

		}

	}

	public static void main(String[] args) {

		Odd_Elements_From_Arraylist d = new Odd_Elements_From_Arraylist();

		d.oddElements();

	}

}
