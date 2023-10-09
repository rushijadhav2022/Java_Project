package com.collection;

import java.util.*;

public class RemoveAll_RetainAll_Demo {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<>();
		ArrayList<String> ar1 = new ArrayList<>();

		ar.add("pune");
		ar.add("mumbai");
		ar.add("delhi");
		ar.add("Chennai");
		ar.add("Thane");

		ar1.add("pune");
		ar1.add("Bombay");
		ar1.add("delhi");
		ar1.add("Sangli");
		ar1.add("Thane");

//		ar.retainAll(ar1);
//		System.out.println(ar);  // RetainAll removes uncommon data between two arraylist.

//		ar.removeAll(ar1);
//		System.out.println(ar);  //  RemoveAll remove common data between two arraylist.

		ar.addAll(ar1);
		System.out.println(ar);
		System.out.println(ar.size());

	}

}
