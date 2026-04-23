package com.method.overloading;

public class Example2 {
	
//	public void getData(int a) {
//		System.out.println("int");
//	}
	
//	public void getData(long a) {
//		System.out.println("long");
//	}
	
	public void getData(byte a) {
		System.out.println("byte");
	}
	public void getData(Integer a) {
		System.out.println("integer");
	}

	public static void main(String[] args) {
                      new Example2().getData(34);	

	}

}
