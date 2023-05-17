package com.polymorphism;

class Boy
{
String Name;

public void show()
{
System.out.println("This is boy");	

}
}

class Son extends Boy
{
  int standard;
  
  public void assignName()
  {
	  Name="pavan";
  }
	
  public void showName()
  {
	  System.out.println("Name  "+Name);
  }

}

class Student extends Son
{
	public void assignStandard()
	{
		standard= 9;
	}

	public void showStandard()
	{
		System.out.println("Standard = "+standard);
	}
}



public class MultilevelDemo2 {

	public static void main(String[] args) {
		
		Student s =new Student();
		s.show();
		s.assignName();
		s.showName();
		s.assignStandard();
		s.showStandard();

	}

}
