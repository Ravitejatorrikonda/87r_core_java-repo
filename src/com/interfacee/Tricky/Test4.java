package com.interfacee.Tricky;

interface C1{
	default void print() {
		System.out.println("hello There 1");
	}
	
}
interface D1{
	default void print() {
		System.out.println("hello There 2");
	}
}
class F1 implements C1, D1{
	
	public void print() {
		System.out.println("Hi There");
		C1.super.print();//className.super.method()->   classname.method();
		D1.super.print();
	}
	
}

public class Test4 {

	public static void main(String[] args) {
		F1 f=new F1();
//		f.print();
		C1 c=f;
		D1 d=f;
		
		f.print();
		
		d.print();
		
	}

}
