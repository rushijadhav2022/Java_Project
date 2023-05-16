package com.test_02;

import java.util.Scanner;

public class Mobile_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a mobile number");
		long num = sc.nextLong();
		int count = 0;
		long digit = 0;
	    int i=0;
	    long copy;
	    
	    for(i=0;i<=9;i++)
	    {
	    	copy=num;
	    	count=0;
		while(copy>0)
		{
			digit=copy%10;
			if(i==digit)
			{
				count++;
			}
			
			copy=copy/10;
		}
		 System.out.println(i+" Count= "+count);
		
	    }
	    
	    
		

}
}