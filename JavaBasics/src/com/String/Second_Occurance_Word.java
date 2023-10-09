package com.String;

public class Second_Occurance_Word {

	public static void main(String[] args) {
		
		String str = "india is my country i love my india";
		
		String[]a=str.split(" ");
		
		//System.out.println(a.length);
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].equals(a[j]))
				{
					System.out.println(a[j]+" "+j);
				}
			}
		}

	}

}
