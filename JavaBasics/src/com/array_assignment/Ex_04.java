package com.array_assignment;

import java.util.*;

public class Ex_04 {

	public static void copyArray(int a[], int size) {
		for (int i = 0; i < size; i++) {
			for (int j = i; j <= i; j++) {
				a[j] = a[i];

			}

		}

		System.out.println(Arrays.toString(a));

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Pls provide size");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("pls enter elements in array");
		for (int i = 0; i < n; i++) {

			arr[i] = sc.nextInt();

		}
		System.out.println(Arrays.toString(arr));

		copyArray(arr, n);

	}

}
