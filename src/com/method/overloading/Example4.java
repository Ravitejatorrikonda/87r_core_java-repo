package com.method.overloading;

class C{}

class D extends C{}

public class Example4 {
	
	public void print(C c) {
		System.out.println(" c object");
	}
	public void print(D d) {
		System.out.println(" d Object");
	}
	

	public static void main(String[] args) {
		
		
		new Example4().print(new D());
	}
	

}
