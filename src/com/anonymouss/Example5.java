package com.anonymouss;


interface EvenOdd{
	abstract boolean isEven(int num);
}
public class Example5 {
//int [] arr={1,1,1,2,3,3,4,7,7,5,8,9}
//	o/p:-[1,2,3,4,7,5,8,9]
	
	
	
	public static void main(String[] args) {
		EvenOdd e=new EvenOdd() {
			
			@Override
			public boolean isEven(int num) {
				
				return num%2==0;
			}
		};
		System.out.println(e.isEven(2)?"Even ":"Odd");

	}

}
