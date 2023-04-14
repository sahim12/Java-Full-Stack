package com.cg.oops;

abstract class Animal{
	abstract void walk();
}

 class Horse extends Animal{
	public void Walk() {
		System.out.println("Walks On Four Leg");
	}

	@Override
	void walk() {
		System.out.println("Walks On Four Leg");
	}
}
 class Chicken extends Animal{
	public void Walk() {
		System.out.println("Walks On Two Legs");
	}

	@Override
	void walk() {
		
	}
}

public class Abstraction {

	public static void main(String[] args) {
		Horse h1 = new Horse();
		h1.walk();
		

	}

}
