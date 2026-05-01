package com.constructor.chaining;

class Bicycle {
	String handile;
	String chain;
	String tyers;

	public Bicycle(String handile, String chain, String tyers) {
		super();
		this.handile = handile;
		this.chain = chain;
		this.tyers = tyers;
		System.out.println("Cycle object created.....");

	}
}

class Bike extends Bicycle {
	String petrolCapacity;
	String light;
	String engine;

	public Bike(String handile, String chain, String tyers, String petrolCapacity, String light, String engine) {
		super(handile, chain, tyers);
		this.petrolCapacity = petrolCapacity;
		this.light = light;
		this.engine = engine;
		System.out.println("Bike Object created ");

	}

}

public class Example4 {

	public static void main(String[] args) {

		Bike bike = new Bike("hero", "gold", "MRF", "12L", "LED", "120cc");

		System.out.println(bike.light);
		System.out.println(bike.tyers);

	}

}
