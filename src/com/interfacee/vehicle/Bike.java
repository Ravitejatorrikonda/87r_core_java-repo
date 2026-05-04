package com.interfacee.vehicle;

public class Bike implements Vehicle {

	@Override
	public void accelarate() {
		System.out.println("Accelarating the Bike");
		
	}

	@Override
	public void showspeed() {
		System.out.println("Bike going 100 speed");
		
	}

	@Override
	public void brake() {
		System.out.println("Bike applying brakes ");
		
	}

	@Override
	public boolean pollutioncheck() {
		// TODO Auto-generated method stub
		return false;
	}

}
