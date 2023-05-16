package com.loops;

public class HarshadNumber {

	public static void main(String[] args) {
		
		int num=156;
		int copy=num;
		int sum=0;
		while(num>0)
		{
			int digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
	//	num=copy;
		if(copy%sum==0)
		{
			System.out.println("Harshad Number");
		}
		else
		{
			System.out.println("Not harshad Number");
		}

	}

}
