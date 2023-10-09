package com.hashmap;

import java.util.*;

public class HashMapDemo5 {

	public static void main(String[] args) {

		HashMap<Integer, ArrayList<String>> hs = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 3; i++) {
			System.out.println("Please Enter a Key");
			int key = sc.nextInt();
			ArrayList<String> al = new ArrayList<>();
			System.out.println("Enter names");
			for (int j = 1; j <= 2; j++) {
				al.add(sc.next());
			}
			hs.put(key, al);
		}
		
	     for(Map.Entry<Integer, ArrayList<String>> mp:hs.entrySet())
	     {
	    	 System.out.println(mp.getKey()+ " "+mp.getValue());
	     }
	}

}
