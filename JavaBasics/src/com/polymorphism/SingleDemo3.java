package com.polymorphism;

class Sport {

	public void play() {
		System.out.println("Playing");
	}

}

class Cricket extends Sport {

	public void players() {
		System.out.println("11 players");

	}
}

public class SingleDemo3 {

	public static void main(String[] args) {

		Cricket c = new Cricket();
		c.play();
		c.players();

	}

}
