package com.interfacee.vehicle;

public class Truck implements Vehicle {
	@Override
	public void accelarate() {
		System.out.println("Accelarating the TRUCK");
		
	}

	@Override
	public void showspeed() {
		System.out.println("Truck going 100 speed");
		
	}

	@Override
	public void brake() {
		System.out.println("Truck applying brakes ");
		
	}

	@Override
	public boolean pollutioncheck() {
		// TODO Auto-generated method stub
		return false;
	}


}
