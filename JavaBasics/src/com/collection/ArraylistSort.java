package com.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistSort {

	public static void main(String[] args) {

		ArrayList<Integer> t = new ArrayList();
		t.add(5);
		t.add(7);
		t.add(4);
		System.out.println(t);

		for (int i = 0; i < t.size(); i++) {

			for (int j = t.size() - 1; j > i; j--) {

				if (t.get(i) > t.get(j)) {

					int temp = t.get(i);
					t.set(i, t.get(j));
					t.set(j, temp);

				}

			}

		}
		for (int i : t) {
			System.out.println(i);
		}

	}

}
