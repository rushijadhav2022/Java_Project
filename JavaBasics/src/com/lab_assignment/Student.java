package com.lab_assignment;

public class Student {
	
	String name;
	int age;
	String address;
	
	
	public void set_Info(String name,int age)
	{
		this.name=name;
		this.age=age;
		
	}
	
	public void set_Info(String name,int age,String address)
	{
		this.name=name;
		this.age=age;
		this.address=address;
		System.out.println(name+" "+age+" "+address);
	}
	

	public static void main(String[] args) {
		
		Student s=new Student();
		s.set_Info("RJ",124,"Vita");
        
	}

}
