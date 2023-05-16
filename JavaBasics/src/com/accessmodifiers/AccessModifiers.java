package com.accessmodifiers;

public class AccessModifiers {
	
	private String name="Rushikesh";
	int id=124;
	protected String city="Vita";
	
	
	private void privateMethod() // private method
	{
		
		System.out.println("private method");
		
	}
	
	
	void defaultMethod()
	{
		System.out.println("Default Method");
	}
	
	protected void  protectedMethod()
	{
		
		System.out.println("protected method");
	}
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		AccessModifiers a=new AccessModifiers();
		
		System.out.println(a.name);
		a.privateMethod();
		System.out.println(a.id);
		a.defaultMethod();
		System.out.println(a.city);
		a.protectedMethod();

	}

}
