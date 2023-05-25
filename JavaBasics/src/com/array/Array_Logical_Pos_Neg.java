package com.array;

import java.util.*;

public class Array_Logical_Pos_Neg {

	public static void posNegCount(int arr[]) {
		int count = 0;
		int neg;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				count++;
			}
		}
		System.out.println("POS COUNT= "+count);
		neg=arr.length - count;
		System.out.println("NEG COUNT= "+neg);
	}

	public static void main(String[] args) {

		int a[] = new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("Pls enter an element of an array");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		Array_Logical_Pos_Neg.posNegCount(a);

	}

}
