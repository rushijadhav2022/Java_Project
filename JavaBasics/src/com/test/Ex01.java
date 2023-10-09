package com.test;

public class Ex01 {

	public static void main(String[] args) {

		String s = "I like programming";

		String[] ss = s.split(" ");
		int i;
		for ( i = 0; i < ss.length-1; i++) {
			for(int j=i+1;j<ss.length;j++) {
				if(ss[i].length()>ss[j].length())
				{
					String temp=ss[i];
					       ss[i]=ss[j];
					       ss[j]=temp;
				}
			}
		}
           System.out.println(ss[i]); 
	}
	

}
