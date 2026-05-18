package com.arrays;

import java.util.Arrays;

public class Example5 {

	
	public static boolean isprime(int num) {
		if(num <=1) {
			return false;
		}else {
			for (int i = 2; i*i <= num; i++) {
				if(num%i==0) {
					return false;
				}
			}
			return true;
			
		}
		
	}
	public static void main(String[] args) {
		
  int[] arr=UtilityArray.toarray();
        for (int i : arr) {
			if(isprime(i)) {
				System.out.println(i);
			}
		}  
  
	}

}
