package com.exception.test;

public class Example2 {

	public static void main(String[] args) {

		int [] arr= {1,2,3,4};
		try {
			System.out.println(arr[4]);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		System.out.println("Exception Handiled....");
		
		
		try {
			String str=null;
			System.out.println(str.toUpperCase());
			
			
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		System.out.println("Nullpointer Exception Handiled....");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
