package com.javafundamentals;

import java.util.Scanner;

public class Check_MaxNum_byUsing_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter num1:");

		int num1 = sc.nextInt();

		System.out.println("Please enter num2:");

		int num2 = sc.nextInt();

		System.out.println("Please enter num3:");

		int num3 = sc.nextInt();

		if (num1 >= num2 && num1 >= num3) {
			System.out.println(num1 + " is the max number:");
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println(num2 + " is the max number:");
		}

	}

}
