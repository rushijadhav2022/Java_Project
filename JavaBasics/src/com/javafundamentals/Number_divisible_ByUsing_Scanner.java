package com.javafundamentals;

// Check Whether num is divisible by 5 and 11

import java.util.Scanner;

public class Number_divisible_ByUsing_Scanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int Number=sc.nextInt();
		if(Number%5==0 && Number%11==0)
			System.out.println("Number is divisible by 5 and 11");
		else
			System.out.println("Number is not divisible by 5 and 11");
	}
	
}
