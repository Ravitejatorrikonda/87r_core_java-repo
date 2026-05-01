package com.abstractions;

public class Truck extends Vehicle{
	double cargoCapacity;

	public Truck(String modelName, int vechileNumber, String company, double cargoCapacity) {
		super(modelName, vechileNumber, company);
		this.cargoCapacity = cargoCapacity;
	}

	@Override
	public void startEngine() {
		System.out.println("\"Starting engine with heavy-load warm-up.\"");
		
	}
	
	@Override
	public void fuelType() {
		System.out.println("Diesel");
	}

	@Override
	public void Touchscreen() {
		// TODO Auto-generated method stub
		
	}
	

}
