package com.array_assignment;

import java.util.*;

public class Ex_05 {

	public static void reverseBackward(int a[], int size) {

		int j = size - 1;
		for (int i = 0; i < size / 2; i++) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			j--;
		}

		for (int i = 0; i < size; i++) {
			a[i] = a[i] - 2;
		}

		System.out.println(Arrays.toString(a));

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Pls enter the size of an array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Pls enter the elements in array");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		// System.out.println(Arrays.toString(arr));

		reverseBackward(arr, size);

	}

}
