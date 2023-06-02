package com.array;

import java.util.Arrays;

public class Array_addition_Method_Approach {

	public static void add(int a[], int b[]) {
		int c[] = new int[a.length];
		for(int i=0,j=0,k=0;i<a.length;i++,j++,k++)
		{
			c[k]=a[i]+b[j];
		}
		System.out.println(Arrays.toString(c));
	}

	public static void main(String[] args) {

		int a[] = { 2, 4, 5, 7, 9 };
		int b[] = { 3, 7, 8, 5, 4 };

		add(a, b);

	}

}
