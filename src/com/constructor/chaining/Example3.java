package com.constructor.chaining;

class A {
	public A(int a) {
		System.out.println("this is grand parent constructor");
	}

}

class B extends A {
	public B(int a) {
	super(a);
		System.out.println("this is  parent constructor");
	}

}

class C extends B {
	public C() {
		super(10);
//		System.out.println("this is child : "+this.a);
		System.out.println("this is child constructor");
	}

}

public class Example3 {
	public static void main(String[] args) {
		new C();
	}

}
