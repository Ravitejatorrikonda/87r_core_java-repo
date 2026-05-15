package com.interfacee.Tricky;


interface Vehicle{
	void start();
	void stop();
	public default void digitalmeter() {
		System.out.println("Digital Meter");
	}
}


class Car implements Vehicle{

	@Override
	public void start() {
		System.out.println("Car started");
		
	}
	@Override
	public void digitalmeter() {
		System.out.println("Digital Meter");
	}

	@Override
	public void stop() {
		System.out.println("Car stoped");
		
	}
	
}
class Bike implements Vehicle{

	@Override
	public void start() {
		System.out.println("Bike Started");
		
	}

	@Override
	public void stop() {
	System.out.println("bike Stoped");
		
	}
	
}
public class Example {

	public static void main(String[] args) {
		Vehicle vh;
		
		vh=new Car();
		vh.start();
		vh.stop();
		vh.digitalmeter();

	}

}
