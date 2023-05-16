package com.oops;
import com.accessmodifiers.*;
public class AccessMod extends AccessModifiers {

	public static void main(String[] args) {
		
		AccessModifiers m = new AccessModifiers();
	//	System.out.println(m.id);  //error
		//m.defaultMethod();         //error
        
		
		AccessMod s =new AccessMod();
		System.out.println(s.city);
		s.protectedMethod();
	}

}
