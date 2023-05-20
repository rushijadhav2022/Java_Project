package com.final_keyword;

public class FinalDemo {
	
	 final int x=26;
	 
	 public FinalDemo()
	 {
		 
		// x=73;          // final field can't change.
		 
	 }
	 
	 public void show()
	 {
		 System.out.println(x);
	 }
	

	public static void main(String[] args) {
		
FinalDemo d=new FinalDemo();
System.out.println(d.x);
d.show();
		
	}

}
