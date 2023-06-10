package com.lab_assignment;

public class Concrete_Book {

	public static void main(String[] args) {

		Book b = new Book();
		b.setId(101);
		b.setBook_name("Java");
		b.setPrice(600);
		b.getId();
		// b.getBook_name();
		b.getPrice();

		if (b.getBook_name() == "Java") {
			int discount = (600 * 10) / 100;
			int Discounted_price = b.getPrice() - discount;
			System.out.println("Discounted Price = " + Discounted_price);
		} else if (b.getBook_name() == "C") {
			System.out.println(b.getPrice());
		}
	}

}
