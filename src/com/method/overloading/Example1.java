package com.method.overloading;

public class Example1 {
	
	public void print(int a, int b) {
		System.out.println("int : "+ (a+b));
	}
	public void print(short a, short b) {
		System.out.println("Short : "+(a+b));
	}
	public void print(double a,double b) {
		System.out.println("double : "+(a+b));
	}
	public void print(float a, float b) {
		System.out.println("Float : "+(a+b));
	}

	public static void main(String[] args) {
		
		
    new Example1().print(30.0,20.0f);		

	}

}
