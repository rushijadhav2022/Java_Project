package com.array_assignment;

import java.util.Scanner;

public class Ex_06 {

	public static int Average(int a[], int s) {

		int count = 0;
		int sum = 0;
		for (int i = 0; i < s; i++) {
			count++;
			sum = sum + a[i];
		}

		int average = sum / count;
		return average;

	}

	public double Average(double arr1[], double size1) {

		double count = 0;
		double sum = 0;
		for (int i = 0; i < size1; i++) {
			count++;
			sum = sum + arr1[i];
		}

		double average = sum / count;
		return average;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Please enter the array elements");
		for (int i = 0; i < size; i++) {

			arr[i] = sc.nextInt();

		}

		System.out.println(Ex_06.Average(arr, size));

		Ex_06 n = new Ex_06();
		n.Average(arr, size);

	}

}
