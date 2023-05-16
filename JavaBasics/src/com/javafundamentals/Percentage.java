package com.javafundamentals;

public class Percentage {

	public static void main(String[] args) {
		
		int sub1=50,sub2=65,sub3=70,sub4=82,sub5=77,totalMarks=500,percentage=0; // Variable declaration and initialization within same line
		
    	percentage=((sub1+sub2+sub3+sub4+sub5)*100)/totalMarks; // Business logic
		
    	System.out.println(percentage);                         // print
		
	}
	
}
