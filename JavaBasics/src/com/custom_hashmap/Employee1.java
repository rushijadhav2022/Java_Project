package com.custom_hashmap;
class Department
{
	
int d_id;
String d_name;

public Department(int d_id,String d_name)
{
	this.d_id=d_id;
	this.d_name=d_name;
}

@Override
public String toString() {
	return "Department [d_id=" + d_id + ", d_name=" + d_name + "]";
}




}
public class Employee1 {

	int e_id;
	String e_name;
	Department d;
	
	public  Employee1(int e_id,String e_name,Department d)
	{
		this.e_id=e_id;
		this.e_name=e_name;
		this.d=d;
		
	}
	
	public String toString()
	{
	      return e_id+" "+e_name+" "+d;
	}
	
	
	
}
