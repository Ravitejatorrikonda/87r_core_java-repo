package com.anonymouss;

abstract class Employee{
	public abstract void getemp();
}

abstract class Vehicle{
   public abstract void vehicle();
}




public class Example1 {

	public static void main(String[] args) {
		
		Employee emp=new Employee() {
			
			@Override
			public void getemp() {
			System.out.println("Rajesh");
				
			}
		};
		emp.getemp();
		
		
		
		
		Vehicle vh=new Vehicle() {
		
			@Override
			public void vehicle() {
			System.out.println("Honking......");
				
			}
		};
		vh.vehicle();

	}

}
