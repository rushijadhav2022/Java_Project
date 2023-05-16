package com.javafundamentals;

import java.util.Scanner;

public class Error_DaysProgramme_BySwitchCase {

	public static void main(String[] args) {
		int Num_Of_Day;
		String Name_Of_Day = "Unknown";
		System.out.println("Please Enter a number of Day ");
		Scanner sc = new Scanner(System.in);
		Num_Of_Day=sc.nextInt();

		switch (Num_Of_Day) {

		case 1:
			Name_Of_Day = "MONDAY";
			break;
		case 2:
			Name_Of_Day = "TUEDAY";
			break;
		case 3:
			Name_Of_Day = "WEDNESDAY";
			break;
		case 4:
			Name_Of_Day = "THURSDAY";
			break;
		case 5:
			Name_Of_Day = "FRIDAY";
			break;
		case 6:
			Name_Of_Day = "SATURDAY";
			break;
		case 7:
			Name_Of_Day = "SUNDAY";
			break;

		default:
			System.out.println("Error, day does not exist");
		}
		System.out.println(Name_Of_Day);
	}

	}


