package com.String;

public class RevereseString {

	public static void main(String[] args) {
		 
		String s = "Rushikesh Jadhav";
		String[] sp = s.split(" ");
		for(int i=sp.length-1;i>=0;i--)
		{
			System.out.print(sp[i]+" ");
			
		}

	}

}
