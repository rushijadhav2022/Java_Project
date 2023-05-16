package com.javafundamentals;

// Check Grades According to Percentage

public class Grade_Base_Percentage {

	public static void main(String[] args) {

		float percentage = 84.00f;

		if (percentage > 90) {
			System.out.println("Grade: A++");
		} else if (percentage > 80) {
			System.out.println("Grade: A+");
		} else if (percentage > 70) {
			System.out.println("Grade: A");
		} else if (percentage > 60) {
			System.out.println("Grade: B");
		} else if (percentage > 50) {
			System.out.println("Grade: C");
		} else if (percentage > 35) {
			System.out.println("Grade: D ");
		} else {
			System.out.println("Fail...");
		}
	}
}
