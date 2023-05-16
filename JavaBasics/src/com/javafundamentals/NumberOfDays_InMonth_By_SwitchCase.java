package com.javafundamentals;

import java.util.Scanner;

public class NumberOfDays_InMonth_By_SwitchCase {

	public static void main(String[] args) {

		int months;
		int year;
		String NameOfMonth = "Unknown";
		int NumberOfDays = 0;
		System.out.println("Please Enter a Number of Month ");
		Scanner sc = new Scanner(System.in);
		months = sc.nextInt();
		System.out.println("Please Enter A Year ");
		year = sc.nextInt();
		switch (months) {

		case 1:
			NameOfMonth = "January";
			NumberOfDays = 31;
			break;

		case 2:
			NameOfMonth = "February";
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 == 0))) {
				NumberOfDays = 29;

			} else {
				NumberOfDays = 28;
			}
			break;
		case 3:
			NameOfMonth = "March";
			NumberOfDays = 29;
			break;
		case 4:
			NameOfMonth = "April";
			NumberOfDays = 30;
			break;
		case 5:
			NameOfMonth = "May";
			NumberOfDays = 31;
			break;
		case 6:
			NameOfMonth = "June";
			NumberOfDays = 30;
			break;
		case 7:
			NameOfMonth = "July";
			NumberOfDays = 31;
			break;
		case 8:
			NameOfMonth = "August";
			NumberOfDays = 31;
			break;
		case 9:
			NameOfMonth = "September";
			NumberOfDays = 30;
			break;
		case 10:
			NameOfMonth = "October";
			NumberOfDays = 31;
			break;
		case 11:
			NameOfMonth = "November";
			NumberOfDays = 30;
			break;
		case 12:
			NameOfMonth = "December";
			NumberOfDays = 31;
			break;
		default:
			System.out.println("Wrong input");
		}
		System.out.println(NameOfMonth+" "+ year+" "+ "has " + NumberOfDays+ " "+"days");

	}

}
