package com.method.overloading;


class A{
	public void print(long a) {
		System.out.println("Parent class");
	}
	
}
class B extends A{
	public void print(int  a) {
		System.out.println("child");
	}
}


public class Example3 {

	public static void main(String[] args) {
		   A a=new A();
		   
		   a.print(34);

	}

}
