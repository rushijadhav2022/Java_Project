package com.custom_hashmap;

import java.util.*;

public class EmployeeHashMap2 {

	public static void main(String[] args) {
		
		HashMap<Employee, String> emap= new HashMap<>();
	      
	      emap.put( new Employee(101, "Suraj", 89000),"Techical");
	      emap.put(new Employee(102, "Akshat", 99000),"HR");
	      emap.put(new Employee(103, "Amey", 189000),"Sales");
	      emap.put(new Employee(104, "Prasad", 85000),"Sales");
	      emap.put(new Employee(105, "Mayur", 100000),"HR");
	      
	      for(Map.Entry<Employee,String> en: emap.entrySet())
	      {
	    	  System.out.println(en.getKey());
	    	  System.out.println(en.getValue());
	      }
	      
	      System.out.println("====================================");
	      
	      emap.put(new Employee(103, "Amey", 189000),"Technical");
	      
	      
	      for(Map.Entry<Employee,String> en: emap.entrySet())
	      {
	    	  System.out.println(en.getKey());
	    	  System.out.println(en.getValue());
	      }

	}

}
