package com.oops;

public class Student {

	int id;
	String name;
	int sub1;
	int sub2;
	int sub3;
	
	public void accept_details(int eid,String namee,int marathi,int hindi,int english)
	{
		id=	eid;
		name=namee;
		sub1=marathi;
		sub2=hindi;
		sub3=english;
		
		
	}
	public void percentage()
	{
		int sum=sub1+sub2+sub3;
		int totalmarks=300;
		int percentage=sum*100/totalmarks;
		System.out.println(percentage);
		
	}
	
	public void display()
	{
		System.out.println("Student_ID"+id+" "+name+" "+sub1+" "+sub2+" "+sub3);
		
	}
	
	public static void main(String[] args) {
		
		Student st = new Student();
		st.accept_details(1,"Rushikesh Jadhav", 98, 95, 97);
		st.display();
		st.percentage();

	}

}
