package com.methodoverriding;

//class X{
//	public  String printdataInUpperCase(String str) {
//		return str.toUpperCase();
//	}
//	
//}
//class Y extends X{
//   @Override
//	public  String printdataInUpperCase(String str) {
//		return "34";
//	}
//}

class X{
	 public void printData() {
		System.out.println("Parent...");
	}
}
class Y extends X{

	@Override
	public void printData() {
		System.out.println("Child....");
	}
}
public class Test2 {

	public static void main(String[] args) {
		
		X x=new Y();
		

	}

}
