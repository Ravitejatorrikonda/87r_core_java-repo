package com.interfacee.vehicle;

public class Car implements Vehicle {

	@Override
	public void accelarate() {
		System.out.println("Accelarating the car");
		
	}

	@Override
	public void showspeed() {
		System.out.println("Car going 100 speed");
		
	}

	@Override
	public void brake() {
		System.out.println("car applying brakes ");
		
	}

	@Override
	public boolean pollutioncheck() {
		// TODO Auto-generated method stub
		return false;
	}

}
