package com.lab_assignment;

public class String_Array {

	public static void main(String[] args) {

		String arr[] = { "red", "yellow", "green", "blue" };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].compareTo(arr[j]) > 0) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i] + " ");
		}

	}

}
