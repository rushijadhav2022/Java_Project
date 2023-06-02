package com.array_assignment;

import java.util.*;

public class EXN_07 {

	public static void positionedArray(int arr[], int size, int num, int pos) {

		int newarr[] = new int[size + 1];
		for (int i = 0; i < size + 1; i++) {
			if (i < pos - 1) {
				newarr[i] = arr[i];
			} else if (i == pos - 1) {
				newarr[i] = num;
			} else {
				newarr[i] = arr[i - 1];
			}
		}

		System.out.println(Arrays.toString(newarr));

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide size to the array");
		int size = sc.nextInt();
		System.out.println("Please add elements into array");
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Please enter element that u have to positioned");
		int num = sc.nextInt();

		System.out.println("pls enter the position where that element have to add");
		int pos = sc.nextInt();

		positionedArray(arr, size, num, pos);

	}

}
