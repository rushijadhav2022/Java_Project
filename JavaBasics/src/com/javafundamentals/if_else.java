package com.javafundamentals;

import java.util.Scanner;

public class if_else {

	public static void main(String[] args) {
		System.out.println("Take input of your age");
		Scanner sc = new Scanner(System.in);
		int RushiAge=sc.nextInt();
		System.out.println("Take input of your friends age");		
		int VijayAge=sc.nextInt();
		
		if(RushiAge>VijayAge)
		{
			
			System.out.println("Hi");
		}
		else if(VijayAge>RushiAge)
		{
			System.out.println("Hello");
		}
		
		else
		{
			System.out.println("How Are You");
		}
	}
	
}
