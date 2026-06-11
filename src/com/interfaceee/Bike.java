package com.interfaceee;

public class Bike implements Vehicle {
	
	public void speed() {
		System.out.println("Bike moving speed of 60 kmph");
	}
	@Override
	public void digitalScreen() {
		System.out.println("this is digital screen only new bike.....");
	}

}
