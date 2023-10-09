package com.collection;

import java.util.*;

public class ArraylistDemo {

	public static void main(String[] args) {

		ArrayList arr = new ArrayList();
		arr.add("Rushikesh");
		arr.add("Jadhav");
		arr.add("Vita");
		arr.add("Sangli");
		arr.add("Maharashtra");
		arr.add(1);
		arr.add(20.40);
		arr.add(null);

		System.out.println(arr);

		System.out.println("=================================================================");

		for (Object o : arr) {
			System.out.println(o);
		}

		System.out.println("==================================================================");

		ArrayList<String> a = new ArrayList<>();

		a.add("RJ");
		a.add("Vita");
		a.add("Sangli");
		a.add(null);

		Iterator i = a.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		while (i.hasNext()) {
			i.next();
		}

		System.out.println("==================================================");

		ListIterator<String> i1 = a.listIterator(a.size());
		while (i1.hasPrevious()) {
			System.out.println(i1.previous());
		}

		ArrayList a1 = new ArrayList();
		a1.add("rj");
		a1.add("vj");
		a1.add("sj");

		ListIterator i3 = a1.listIterator(a1.size());
//		while(i3.hasNext())
//		{
//			i3.next();
//		}
//		i3.next();
//		i3.next();
//		i3.next();
		System.out.println("-----------------");
		while (i3.hasPrevious()) {
			System.out.println(i3.previous());
		}

//		arr.addAll(a);
//		System.out.println(arr);
//		System.out.println(arr.set(8, "Rushi"));
//		System.out.println(arr);
//		System.out.println(arr.isEmpty());
//		arr.remove("Rushikesh");
//		System.out.println(arr);

	}

}
