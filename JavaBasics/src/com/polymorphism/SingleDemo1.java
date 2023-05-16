package com.polymorphism;

class Book {

	String booktype = "Spiritual";
    String bookname="Bhagwatgeeta";
}

class Bhagwatgeeta extends Book {

	public void show() {
		System.out.println(booktype);
		System.out.println(bookname);
	}

	public void bookDetails() {
		int price = 650;
		String lang = "All";

		System.out.println(price + " " + lang);

	}
}

public class SingleDemo1 {

	public static void main(String[] args) {

		Bhagwatgeeta b=new Bhagwatgeeta();
		b.show();
		b.bookDetails();
		
	}

}
