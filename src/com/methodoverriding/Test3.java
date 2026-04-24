package com.methodoverriding;

class A{
	public void method() {
		System.out.println("A class Object");
	}
}
class B extends A{
	@Override
	public void method() {
		System.out.println("B class Object");
	}
}


class Afactory{
	public Object getObject() {
		return new A();
	}
	
}
class Bfactory extends Afactory{
	public String getObject() {
		return "Hello";
	}
}

public class Test3 {

	public static void main(String[] args) {
		Afactory factory = new Bfactory();
		B b =(B) factory.getObject();
		b.method();
//		Afactory factory=new Afactory();
//	   A a=factory.getObject();// new A();
//	      a.method();
		
//		Bfactory factory=new Bfactory();
//		B b=factory.getObject();
//		b.method();
		
		
	}

}
