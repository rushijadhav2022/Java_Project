package com.getter_setter;

public class Book {

	private int b_id;
	private String b_name;
	private int b_price;

	public void setId(int b_id) {

		this.b_id = b_id;

	}

	public void setName(String b_name) {
		this.b_name = b_name;
	}

	public void setPrice(int b_price) {
		this.b_price = b_price;
	}

	public int getId() {

		return b_id;
	}

	public String getName() {

		return b_name;
		
		
	}

	public int getPrice() {

		return b_price;
	}

}
