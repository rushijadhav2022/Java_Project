package com.String_Array_Logical;

public class Reverse_String_Word_By_Word {

	public static void main(String[] args) {
		String str = "java";
		String str2;

		char[] ch = str.toCharArray();
		char c[]=new char[ch.length];
		for (int i =ch.length-1,j=0; i >= 0; i--,j++) {
			 c[j]=(char) ch[i];
			
		}
		
		//String s=String.valueOf(c);  // used to convert array into string.
		//System.out.println(s);
        String s1=new String(c);
        System.out.println(s1);
	}

}
