package com.instance.var;

public class Example1 {
	
	int a;
	boolean b;
	
	public boolean printData() {
		System.out.println(a);//34 34
		return b;
	}
	
	public static void main(String[] args) {
		Example1 obj1=new Example1();
		Example1 obj2=new Example1();
		
		obj1.a=34;
		obj1.b=true;
		 boolean result=obj1.printData();
		 System.out.println(result);//true
		 
		 obj2.a=obj1.a;
		 obj2.b=false;
		boolean result2=obj2.printData();
		System.out.println(result2);
		

	}

}
