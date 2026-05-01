package com.loops;

public class Example1 {
	public static void print(int num) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + "X" + i + "=" + (num * i));
		}
	}

	public static void main(String[] args) {
//	    print(7);
//		int i=1;
//		for(;i<=11;i++) {
//			System.out.println(i);
//		}
//		System.out.println(i);

//		for(int i=5;;i++) {
//			System.out.println(i);
//		}
//
//		for (int i = 5; false; i++) {
//			System.out.println("Hello there");
//		}
//	   
		
//		for(int a=10;a>=1;a--) {
//			System.out.println(a);//10 9 8.....1 0 -1
//		}
//		for(int i=1;i<=10;i +=2) {
//			System.out.println(i);
//		}
		
//		for(int i=1;i!=11;i++) {
//			System.out.println(i);
//		}
		
		for(int i=1;i<=20;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		

	}

}
