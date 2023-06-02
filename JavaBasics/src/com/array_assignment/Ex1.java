package com.array_assignment;

// Adding elements in array and display
import java.util.*;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the no.of elements u want in array");
		int n = sc.nextInt();
		System.out.println("Pls enter the array elements");
		int ar[] = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}

		for (int a : ar) {
			System.out.println(a + " ");
		}

		System.out.println("==================================================================");

		System.out.println(Arrays.toString(ar));

	}

}
