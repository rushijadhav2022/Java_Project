package com.loops;

import java.util.Scanner;

public class PrimeNumber_ByWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int i = 2;
		boolean isPrime = true;
		while (num > i) {
			if (num % i == 0) {
				isPrime = false;
				break;

			}
			i++;
		}

		if (isPrime == true) {

			System.out.println("Prime");

		} else {

			System.out.println("Not prime");
		}
	}

}
