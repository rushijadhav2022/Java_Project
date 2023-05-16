package com.javafundamentals;

// check whether year is leap year or not

import java.util.Scanner;

public class LeapYear_Programme {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Year ");
		int year = sc.nextInt();
				
		if(year%4==0 || year%400==0 )
			System.out.println("Specified year is a leap year");
		
		else
			System.out.println("Specified year is not an leap year");
		
		
	}
}
