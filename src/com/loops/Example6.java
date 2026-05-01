package com.loops;

public class Example6 {
	//

//First Approach
//	public boolean isPrime(int num) {
//		int count=0;
//		for(int i=1;i<=num;i++) {
//			//  0==0
//			System.out.println(i);
//			if(num%i==0) {
//				count++;//2
//			}
//			
//		}
//		return count==2;//true
//	}
//

	// Second approach
//	public boolean isPrime(int num) {
//		int count = 0;
//		for (int i = 1; i <= num; i++) {
//			if (num % i == 0) {
//				System.out.println(i);
//				count++;
//			}
//			if (count > 2) {
//				return false;
//			}
//		}
//		return true;
//	}
//                             100
//	public boolean isPrime(int num) {
//		if (num <= 1) {
//			return false;
//		}
//		//          
//		for(int i=2;i<num/2	;i++) {
//		System.out.println(i);
//			if(num%i==0) {
//				return false;
//			}
//		}
//		return true;
//		
//	}
	
	//write a java program to find the ugly number or not?

	public static void main(String[] args) {
		Example6 obj = new Example6();

//		System.out.println(obj.isPrime(2) ? "Prime" : "! Prime");
	
//		for(int i=1;i<=1000;i++) {
//			if(obj.isPrime(i)) {
//				System.out.println(i);
//			}
//		}
	}

}
