package com.array;

import java.util.*;

public class ArrayLogical_Sum_Of_Avg {

	public static void sumOfarray(int arr[]) {
		int sum = 0;
		int avg = 0;
		int count = 0;
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
				count++;
				sum = sum + n;
				avg = sum / count;

			}

		}
		System.out.println(avg);

	}

	public static void main(String[] args) {

		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an element of an Array");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

		}

		ArrayLogical_Sum_Of_Avg.sumOfarray(a);
	}

}
