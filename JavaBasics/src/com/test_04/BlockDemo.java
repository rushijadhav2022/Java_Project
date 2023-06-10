package com.test_04;

public class BlockDemo {
	static String s;

	static StringBuffer str = new StringBuffer(" ");
	static {

		s = "Saturday";
		System.out.println(" sblock " + s);
	}
	{
		s=s.substring(1);
		System.out.println(" isblock "+s);
	}

	BlockDemo() {
		str = str.append(s.substring(1));
		System.out.println(" constructor " + str);
	}

	public static void main(String[] args) {

		BlockDemo b1 = new BlockDemo();
		BlockDemo b2 = new BlockDemo();
		BlockDemo b3 = new BlockDemo();

	}

}
