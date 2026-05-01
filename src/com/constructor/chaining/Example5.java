package com.constructor.chaining;

import java.io.ObjectInputStream.GetField;

class E{
	int a;
	
	public void getData(int a) {
		System.out.println(a);
		System.out.println("this is parent class method ");
	}
}
class F extends E{
//	int a;
	public void getData() {

//		System.out.println(a);
		super.getData(a);
		System.out.println("this is child class method");
	}
}


//
//class Parent{
//	public Parent() {
//		System.out.println("this is parent");
//	}
//	
//}
//class Child1 extends Parent{
//
//	public Child1() {
//		super();
//		System.out.println("This is child1 constructor");
//	}
//	
//}
//class Child2 extends Parent{
//	public Child2() {
//		super();
//		System.out.println("this is Child2 constructor");
//	}
//}
public class Example5 {

	public static void main(String[] args) {
//	new Child2();
		
		
	F f=new F();
	f.getData(10);

	}

}
