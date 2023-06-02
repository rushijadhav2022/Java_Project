package com.array;

public class Array_Merging {

	public static void main(String[] args) {

		int a[] = { 2, 5, 7, 8 };
		int b[] = { 1, 9, 4, 6 };
		int c[] = new int[a.length + b.length];
		int k=0;
		for(int i=0;i<a.length;i++,k++)
		{
			c[k]=a[i];
		}
		for(int i=0;i<b.length;i++,k++)
		{
			c[k]=b[i];
		}
		for(int i=0;i<a.length+b.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	}       

}
