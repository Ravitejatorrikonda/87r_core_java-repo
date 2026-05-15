package com.interfacee.Tricky;

interface X{
	void print();
	
}
interface Y{
	void print();
}
class Z implements X, Y{

	@Override
	public void print() {
		System.out.println("hello World");
		
	}
	
}

public class Test2 {

	public static void main(String[] args) {
		X x=new Z();
		x.print();

	}

}
