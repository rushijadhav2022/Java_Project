package com.oops;

public class Shopping {
	
	int customerid;
	String productName;
	int productPrice;
	int quantity;
	int billAmount;
	
	public void accept_shopping_details(int id,String prodName,int prodprice,int quant)
	{
		customerid=id;
		productName=prodName;
		productPrice=prodprice;
		quantity=quant;
	}
	
	
	
	public void display_shoppingWithBill()
	{
		
		System.out.println(customerid+" "+productName+" "+productPrice+" "+quantity+" ");
		
		
	}
	
	public void calculate_bill()
	{
		int bill;
		
		if(quantity>0)
		{
			 bill=quantity*productPrice;
			System.out.println(bill);
		}
		else 
		{
		
			System.out.println("Error");
		}
		
		
	}
	

	public static void main(String[] args) {
		
		
		Shopping shop =new Shopping();
		shop.accept_shopping_details(1, "Shoes", 1600, 2);
		
		shop.display_shoppingWithBill();
		shop.calculate_bill();

	}

}
