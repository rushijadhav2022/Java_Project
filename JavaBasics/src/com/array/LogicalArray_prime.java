package com.array;

import java.util.*;

public class LogicalArray_prime {
	boolean isPrime = true;

	public static boolean checkPrime(int n) {
		boolean isPrime = true;
		for (int j = 2; j < n; j++) {
			if (n % j == 0) {
				isPrime = false;
				break;
			}
		}

		return isPrime;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an Array element");
		int a[] = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			if (checkPrime(a[i])) {
				System.out.println(a[i]);
			}
		}
	}

}
