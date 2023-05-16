package com.test_01;

public class Spy_Number {

	public static void main(String[] args) {

		int num = 3;
		int sum = 0;
		int prod = 1;
		while (num > 0) {
			int digit = num % 10;
			sum = sum + digit;
			prod = prod * digit;
            num=num/10;
		}
		
		if(sum==prod)
		{
			System.out.println("Spy Number");
			
		}
		else
		{
			
			System.out.println("Not a spy number");
			
		}
			
	}

}
