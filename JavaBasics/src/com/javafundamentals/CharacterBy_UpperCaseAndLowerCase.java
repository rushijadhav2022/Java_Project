package com.javafundamentals;

import java.util.Scanner;

public class CharacterBy_UpperCaseAndLowerCase {

	public static void main(String[] args) {
		
		System.out.println("Take a Character as input");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		System.out.println(ch);
		if(ch>='A'&& ch<'Z')
		{
		   ch=(char)(ch+32);
		}
		else if(ch>='a'&& ch<='z')
		{
			 ch=(char)(ch-32);
		}
		else
		{
			ch=ch;
		}
		System.out.println(ch);
	}
	
	
}
