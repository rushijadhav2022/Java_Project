package com.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistSort {

	public static void main(String[] args) {

		ArrayList<Integer> t = new ArrayList<>();
		t.add(5);
		t.add(7);
		t.add(4);
		System.out.println(t);

		for (int i = 0; i < t.size(); i++) {

			for (int j = i + 1; j < t.size(); j++) {

				if (t.get(i) > t.get(j)) {

					int temp = t.get(i);
					t.set(i, t.get(j));
					t.set(j, temp);

				}

			}
			System.out.println(t.get(i));
		}

	}

}
