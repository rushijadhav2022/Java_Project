package com.collection;

import java.util.*;

public class VecorDemo {

	public static void main(String[] args) {

		Vector<String> v = new Vector<>();
		v.add("Blue");
		v.addElement("Black");
		v.add("red");

		System.out.println(v);

		System.out.println("************************************************************************");

		Enumeration<String> e = v.elements();
		while (e.hasMoreElements()) {
			// System.out.println(e.nextElement());
			String s = e.nextElement();
			if (s.equalsIgnoreCase("Black")) {
				v.remove(s);
			}
		}

		System.out.println(v);
	}

}
