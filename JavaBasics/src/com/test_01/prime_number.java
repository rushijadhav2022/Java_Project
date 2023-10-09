package com.test_01;

import java.util.Scanner;

public class prime_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter choice number");
		int choice = sc.nextInt();

		int num = 1000;
		int sum = 0;
		int count = 0;

		for (int i = 2; i <= num; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {

				if (count < choice) {
					count++;

					sum = sum + i;
				}
			}
		}
		System.out.println(sum);
	}

}
