package com.hashmap;
import java.util.*;
public class HashMapDemo3 {

	public static void main(String[] args) {
		
		HashMap<Character,String> hs=new HashMap<>();
		
		hs.put('a', "Apple");
		hs.put('b', "Bag");
		hs.put('c',"C++");
		hs.put('d', "Django");
		
		System.out.println(hs);
		System.out.println(hs.keySet());
		System.out.println(hs.values());
		System.out.println("==================================");
		     Set<Character> s = hs.keySet();
		     for(Character s1 : s)
		     {
		    	 System.out.println(s1);
		     }
		System.out.println("==================================");
		
		     Collection<String> value = hs.values();
		     for(String v : value) 
		     {
		    	System.out.println(v); 
		     }
	}

}
