package com.array;

import java.util.*;

public class Create_Array {

	public static void main(String[] args) {

		int arr[] = { 7, 4, 52, 3 }; // Way of declaring array

		int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;

		for (int i = 0; i <= a.length - 1; i++) // Display by for loop
		{
			System.out.println(a[i]);
		}

		System.out.println("By Enhance for loop-------------------------------");

		for (int x : a) {
			System.out.println(x);
		}

		System.out.println("By String way....................");

		System.out.println(Arrays.toString(a));
	}

}
