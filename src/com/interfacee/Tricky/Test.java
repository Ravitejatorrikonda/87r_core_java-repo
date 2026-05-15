package com.interfacee.Tricky;

interface A{
	void getDetails();//public abstract
	
}
interface B{
	boolean isEven(int a);
}
class C implements A, B{

	@Override
	public void getDetails() {
		System.out.println("B class details");
		
	}
	public boolean isEven(int a) {
		return a%2==0;
	}
	
}

public class Test {

	public static void main(String[] args) {
        C c=new C();
        
//        c.getDetails();
//        System.out.println(c.isEven(2));
        
        //dynamic dispatch method->method overriding
        
        A a=c;
        B b=c;
        
        a.getDetails();
        System.out.println(b.isEven(3));
        

	}

}
