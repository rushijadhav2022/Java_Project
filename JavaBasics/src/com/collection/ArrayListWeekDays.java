package com.collection;

import java.util.*;

public class ArrayListWeekDays {

	public static void main(String[] args) {

		ArrayList<String> ar = new ArrayList<>();

		ar.add("monday");
		ar.add("tuesday");
		ar.add("wednesday");
		ar.add("thursday");
		ar.add("friday");
		ar.add("saturday");
		ar.add("sunday");

		System.out.println(ar);

		Iterator<String> i = ar.iterator();
		while (i.hasNext()) {
			String s = (String) i.next();
			if (s.length() >= 7) {
				i.remove();
			}
		}

		System.out.println(ar);

	}

}
