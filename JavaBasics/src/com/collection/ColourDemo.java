package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ColourDemo {

	public static void main(String[] args) {

		ArrayList<String> ar = new ArrayList();
		ar.add("red");
		ar.add("black");
		ar.add("blue");
		ar.add("red");
		ar.add("brown");
		ar.add("black");
		ar.add("yellow");
		ar.add("green");
		System.out.println(ar);

		System.out.println("========================================================");

		Iterator i = ar.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		System.out.println("===========remove duplicates=========================");

		for (int j = 0; j < ar.size() - 1; j++) {
			for (int k = j + 1; k < ar.size() - 1; k++) {
				if (ar.get(j).equals(ar.get(k))) {
					ar.remove(ar.get(j));

				}

			}

		}

		Iterator i1 = ar.iterator();
		while (i1.hasNext()) {
			System.out.print(i1.next() + " ");
		}

	}

}
