package com.loops;

/**
 * Write a java program to find the amstrong number
 * 
 * to find the power
 * 
 * 153->3
 * 
 * count power sum
 * 
 * 
 */

public class Example5 {
	public int getPower(int base, int exp) {
		int power = 1;// 125
		for (int i = 1; i <= exp; i++) {
			// 25 * 5
			power = power * base;

		}
		return power;
	}

	// 153
	public int getCount(int num) {
		int count = 0;// 3
		while (num != 0) {
			count++;// 3
			num /= 10;
		}
		return count;
	}// 153

	public boolean isAmstrongNumber(int num) {
		int temp = num;// 153
		int count = getCount(num);// 3
		int sum = 0;// 153
		// 153 !=0
		while (num != 0) {
			int base = num % 10;// 1
			// 152+ 1 1 3
			sum = sum + getPower(base, count);
			num /= 10;// 1
		}
		return temp == sum;// true
	}

	public static void main(String[] args) {
//     System.out.println(result?"Amstrong":"! Amstrong");

		for (int i = 0; i < 154; i++) {

			boolean result = new Example5().isAmstrongNumber(i);
			if(result) {
				System.out.println(i);
			}
		}
	}
}
