package com.lambda.exp1;

interface check {
	boolean checkNum(int n);
}

interface CharCheck {
	void checkChar(char ch);
}

public class Example3 {

	public static boolean isPrime(int num) {

		if (num == 1) {
			return false;
		}
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {

				return false;

			}
		}
		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check ch = n -> isPrime(n);
		System.out.println(ch.checkNum(3) ? "Prime" : "! Prime");
		
		

		CharCheck c = chh -> System.out.println(isPrime(chh) ? "Prime" : "! Prime ");
		c.checkChar('A');

	}

}
