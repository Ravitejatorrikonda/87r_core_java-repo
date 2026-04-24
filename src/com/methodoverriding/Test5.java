package com.methodoverriding;


class SuperClass{
	public Object getObject() {
		return new Object();
	}
	
}
class SubClass extends SuperClass{
	@Override
	public String getObject() {
		return "Hello world";
	}
}

public class Test5 {

	public static void main(String[] args) {
		    SuperClass sc=new SuperClass();
		   System.out.println( sc.getObject());//adress
		   
		   SuperClass sc2=new SubClass();
		   
//		           String s=(String)sc2.getObject();
//		           System.out.println(s);
//		   
		   System.out.println((String)sc2.getObject());
		   

	}

}
