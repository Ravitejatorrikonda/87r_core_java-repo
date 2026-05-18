package com.arrays;

public class Example6 {
	public static boolean isPalindrome(int num) {
		int temp=num;
		int rev=0;
		while(num !=0) {
			int rem=num%10;
			rev=rev*10+rem;
			num /=10;
		}
		return temp==rev;
	}

	public static void main(String[] args) {
		int[] arr=UtilityArray.toarray();
		for (int i : arr) {
			if(isPalindrome(i)) {
				System.out.println(i);
			}
		}

	}

}
