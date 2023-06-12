package com.collection;

import java.util.*;

public class FailSafe_FailFast {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		al.add("Pune");
		al.add("Pune");
		al.add("Mumbai");
		al.add("Goa");
		al.add("Banglore");
		al.add("Nagpur");
		al.add("Nasik");

		System.out.println(al);

//		Iterator<String> i = al.iterator();
//		while (i.hasNext()) {
//			String s = i.next();
//			if (s.equalsIgnoreCase("Goa")) {
//				al.remove(s);                 // fail fast we cant perform multiple operations at same time because arraylist is synchronous
//			}
//		}
//
//		System.out.println(al);
		
		System.out.println("==========================================================================");
		
		Iterator<String> i1 = al.iterator();
		while(i1.hasNext())
		{
			String s1=i1.next();
			if(s1.equalsIgnoreCase("Goa"))
			{
				i1.remove();    // fail safe bcoz iterator is a asynchronous
			}
		}
		
		System.out.println(al);
	}

}
