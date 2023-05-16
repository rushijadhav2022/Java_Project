package com.hasA_relationship;

class Nib {

	int nibprice;
	String nibtype;

	public Nib(int nibprice, String nibtype) {
		this.nibprice = nibprice;
		this.nibtype = nibtype;

	}

	public String toString() {
		return nibprice + " " + nibtype;

	}

}

class Pen {

	String pcolour;
	String pname;
	int pprice;
	Nib ni;

	public Pen(String pcolour, String pname, int pprice, Nib ni) {
		this.pcolour = pcolour;
		this.pname = pname;
		this.pprice = pprice;
		this.ni = ni;

	}

	public String toString() {
		return pcolour + " " + pname + " " + pprice + " " + ni;

	}

}

public class Bag {

	String brandname;
	int price;
	Pen p;

	public Bag(String brandname, int price, Pen p) {
		this.brandname = brandname;
		this.price = price;
		this.p = p;
	}

	public String toString() {
		return brandname + " " + price + " " + p;

	}

	public static void main(String[] args) {
		Bag b = new Bag("SkyBag", 1000, new Pen("Blue", "Cello", 10, new Nib(5, "Point")));

		System.out.println(b);

	}

}
