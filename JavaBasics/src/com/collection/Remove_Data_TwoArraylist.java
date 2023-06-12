package com.collection;

import java.util.ArrayList;

public class Remove_Data_TwoArraylist {

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

		System.out.println("====Removing common between two arraylist======= ");
		a.removeAll(a1);
		System.out.println(a);
		

	}

}
