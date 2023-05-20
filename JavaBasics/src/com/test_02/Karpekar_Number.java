package com.test_02;

import java.util.Scanner;

public class Karpekar_Number {

	public static void main(String[] args) {

		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num1 = num * num;
		int count = 0;
		int sum = 0;
		int digit = 0;
		int copy=num1;
		while (num1 > 0) {
			digit = num1 % 10;
			count++;
			num1 = num1 / 10;
		}
		

		if (count == 2) {
			while (copy > 0) {
				digit = copy % 10;
				sum = sum + digit;
				copy = copy / 10;
			}

			if (sum == num) {
				System.out.println("Kaprekar");

			} else {
				System.out.println("Not Kaprekar");
			}

		} else if (count == 4) {
			while (copy > 0) {
				digit = copy % 100;
				sum = sum + digit;
				copy = copy / 100;
			}

			if (sum == num) {
				System.out.println("Kaprekar");

			} else {
				System.out.println("Not Kaprekar");
			}
		} else if (count == 5) {
			while (copy > 0) {
				digit = copy % 1000;
				sum = sum + digit;
				copy = copy / 1000;
			}

			if (sum == num) {
				System.out.println("Kaprekar");

			} else {
				System.out.println("Not Kaprekar");
			}
		}

	
	
	}
}
