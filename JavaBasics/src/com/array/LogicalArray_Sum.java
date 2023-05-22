package com.array;
import java.util.*;
public class LogicalArray_Sum {
	
	public static void sumArray(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
		
		sum=sum+arr[i];
		}
		System.out.println("Sum= "+sum);
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Element");
		
		int a[]=new int [5];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		LogicalArray_Sum.sumArray(a);
		
	}

}
