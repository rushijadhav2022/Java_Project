package com.String;

import java.util.Scanner;

public class Digit_String {

	public static void digitString(String st) {
		for (int i = 0; i < st.length(); i++) {
			char c = st.charAt(i);
			System.out.println(c);
           if((c>='0')||(c<='9'))
           {
        	  System.out.println(c); 
           }
           else
           {
        	   break;
           }
			
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.next();

		digitString(str);

	}

}
