package com.array_assignment;

import java.util.*;

public class Ex_09 {

	public static void evenOdd(int a[], int s) {
		int m = 0;
		int n = 0;

		for (int i = 0; i < s; i++) {
			if (a[i] % 2 == 0) {

				m++;
			} else {

				n++;
			}
		}
		int even[] = new int[m];
		int odd[] = new int[n];
		int k = 0;
		int t = 0;
		for (int i = 0; i < s; i++) {
			if (a[i] % 2 == 0) {
				even[k] = a[i];
				k++;
			} else {

				odd[t] = a[i];
				t++;
			}
		}

		System.out.println(Arrays.toString(even));
		System.out.println(Arrays.toString(odd));
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Pls give size to array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Pls add elements in array");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		evenOdd(arr, size);

	}

}
