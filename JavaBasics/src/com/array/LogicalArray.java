package com.array;

import java.util.*;

public class LogicalArray {

	public static void findEven(int a[]) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.print(a[i] + " ");
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Elements");

		int[] a = new int[5];

		for (int i = 0; i <a.length; i++) {
			a[i] = sc.nextInt();
		}

		LogicalArray.findEven(a);

	}

}
