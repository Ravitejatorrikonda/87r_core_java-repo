package com.interfacee.Tricky;

class A1{
	public static void print() {
		System.out.println("Hello World");
	}
	
}
class B1 extends A1{}

interface X1{
	public static void printer() {
		System.out.println("Hi there");
	}
	
}
class Y1 implements X1{
	public void getdata() {
	    X1.printer();
	}
}


public class Test3 {

	public static void main(String[] args) {
		A1.print();
		B1.print();

		
		System.out.println("----------------");
		
		X1.printer();
//		Y1.printer();
	}

}
