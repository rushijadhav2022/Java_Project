package com.array;

import java.util.*;

public class Array_Logical_Max_Min {
	
	public static void Max_Min(int arr[])
	{
		  int maxNum=arr[0];
		  int minNum=arr[0];
	  for(int i=0;i<arr.length;i++)
	  {
		  if(maxNum<arr[i])
		  {
			  maxNum=arr[i];
		  }
		  
	  }
	  System.out.println("MAX NUM= "+maxNum);
	  for(int i=0;i<arr.length;i++)
	  {
		  if(minNum>arr[i])
		  {
			minNum=arr[i];  
		  }
		  
	  }
	  System.out.println("MIN NUM= "+minNum);
	}

	public static void main(String[] args) {

		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an element of an array");
		for (int i = 0; i < a.length; i++) {
             a[i]=sc.nextInt();
			
		}
		Array_Logical_Max_Min.Max_Min(a);

	}

}
