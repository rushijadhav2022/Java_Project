package com.loops;

import java.util.Scanner;

public class DissariumNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int sum = 0;
		int copy = num;
		int count = 0;
		int power=1;
		while (num > 0) {
			count++;
			num = num / 10;
		}
		
		System.out.println(count);
		num=copy;
		while(num>0) 
		{
			int digit=num%10;
			for(int i=1;i<=count;i++)
			{
				power=power*digit;
			}
			sum=sum+power;
			count--;
			num=num/10;
	   }
		System.out.println(sum);
	}
	

}
