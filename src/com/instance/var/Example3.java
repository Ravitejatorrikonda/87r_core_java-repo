package com.instance.var;

public class Example3 {
	              //0  10
	public int a;//0  34  10
	public int b;

	public static void main(String[] args) {
		Example3 obj1 = new Example3();
		Example3 obj2 = new Example3();
		Example3 obj3 = new Example3();
		System.out.println(obj1.a+obj2.a+obj3.a);//0
		System.out.println("After modifying---------");
		
		
		obj1.a=34;
		
		System.out.println(obj1.a+obj2.a+obj3.a);
		               //   34   + 0+      0=34
		      //  0+10//10 
		obj1.a=obj2.a+10;//
		obj2.a=obj1.a;//10
		obj3.a=obj1.a+obj2.a;//20
		System.out.println(obj1.a+obj2.a+obj3.a);
		     //                10+10+20//     40
		
	}

}
