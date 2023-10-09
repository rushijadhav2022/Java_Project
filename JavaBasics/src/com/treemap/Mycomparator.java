package com.treemap;
import java.util.*;
public class Mycomparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.e_name.compareTo(o2.e_name);
	}

}
