package com.test_04;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		System.out.println("Pls Enter an Input");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		for (int i = 1; i <= input; i = (2 * i )+ 1) {

//			
			System.out.println(i);
		}

	}

}
