package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Remove_Duplicates {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList();
		a.add("Rushi");
		a.add("Jadhav");
		a.add("Vita");
		a.add("aitrc");
		System.out.println(a);
		ArrayList<String> a1 = new ArrayList();
		a1.add("Jadhav");
		a1.add("Sashi");
		a1.add("gtre");
		a1.add("aitrc");
		System.out.println(a1);

		for (int i = 0; i < a.size(); i++) {
			for (int j = 0; j < a1.size(); j++) {
				if (a.get(i).equals(a1.get(j))) {
					a.remove(a.get(i));
				}

			}
		}

		Iterator i = a.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
