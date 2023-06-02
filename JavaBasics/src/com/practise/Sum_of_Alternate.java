package com.practise;

public class Sum_of_Alternate {

	public static void main(String[] args) {
		
		int a[]= {2,3,4,5,6};
		int sum=0;
		for(int i=0;i<a.length;i=i+2)
		{
			sum=sum+a[i];
		}
         System.out.println(sum);
	}

}
