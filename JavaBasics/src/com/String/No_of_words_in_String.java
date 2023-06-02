package com.String;

import java.util.Scanner;

public class No_of_words_in_String {

	public static void countOfWords(String st) {
		 int count=0;
		String [] s=st.split(" ");
		for(int i=0;i<s.length;i++)
		{
			count++;
		}
		System.out.println(count);
		

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Pls enter string");
		String st = sc.nextLine();

		No_of_words_in_String.countOfWords(st);

	}

}
