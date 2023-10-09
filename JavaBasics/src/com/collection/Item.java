package com.collection;

import java.util.*;

public class Item {

	int id;
	String name;
	float price;

	public Item(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	public static void show(ArrayList<Item> ar) {

		for (int i = 0; i < ar.size(); i++) {
			for (int j = i + 1; j < ar.size(); j++) {
				if (ar.get(i).price == ar.get(j).price) {
					System.out.println(ar.get(i));
					System.out.println(ar.get(j));
				}
			}
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Item> ar = new ArrayList<>();
		System.out.println("pls give size to arraylist");
		int size = sc.nextInt();
		for (int i = 1; i <= size; i++) {
			System.out.println("Pls Enter the Item id");
			int id = sc.nextInt();
			System.out.println("Pls Enter the Item name");
			String name = sc.next();
			System.out.println("Pls Enter Item Price");
			float price = sc.nextFloat();
			ar.add(new Item(id, name, price));
		}

		ListIterator list = ar.listIterator();
		while (list.hasNext()) {
			System.out.println(list.next());
		}

		show(ar);

	}

}
