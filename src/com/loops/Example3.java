package com.loops;

public class Example3 {
	/**
	 * 
	 * for loop while loop do while for of
	 * 
	 * 
	 * While loop:- -------------
	 * 
	 * while(Condition){ statements }
	 * 
	 */
	public static boolean print(int num) {
		//121
		int tel = num;
		int rev = 0;//121
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num /= 10;
		}
		//     1213 == 3121->false
		return tel == rev;

	}

	public static void main(String[] args) {
//                         false                         
		System.out.println(print(1213)?"palindrome":"! palindrome");
	}

}
