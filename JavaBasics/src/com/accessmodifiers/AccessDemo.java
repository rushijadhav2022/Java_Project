package com.accessmodifiers;

public class AccessDemo {

	public static void main(String[] args) {
		
		AccessModifiers c =new AccessModifiers();
		//System.out.println(c.name); // error
		//c.privateMethod();   // error
        System.out.println(c.id);
        c.defaultMethod();
	}

}
