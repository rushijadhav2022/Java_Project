package com.loops;

import java.util.Scanner;

public class Spy_Number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		int sum = 0;
		int prod = 1;
		while (num > 0) {
			int digit = num % 10;
			sum = sum + digit;
			prod = prod * digit;
			num=num/10;

		}

		if (sum == prod) {
			System.out.println("Number is Spy Number");

		}
		else
		{
			System.out.println("Number is not spy number");
		}
	}

}
