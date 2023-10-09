package com.String;
import java.util.*;
public class First_Occurance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Pls enter the string");
		String str=sc.nextLine();
		System.out.println("pls enter the char that u want to find occurance");
        char ch=sc.next().charAt(0);
        for(int i=0;i<str.length();i++)
        {
        	if(str.charAt(i)==ch)
        	{
        		System.out.println(i);
        		break;
        	}
        }
	}

}
