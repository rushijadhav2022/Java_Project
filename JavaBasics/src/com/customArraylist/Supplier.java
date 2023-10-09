package com.customArraylist;

import java.util.*;

class Items {

	int i_id;
	String i_name;
	float i_price;

	public Items(int i_id, String i_name, float i_price) {
		this.i_id = i_id;
		this.i_name = i_name;
		this.i_price = i_price;
	}

	@Override
	public String toString() {
		return "Items [i_id=" + i_id + ", i_name=" + i_name + ", i_price=" + i_price + "]";
	}

}

public class Supplier {

	int s_id;
	String name;
	Items i;

	public Supplier(int s_id, String name, Items i) {
		super();
		this.s_id = s_id;
		this.name = name;
		this.i = i;
	}

	@Override
	public String toString() {
		return "Supplier [s_id=" + s_id + ", name=" + name + ", i=" + i + "]";
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Supplier> sp = new ArrayList<>();
		System.out.println("Pls give size to arraylist");
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("Pls enter the supplier id");
			int s_id = sc.nextInt();
			System.out.println("Pls enter the supplier name");
			String s_name = sc.next();
			System.out.println("pls enter the id of items");
			int id = sc.nextInt();
			System.out.println("Pls enter the name of item");
			String i_name = sc.next();
			System.out.println("Pls enter the item price");
			float i_price = sc.nextFloat();

			sp.add(new Supplier(s_id, s_name, new Items(id, i_name, i_price)));

		}
		System.out.println(sp);

		for (Supplier s : sp) {
			if (s.i.i_price > 100) {
				System.out.println(s.name);
			}
		}
	}

}
