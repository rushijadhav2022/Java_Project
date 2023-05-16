package com.javafundamentals;

import java.util.Scanner;

public class Check_Num_Even_or_Odd_BySwitchCase {

	public static void main(String[] args) {

		System.out.println("Please Enter a Number ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		switch (number % 2) {

		case 0:
			System.out.println(number + " " + "is even");
			break;
		case 1:
			System.out.println(number + " " + "is odd");
			break;
		default:
			System.out.println("Wrong input");
		}

	}

}
