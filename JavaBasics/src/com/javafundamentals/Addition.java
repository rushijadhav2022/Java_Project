package com.javafundamentals;

public class Addition {

	public static void main(String[] args) {
		
	
	int num1=25,num2=30,sum=0; // Variable declaration and initialization within same line
	
	sum=num1+num2;            // Business logic
	
	System.out.println("The Addition of two numbers = "+sum); // Print 

	
	int a=2;
	int b=2;
	int x=++a + ++b;
	System.out.println(x+a+b);
	System.out.println(a);
	System.out.println(b);
	x=a++ + b++;
	System.out.println(x+a+b);
	
	x=a-- -b -- -a;
	System.out.println(x+a+b);
	System.out.println(a);
	System.out.println(b);
	
	System.out.println(35+17-5*7);
	
	}
	
}
