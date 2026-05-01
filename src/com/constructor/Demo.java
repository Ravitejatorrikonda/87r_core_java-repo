package com.constructor;

public class Demo {
	String name;
	int id;
	
	public Demo(String name, int id) {
		this.name=name;
		this.id=id;
	}

	public void getdetails() {
		System.out.println("Student Name : "+name);
		System.out.println("Student id : "+id);
	}

	public static void main(String[] args) {
		Demo obj=new Demo("Rajesh", 100);
		
		obj.getdetails();

	}

}
