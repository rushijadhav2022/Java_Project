package com.practise;

import java.util.*;

public class Element_Search {

	public static void searchElement(int a[], int n) {
		boolean isPresent = false;
		for (int i = 0; i < a.length; i++) {
			if (n == a[i]) {
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

		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Please add elements into the array");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Please enter element that u have to search in an array");
		int num = sc.nextInt();

		searchElement(a, num);

	}

}
