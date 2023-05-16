package com.oops;

public class Car {
	int modelno;
	String carName;
	int carPrice;
	String carColour;
	
	public static void main(String[] args) {
		
		Car maruti =new Car();
		maruti.modelno=23;
		maruti.carName="Swift";
		maruti.carColour="White";
		maruti.carPrice=600000;
		System.out.println(maruti.carName+" "+maruti.modelno+" "+maruti.carPrice+" "+maruti.carColour);
		
		
		Car mahindra = new Car();
		mahindra.carName="Thar";
		mahindra.modelno=34;
		mahindra.carPrice=1800000;
		mahindra.carColour="Black";
		System.out.println(mahindra.carName+" "+mahindra.modelno+" "+mahindra.carPrice+" "+mahindra.carPrice+" "+mahindra.carColour);
		
		
		Car tata = new Car();
		tata.carName="Sumo";
		tata.modelno=40;
		tata.carPrice=700000;
		tata.carColour="Grey";
		System.out.println(tata.carName+" "+tata.modelno+" "+tata.carPrice+" "+tata.carPrice+" "+tata.carColour);
		

	}

}
