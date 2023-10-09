package com.String_Array_Logical;
import java.util.*;
public class Replace_Owel_By_SpecialChar {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Pls enter string");
		String str=sc.nextLine();
		str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				c='$';
			}
			
			System.out.print(c);
		}

	}

}
