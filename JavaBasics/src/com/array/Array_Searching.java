package com.array;

import java.util.*;

public class Array_Searching {

	public void searchElement(int ar[], int n) {
		boolean isPresent = false;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == n) {
				isPresent = true;
				break;
			}
		}
		if (isPresent) {
			System.out.println("Element is present");
		} else {
			System.out.println("Element is not present");
		}
	}

	public static void main(String[] args) {
		int a[] = { 2, 4, 6, 7, 9 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Pls enter an elements");
		int num = sc.nextInt();

		Array_Searching as = new Array_Searching();
		as.searchElement(a, num);

	}

}
