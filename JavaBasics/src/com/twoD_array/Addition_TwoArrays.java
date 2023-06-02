package com.twoD_array;

public class Addition_TwoArrays {

	public static void main(String[] args) {
		
		int a1[][]= {{1,3,4},{2,4,3},{4,3,5}};
		int a2[][]= {{1,3,4},{2,4,3},{1,2,4}};
		int a3[][]= new int[3][3];
		
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a2[i].length;j++)
			{
			 a3[i][j]=a1[i][j]+a2[i][j];
			 
			 System.out.print(a3[i][j]);
			}
			System.out.println();
		}

	}

}
