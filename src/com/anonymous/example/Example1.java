package com.anonymous.example;

interface Animal {
	void makingSound();
}



public class Example1 {

	public static void main(String[] args) {
		
		Animal ani2 = new Animal() {

			public void makingSound() {
                  System.out.println("Bow Bow 2....");
			}
		};

		ani2.makingSound();

	}

}
