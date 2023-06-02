package com.practise;

import java.util.*;

public class Sort_Array_AscendingOrder {

	public static void sortAcsending(int a[]) {
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

	public static void main(String[] args) {

		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter array elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		sortAcsending(a);

	}

}
