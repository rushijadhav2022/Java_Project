package com.String_Array_Logical;

public class Anagram {

	public static void main(String[] args) {

		String str1 = "ram";
		String str2 = "arm";
		if (str1.length() != str2.length()) {
			System.out.println("not anagram");
		}

		char temp1;
		char[] c1 = str1.toCharArray();

		for (int i = 0; i < c1.length; i++) {
			for (int j = i + 1; j < c1.length; j++) {
				if (c1[i] > c1[j]) {
					temp1 = c1[i];
					c1[i] = c1[j];
					c1[j] = temp1;
				}

			}
		}
		System.out.println(c1);

		char[] c2 = str2.toCharArray();
		char temp2;
		for (int k = 0; k < c2.length; k++) {
			for (int l = k + 1; l < c2.length; l++) {
				if (c2[k] > c2[l]) {
					temp2 = c2[k];
					c2[k] = c2[l];
					c2[l] = temp2;
				}

			}
		}
		System.out.println(c2);
		
		boolean flag=true;
		for(int i1=0,j1=0;i1<c1.length;i1++,j1++)
		{
			
				if(c1[i1]!=c2[j1])
				{
					flag=false;
					break;
				}
				
			
		}
		if(flag==true)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not anagram");
		}

	}

}
