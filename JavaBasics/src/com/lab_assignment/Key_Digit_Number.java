package com.lab_assignment;

import java.util.Scanner;

public class Key_Digit_Number {

	public static void main(String[] args) {

		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Enter Keydigit");
		int keydigit = sc.nextInt();
		int count = 0;
		while (num > 0) {
			int digit = num % 10;
			if (digit == keydigit) {
				count++;
			}
			num = num / 10;
			

		}
		System.out.println(count);

	}

}
