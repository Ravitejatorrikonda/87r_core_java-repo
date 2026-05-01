package com.loops;

public class Example4 {
	public static boolean isNeonNumber(int num) {
		int square=num*num;//81
		int sum=0;//1
		
		while(square !=0) {
			sum=sum+square%10;
			square /=10;
		}
		return num==sum;
	}
	
	
	public static void main(String[] args) {
//		boolean result=isNeonNumber(9);
//		System.out.println(result?"Neon":"! Neon");
		for(int i=1;i<=100;i++) {
			boolean result=isNeonNumber(i);
			if(result) {
				System.out.println(i);
			}
		}
		
	}

}
