package com.oops;

import java.util.Scanner;

public class Book {

	int id;
	String name;
	int price;
	String a_name;

	public Book(int id, String name, int price, String a_name) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.a_name = a_name;

	}

	public void showBook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Author Name");
		String aName = sc.nextLine();

		if (aName.equals(a_name)) {
			price = price - 50;
			System.out.println("Price of Book = " + price);
		} else {
			System.out.println("Price of book = " + price);
		}
	}

	public static void main(String[] args) {

		Book b = new Book(101, "Reality", 600, "Chetan Bhagat");

		b.showBook();
	}

}
