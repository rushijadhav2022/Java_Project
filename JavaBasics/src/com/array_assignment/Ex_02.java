package com.array_assignment;

import java.util.*;

public class Ex_02 {

	public static void averageArray(int a[], int num) {

		int sum = 0;
		for (int i = 0; i < num; i++) {

			sum = sum + a[i];

		}
		int avg = sum / num;
		System.out.println("Average of an array is = "+avg);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide array size");
		int num = sc.nextInt();
		int ar[] = new int[num];
		for (int i = 0; i < num; i++) {
			ar[i] = sc.nextInt();
		}

		averageArray(ar, num);

	}

}
