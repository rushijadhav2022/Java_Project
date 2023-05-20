package com.abstractInterface;



abstract class Card {
	abstract void makeCard();

}

class birthdayCard extends Card {
	void makeCard() {
		System.out.println("Hii this is Birthday invitation");
	}

}

public class AbstractDemo {

	public static void main(String[] args) {
		birthdayCard c = new birthdayCard();
		c.makeCard();

	}

}
