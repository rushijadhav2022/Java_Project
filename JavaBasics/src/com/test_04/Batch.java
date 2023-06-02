package com.test_04;

 public class Batch {

	  
	  static {int b1=1;
		  System.out.println(b1);}
	  static {int b2=2;};
	  static {int b3=3;};
	  static {int b4=4;};
	  
	  Batch()
	  {
		  System.out.println("HII");
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Batch b1 =new Batch();
		
		Batch b2 =new Batch();
		Batch b3 =new Batch();
		Batch b4 =new Batch();
	}

}
