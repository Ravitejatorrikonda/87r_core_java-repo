package com.abstractions;

public class Car extends Vehicle {
	int numberOfDoors;
	String hasSunroof;
	
	

	public Car(String modelName, int vechileNumber, String company, int numberOfDoors, String hasSunroof) {
		super(modelName, vechileNumber, company);
		this.numberOfDoors = numberOfDoors;
		this.hasSunroof = hasSunroof;
	}

//  public void Touchscreen() {
//	  
//  }

	@Override
	public void startEngine() {
		System.out.println("Starting engine with key ignition.");
		
	}

	@Override
	public void Touchscreen() {
		// TODO Auto-generated method stub
		
	}
	
	
	  

}
