package com.abstractions;

public class VehicleMain {

	public static void main(String[] args) {
		Vehicle vh;
		
		vh=new Car("Innova", 10, "Toyota", 4, "Yes");
     vh.startEngine();	
     vh.fuelType();

	}

}
