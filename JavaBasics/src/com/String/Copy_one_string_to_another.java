package com.String;
// copy one string to another string
public class Copy_one_string_to_another {

	public static void main(String[] args) {
	
		String str="Welcome to java";
		String str1="";
		
		for(int i=0;i<str.length();i++)
		{
			str1=str1+str.charAt(i);
		}
		
		System.out.println(str1);

	}

}
