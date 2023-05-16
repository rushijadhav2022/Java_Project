package com.getter_setter;

import java.util.*;

public class Book_Concrete {

	public static void main(String[] args) {

		Book b = new Book();

		b.setId(124);
		b.setName("BhagwatGeeta");
		b.setPrice(500);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter book name");
		String book=sc.next();
		if(book.equals(b.getName()))
		{
			int dis=(5*500/100);
			int disPrice=b.getPrice()-dis;
			System.out.println("Book Price ="+disPrice);
		}
		else {
			
			System.out.println("Book Price ="+ b.getPrice());
		}
		System.out.println("Book_id "+b.getId());
		System.out.println("Book_Name "+b.getName());
		

	}

}
