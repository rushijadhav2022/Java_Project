package com.array_assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Max_Min_Array {

	public static void maxMin(int a[], int size) {
		int min = a[0];
		for (int i = 0; i < size; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}

		System.out.println("min = " + min);

		int max = a[0];
		for (int i = 0; i < size; i++) {
			if (min < a[i]) {
				max = a[i];
			}
		}

		System.out.println("max = " + max);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("pls give size to array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Pls add elements in the array");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(arr));

		maxMin(arr, size);

	}

}
