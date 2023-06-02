package com.twoD_array;

import java.util.*;

public class Prac {

	public static void maxNum(int a[]) {

		int Maxnum = a[0];
		for (int i = 0; i < a.length; i++) {
			if (Maxnum < a[i]) {
				Maxnum = a[i];
			}
		}

		System.out.println(Maxnum);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter array elements");
		int a[] = new int[4];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

		}

		maxNum(a);

	}

}
