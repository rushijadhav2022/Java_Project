package com.String;
import java.util.Scanner;
public class Count_characters_from_String {
	
	public static void CountChar(String st)
	{
		int count=0;
		for(int i=0;i<st.length();i++)
		{
			count++;
		}
		System.out.println("Count = "+count);
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Pls enter string");
		String st=sc.next();
		
		CountChar(st);

	}

}
