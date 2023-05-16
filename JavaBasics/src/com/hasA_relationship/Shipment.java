package com.hasA_relationship;

class Order {

	int ord_id;
	int cust_id;
	String ord_city;

	public Order(int ord_id, int cust_id, String ord_city) {

		this.ord_id = ord_id;
		this.cust_id = cust_id;
		this.ord_city = ord_city;

	}

}

class Mydate {	
	int mm;
	int dd;
	int yy;

	public Mydate(int mm, int dd, int yy) {
		this.mm = mm;
		this.dd = dd;
		this.yy = yy;

	}

}

public class Shipment {

	int ship_id;
	Order o;
	Mydate d;

	public Shipment(int ship_id, Order o, Mydate d) {
		this.ship_id = ship_id;
		this.o = o;
		this.d = d;

	}

	public static void main(String[] args) {

		Shipment sh = new Shipment(101, new Order(23, 124, "Vita"), new Mydate(5, 15, 2023));

		System.out.println(sh.ship_id + " " + sh.o.ord_id + " " + sh.o.cust_id + " " + sh.o.ord_city + " " + sh.d.mm
				+ " " + sh.d.dd + " " + sh.d.yy);

	}

}
