package com.array;

import java.util.Arrays;

public class Example {

	public static void main(String[] args) {

		int arr1[] = { 2, 3, 4, 5 };
		int a1 = arr1.length;
		int arr2[] = { 11, 12, 13, 14, 15, 16, 17 };
		int a2 = arr2.length;
		int arr3[] =new int[a1+a2];
		//System.out.println(arr3.length);
        int i,j;
        int k,k1;
		for(i=0,k=0;i<arr3.length;i++,k++)
		{
			arr3[k]=arr1[i];
			System.out.print(arr3[k]+" ");
			
			for(j=i,k1=0;j<i+1;j++,k1++)
			{
				arr3[k1]=arr2[j];
				System.out.print(arr3[k1]+" ");
				
			}
			
			
		}
		
		
	}
}
