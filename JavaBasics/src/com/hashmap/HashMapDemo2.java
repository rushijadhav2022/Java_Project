package com.hashmap;
import java.util.*;
public class HashMapDemo2 {

	public static void main(String[] args) {
		
		HashMap<String,Float> smap=new HashMap();
		smap.put("Sam", 89.6f);
		smap.put(null, 0f);
		smap.put("Akshat",90.5f);
		smap.put("Amey", 94.3f);
		
		Set<String> keySet = smap.keySet();
         for(String s : keySet)
         {
        	 System.out.println(s);  // print only key
         }
         System.out.println("==============================================");
         Collection<Float>marks=smap.values();
         for(Float m : marks)
         {
        	 System.out.println(m);  // print only values
         }
         System.out.println("===============================================");
         for(Map.Entry<String, Float>en : smap.entrySet())
         {
        	 System.out.println(en.getKey()+" "+en.getValue());
         }
		
	}

}
