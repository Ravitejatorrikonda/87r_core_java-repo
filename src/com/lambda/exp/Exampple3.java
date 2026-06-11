package com.lambda.exp;

interface Parent1{
	abstract void getData();
	
}

//class Child implements Parent1{
//	
//	public void getData() {
//		System.out.println("This is child class Method");
//	}
//}
public class Exampple3 {

	public static void main(String[] args) {
		
		
		//anonymous impliments Parent1
	  Parent1 p1=() ->System.out.println("this is anonymous class method");
			
		

	
	//Parent p1=new anonymus();
	p1.getData();

	}

}
