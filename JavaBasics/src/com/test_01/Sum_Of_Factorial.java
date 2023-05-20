package com.test_01;

public class Sum_Of_Factorial {

	public static void main(String[] args) {
		
		int fact=1;
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			fact=fact*i;
			sum=sum+fact;
		}
		System.out.println(sum);
	}

}
