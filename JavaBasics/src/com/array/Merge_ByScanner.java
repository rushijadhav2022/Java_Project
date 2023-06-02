package com.array;

import java.util.*;

public class Merge_ByScanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1 = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n1];
		int c[] = new int[a.length + b.length];
		int k = 0;
		System.out.println("Please enter a element");
		for (int i = 0; i < n; i++) {

			a[i] = sc.nextInt();
		}
		System.out.println("Please enter a element");
		for (int i = 0; i < n1; i++) {

			b[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++, k++) {
			c[k] = a[i];
		}

		for (int i=0;i<n1; i++, k++) {
			c[k] = b[i];
		}

		for (int i = 0; i < n + n1; i++) {
			System.out.print(c[i]+" ");
		}
	}

}
