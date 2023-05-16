package com.getter_setter;

import java.util.Scanner;

public class Concrete_car {

	

	public static void main(String[] args) {

		Car c = new Car();

		c.setmodNo(124);
		c.setcarName("Mahindra_xuv300");
		c.setspeedLimit(80);
		System.out.println("Enter your car speed");
		Scanner sc = new Scanner(System.in);
		int speed = sc.nextInt();
		if (speed > c.getspeedLimit()) {
			System.out.println("Speed limit exceeds");
		} else {

			System.out.println(" CarName : " + c.getCarname() + " Model_No : " + c.getModno() + " Speed_Limit : "
					+ c.getspeedLimit());
		}
	}

}
