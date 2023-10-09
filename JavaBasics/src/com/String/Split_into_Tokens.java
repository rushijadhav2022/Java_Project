package com.String;

public class Split_into_Tokens {

	public static void main(String[] args) {
		
		String str = "HELLO$WORLD";
		String[] tokens = str.split("\\$");
		for(int i=0;i<tokens.length;i++)
		{
			System.out.println(tokens[i]);
		}

	}

}
