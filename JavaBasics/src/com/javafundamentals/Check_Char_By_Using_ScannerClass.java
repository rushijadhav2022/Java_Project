package com.javafundamentals;

import java.util.Scanner;

public class Check_Char_By_Using_ScannerClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enrter a charater");

		char ch = sc.next().charAt(0);

		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println(ch + " charater is albhabet ");

		} else if (ch >= '0' && ch <= '9') {
			System.out.println(ch + " charater is digit ");
		} else {
			System.out.println(ch + " charater is special character ");
		}

	}
}
