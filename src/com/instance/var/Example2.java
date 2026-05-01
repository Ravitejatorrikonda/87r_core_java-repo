package com.instance.var;

public class Example2 {
	long a;//43//34
	static boolean b;//true//false
	
	public long getData(long a, long b) {
		System.out.println(a+b);
		return b;
	}

	public static void main(String[] args) {
		
		Example2 obj1=new Example2();
		Example2 obj2=new Example2();
		obj1.a=43;
		obj1.b=true;
//		obj1.getData();
		
		obj2.a=34;
		obj2.b=false;
		  long result=obj2.getData(30, 40);
		
		System.out.println(result);
		
		
		

	}

}
