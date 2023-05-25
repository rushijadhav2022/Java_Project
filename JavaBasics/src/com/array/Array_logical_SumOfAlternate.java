package com.array;
import java.util.*;
public class Array_logical_SumOfAlternate {
	
	public static void alternateSum(int arr[])
	{
		int sum=0;
		for(int i=1;i<arr.length;i=i+2)
		{
			sum=sum+arr[i];
		}
		System.out.println("SUM= "+sum);
	}

	public static void main(String[] args) {
		
            Scanner sc =new Scanner(System.in);
		    System.out.println("Enter elements of an array");
		    int a[]=new int [6];
		    for(int i=0;i<a.length;i++)
		    {
		    	a[i]=sc.nextInt();
		    }
		    
		    Array_logical_SumOfAlternate.alternateSum(a);
		    
	}

}
