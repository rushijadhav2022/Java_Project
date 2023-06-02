package com.array_assignment;

import java.util.*;

public class Ex_03 {

	public static void searchElement(int a[], int s, int n) {

		for (int i = 0; i < s; i++) {

			if (n == a[i]) {
				System.out.println("Element is present");

				System.out.println("index =" + i);

			}

		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter size of an array");
		int size = sc.nextInt();
		int ar[] = new int[size];
		for (int i = 0; i < size; i++) {
			ar[i] = sc.nextInt();
		}
		System.out.println("Please enter the number that u want to search");
		int num = sc.nextInt();

		searchElement(ar, size, num);
		System.out.println(Arrays.toString(ar));

	}

}
