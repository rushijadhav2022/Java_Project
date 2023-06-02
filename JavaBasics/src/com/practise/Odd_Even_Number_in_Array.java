package com.practise;

import java.util.*;

public class Odd_Even_Number_in_Array {

	public static void odd_Even(int a[], int n) {
		System.out.print("Even  ");
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {

				System.out.print(a[i] + " ");
			}

		}
		System.out.println();

		System.out.print("Odd  ");
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 1) {

				System.out.print(a[i] + " ");
			}

		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Pls enter number of element that u want ");
		int num = sc.nextInt();
		int ar[] = new int[num];
		System.out.println("Pls enter elements of an array");
		for (int i = 0; i < num; i++) {
			ar[i] = sc.nextInt();
		}

		odd_Even(ar, num);

	}

}
