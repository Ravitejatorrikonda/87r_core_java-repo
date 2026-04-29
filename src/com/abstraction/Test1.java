package com.abstraction;

abstract class Animal{
	public abstract void makingSound();
	
}
class Dog extends Animal{
	@Override
	public void makingSound() {
		System.out.println("Bow Bow....");
	}
	
}

public class Test1 {

	public static void main(String[] args) {
	Animal ani=new Dog();
	ani.makingSound();

	}

}
