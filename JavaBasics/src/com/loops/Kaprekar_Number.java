package com.loops;
import java.util.Scanner;
public class Kaprekar_Number {

	public static void main(String[] args) {
 
		System.out.println("Enter Number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int num1 = num * num;
		int sum = 0;

		while (num1 > 0) {
			int digit = num1 % 10;
			sum = sum + digit;
			num1 = num1 / 10;
		}

		if (sum == num) {
			System.out.println("Kaprekar");

		} else {
			System.out.println("Not Kaprekar");
		}

	}

}
