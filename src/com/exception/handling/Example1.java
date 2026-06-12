package com.exception.handling;

public class Example1 {

	public static void main(String[] args) {
		try {
			
			// Exception e=new Arithamticexception("/ by zero")
			int i=100/0;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("hello there");
	
		

	}

}
