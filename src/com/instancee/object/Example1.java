package com.instancee.object;

public class Example1 {
	
	public int age=25;
	public static String name="10000 coders";
	
	
	public void printData() {
		System.out.println("Sai Ram age : "+age);
	}
	
	

	public static void main(String[] args) {
		Example1 obj1=new Example1();
	    Example1 obj2=new Example1();
	    System.out.println("=======Object 1==========");
	    obj1.age=30;
	    
	    obj1.name="10kcoders";
	    
	    System.out.println(obj1.age);//30
	    obj1.printData();//30
	    System.out.println(obj1.name);//10k coders
	    
	    System.out.println("===============Object 2=========");
	    System.out.println(obj2.age);//25
	    obj2.printData();//25
	    System.out.println(obj2.name);//10k coders
	    
	
		

	}

}
