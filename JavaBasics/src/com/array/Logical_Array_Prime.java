package com.array;

import java.util.*;

public class Logical_Array_Prime {

	public static void findPrime(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			int n = arr[i];
			boolean isPrime = true;
			for (int j = 2; j < n; j++) {
				if (n % j == 0) {
					isPrime = false;
					break;
				}
				
			}
			if (isPrime) {
				System.out.print(arr[i]+" ");
			}

		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter an Array Element");
		int a[] = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		Logical_Array_Prime.findPrime(a);
	}

}
