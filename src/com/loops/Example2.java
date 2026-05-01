package com.loops;
/**
 * 
 * write a java program to find the even number s and odd numbers upto 20;
 * method name->display(int num)
 * o/p:-even numbers : 2 4 6 8 10 .........
 *      odd Numbers : 1 3 5 7 9........
 * 
 * 
 * 
 */
public class Example2 {
	public static void print(int num,int value) {
		System.out.println(num+"X"+value+"="+num*value);
	}

	public int data(int num) {
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum +=i;
		}
		return sum;
	}
	
	public static void getEven(int num) {
		for(int i=num;i>=1;i--) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
	
	public static void getOdd(int num) {
		for(int i=1;i<=num;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}
	
	
	
	
	public static void printdata(int num) {
		for(int i=1;i<=num;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println(i);
			}
		}
	}
	
	
	
	
	public static void display(int num) {
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
	}
	
	
	
	public static void main(String[] args) {
//		for(int i=1;i<=10;i++) {
//			print(7, i);
//		}

	int result=	new Example2().data(20);
//	System.out.println(result);
		
//	getEven(200);
//	getOdd(200);
	
//	printdata(200);
	display(200);
		
	}

}
