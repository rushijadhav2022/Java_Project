package com.javafundamentals;

public class SwitchCase_By_String_Function {

	public static void main(String[] args) {
		
		String st = "happy";
		
		switch(st)
		{
		
		case  "Happy" : System.out.println("Happy");
		break;
		case  "New"   : System.out.println("New");
		break;
		case  "Year"  : System.out.println("Year");
		break;
		default : System.out.println("Wrong Input");
		}

	}

}
