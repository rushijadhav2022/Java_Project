package com.String;

public class stringDemo {

	public static void main(String[] args) {

		String s = "java,c,c++,python"; // split method
		String st[] = s.split(",");
		for (String s1 : st) {
			System.out.println(s1);
		}

		char ch[] = { 'w', 'e', 'l', 'c', 'o', 'm', 'e' }; // conversion of char into string.

		String r = new String(ch);
		System.out.println(r);

		String d = "India is my counrty"; // substring method
		String d1 = d.substring(2);
		String d2 = d.substring(2, 10);
		System.out.println(d1);

		String str = "Rock";
		String str1 = "Star";
		String str3 = str.concat(str1);
		System.out.println(str3);

		String v = "Rushikesh";
		System.out.println(v.length());
		System.out.println(v.contains("kesh"));
		System.out.println(v.endsWith("h"));       // endsWith()...return true or false
		System.out.println(v.replace("Rushi", "rushi"));
		System.out.println(v.replaceAll(v, "Jadhav"));
		

		String a = "Vita the golden city";
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.charAt(7)); // charAt();
		System.out.println(a.indexOf('t')); // indexOf();
		System.out.println(a.lastIndexOf('t')); // lastIndexof();
		System.out.println(a.compareTo("Vita the golden city"));
		System.out.println(a.compareToIgnoreCase("VIta the golden city"));

	}

}
