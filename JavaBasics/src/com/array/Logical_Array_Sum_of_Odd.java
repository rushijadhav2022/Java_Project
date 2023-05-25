package com.array;

import java.util.*;

public class Logical_Array_Sum_of_Odd {
	
	
	public static void sumOfOdd(int arr[])
	{     int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]%2!=0)
			{
				sum=sum+arr[i];
			}
		}
		System.out.println("Sum= "+sum);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element of array");
		int a[] = new int[6];
		for (int i = 0; i < a.length; i++) {

			a[i] = sc.nextInt();

		}
		
		Logical_Array_Sum_of_Odd.sumOfOdd(a);
		

	}

}
