package com.constructor.chaining;

public class Example1 {
	
	public Example1() {
		this(10,20);
		System.out.println("this is a No parameterised constructor");
	}
	
	public Example1(int a,int b) {
		System.out.println(a+b);
		System.out.println("this is a parameterised conmstructor");
	}

	public static void main(String[] args) {
    new Example1();

	}

}
