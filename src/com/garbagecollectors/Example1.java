package com.garbagecollectors;

public class Example1 {
	int a=10;

	public static void main(String[] args) {
		Example1 e=new Example1();
		
		e.a=20;
		System.out.println(e.a);
		
		e=new Example1();
		e=null;
		
		Example1 e2=new Example1();
		System.out.println(e2.a);
		
//		System.gc();
//		Runtime.getRuntime().gc();
		
                
	}

}
