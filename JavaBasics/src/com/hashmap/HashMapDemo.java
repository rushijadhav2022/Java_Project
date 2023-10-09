package com.hashmap;
import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map=new HashMap();
		
		map.put(1, "Amey");
		map.put(2, "Vijay");
		map.put(3, "Suraj");
		map.put(null,"NA");
		map.put(3, "Sam");
		map.put(null, "Unknown");
		map.put(5, null);
		map.put(6, null);
		map.put(7,"Vijay");
		System.out.println(map);
		
		System.out.println("Value :"+map.get(null));
		System.out.println("Checks key :"+map.containsKey(9));
		System.out.println("Contains Value :"+map.containsValue("Sam"));
		System.out.println(map.putIfAbsent(3, "Kim"));

	}

}
