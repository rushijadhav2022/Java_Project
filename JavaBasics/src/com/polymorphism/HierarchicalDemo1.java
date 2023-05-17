package com.polymorphism;

class Sim {

	int plan;

}

class Airtel extends Sim {

	public void showPlan() {
		plan = 251;
		System.out.println("1gb for 28 days in " + plan + " rupees.");

	}

}

class VI extends Sim {

	public void showPlan() {

		plan = 249;
		System.out.println("1gb for 28 days in " + plan + " rupees.");

	}

}

public class HierarchicalDemo1 {

	public static void main(String[] args) {

		Airtel a = new Airtel();
		a.showPlan();
		VI v = new VI();
		v.showPlan();

	}

}
