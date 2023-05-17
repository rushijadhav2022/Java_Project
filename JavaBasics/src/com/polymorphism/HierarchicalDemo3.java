package com.polymorphism;

class Mobile {

	int price;
	String type;

}

class Samsung extends Mobile {
	public void Showinfo() {
		price = 28000;
		type = "Screentouch";
		System.out.println(type + " " + price);

	}

}

class Nokia extends Mobile {
	public void showDetails() {
		price = 32000;
		type = "Screensot";
		System.out.println("Type :" + type + " " + " Price :" + price);
	}

}

public class HierarchicalDemo3 {

	public static void main(String[] args) {

		Samsung s = new Samsung();
		s.Showinfo();
		Nokia n = new Nokia();
		n.showDetails();

	}

}
