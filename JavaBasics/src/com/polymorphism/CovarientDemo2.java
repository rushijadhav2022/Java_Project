package com.polymorphism;

public class CovarientDemo2 {

	public static void main(String[] args) {
		
		
		class Animal {
		    public Animal reproduce() {
		        System.out.println("Animal reproducing...");
		        return new Animal();
		    }
		}

		class Dog extends Animal {
		    @Override
		    public Dog reproduce() {
		        System.out.println("Dog reproducing...");
		        return new Dog();
		    }
		}
		


	}

}
