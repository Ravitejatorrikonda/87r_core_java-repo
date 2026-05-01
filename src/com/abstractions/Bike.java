package com.abstractions;

public class Bike extends Vehicle {
	String hasSidecar;

	public Bike(String modelName, int vechileNumber, String company, String hasSidecar) {
		super(modelName, vechileNumber, company);
		this.hasSidecar = hasSidecar;
	}

	@Override
	public void startEngine() {
		System.out.println("Starting engine with kick-start.");
	}

	@Override
	public void Touchscreen() {
		// TODO Auto-generated method stub
		
	}
	
	


}
