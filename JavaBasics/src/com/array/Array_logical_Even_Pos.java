package com.array;
import java.util.*;
public class Array_logical_Even_Pos {
	
	public static void evenPosition(int arr[])
	{
		for(int i=0;i<arr.length;i=i+2)
		{
			System.out.println(arr[i]);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter elements of an array");
		int a[]=new int [6];
	    for(int i=0;i<a.length;i++)
	    {
	    	a[i]=sc.nextInt();
	    }  
	    
	    Array_logical_Even_Pos.evenPosition(a);
	    
	}

}
