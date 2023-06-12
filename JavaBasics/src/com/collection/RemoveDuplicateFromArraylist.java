package com.collection;

import java.util.ArrayList;

public class RemoveDuplicateFromArraylist {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList();
		a.add(2);
		a.add(4);
		a.add(5);
		a.add(7);
		a.add(5);
		a.add(2);

		System.out.println(a);

		System.out.println("========= Removing Duplicates From ArrayList==================");

		for (int i = 0; i < a.size() - 1; i++) {
			for (int j = a.size() - 1; j > i; j--) {
				if (a.get(i) == a.get(j)) {
					a.remove(a.get(i));

				}
			}

		

	}

		System.out.println(a);

}
}
