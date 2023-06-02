package com.twoD_array;

import java.util.*;

public class Demo2d {

	public static void main(String[] args) {

//		int a[][]= {{3,4,2},
//				   {6,4,1},
//				   {9,5,1}};

		int arr[][] = new int[3][2];
//		arr[0][0] = 5;
//		arr[0][1] = 2;
//		arr[1][0] = 7;
//		arr[1][1] = 8;
//		arr[2][0] = 1;
//		arr[2][1] = 5;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the array element");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("--------------------------------------");

		for (int x[] : arr) {
			for (int y : x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}

}
