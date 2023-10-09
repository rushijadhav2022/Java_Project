package com.treemap;
import java.util.*;
public class EmployeeMain {

	TreeMap<Employee,String> em=new TreeMap<>(new Mycomparator());
	
	
	public void addData()
	{
		em.put(new Employee(10,"Raj","Hr",70000), "6585665831");
		em.put(new Employee(5,"Ashish","admin",50000), "6585675831");
		em.put(new Employee(8,"vijay","Dev",90000), "6557665831");
		em.put(new Employee(9,"Abhishek","Operations",95000), "7685665879");
		em.put(new Employee(4,"Digvijay","Qa",70000), "6585660831");
		em.put(new Employee(2,"Suraj","Sales",100000), "6585665931");
		
		System.out.println(em);
	}
	
	public static void main(String [] args)
	{
		EmployeeMain m=new EmployeeMain();
		
		m.addData();
	}

}
