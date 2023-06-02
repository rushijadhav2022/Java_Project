package com.array_assignment;

import java.util.*;

public class Ex_08 {

	public static void negativeElements(int a[], int s) {
		int count = 0;
		for (int i = 0; i < s; i++) {
			if (a[i] < 0) {
				count++;
				System.out.println(a[i] + " ");
			}
		}

		System.out.println("Count of negative elements = " + count);

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

		System.out.println(Arrays.toString(arr));

		negativeElements(arr, size);

	}

}
