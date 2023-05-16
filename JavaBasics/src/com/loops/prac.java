package com.loops;

import java.util.Scanner;

public class prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int count = 0;

		while (num > 0) {
			int digit = num % 10;          // 0123  not duck
			                               // 1234  not duck
			if (digit == 0) {              //  012302 not duck
				count++;                   //   1204   duck
				break;                    //    12004  not duck
			}
			num = num / 10;

		}

		if (count == 1) {
			System.out.println(" not duck");
		} else {

			System.out.println("duck");
		}
	}

}
