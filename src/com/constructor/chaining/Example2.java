package com.constructor.chaining;

class X{
	public X(int a) {
		System.out.println("this is parent class constructor");
	}

	public X() {
		this(10);
		System.out.println("this is no parameterized parent constructor");
	}
	
}

class Y extends X{
	public Y() {
	        this(10);
	        
		System.out.println("this is child class constructor");
	}
	public Y(int a) {
		super();
		System.out.println(a);
	}
	
}

//
public class Example2 {

	public static void main(String[] args) {
		new Y();

	}

}
